package ru.andrewkir.saturday10.presentation.goods.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.launch
import okhttp3.OkHttpClient.Builder
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import ru.andrewkir.saturday10.App
import ru.andrewkir.saturday10.data.api.ApiExample
import ru.andrewkir.saturday10.data.models.SearchModel
import ru.andrewkir.saturday10.presentation.goods.contract.GoodsEffect_2
import ru.andrewkir.saturday10.presentation.goods.contract.GoodsEvent_2.AddButtonClicked
import ru.andrewkir.saturday10.presentation.goods.contract.GoodsEvent_2.UpdateGoodsTextField
import ru.andrewkir.saturday10.presentation.goods.contract.GoodsEvent_2
import ru.andrewkir.saturday10.presentation.goods.contract.GoodsState_2


class GoodsViewModel_2 : ViewModel() {

  val state = MutableStateFlow(GoodsState_2())

  private val _effect = Channel<GoodsEffect_2>()
  val effect = _effect.receiveAsFlow()

  private fun getClient(): ApiExample {
    val httpClient = Builder()
    val logging = HttpLoggingInterceptor()
    logging.setLevel(HttpLoggingInterceptor.Level.BODY)
    httpClient.addInterceptor(logging)
    val retrofit = Retrofit.Builder()
      .baseUrl("https://api.github.com/")
      .addConverterFactory(GsonConverterFactory.create())
      .client(httpClient.build())
      .build()

    return retrofit.create(ApiExample::class.java)
  }

  fun handleEvent(event: GoodsEvent_2) {
    when (event) {
      is UpdateGoodsTextField -> {
        state.value = state.value.copy(goodsName = event.text)
      }

      is GoodsEvent_2.OnSearchItemClick -> {
        viewModelScope.launch {
          _effect.send(GoodsEffect_2.OpenDetails_2(event.query))
        }
      }

      AddButtonClicked -> {
        App.getDatabase()?.clearAllTables()
        val query = getClient()

        viewModelScope.launch {
          try {
            App.getDatabase_2()?.searchDao()?.let { dao ->
              val query = query.getSearch()
//              users.forEach { user ->
//                dao.insert(
//                  User(
//                    id = user.id,
//                    login = user.login
//                  )
//                )
//              }

              state.value = state.value.copy(
                search = query.map {
                  SearchModel(
                    name = it.name,
                    date = it.date,
                    description = it.description
                  )
                },
                goodsName = ""
              )
            }
          } catch (e: Exception) {
            e.printStackTrace()
          }
        }
      }

      is GoodsEvent_2.UpdateGoodsDateField -> {
        state.value = state.value.copy(goodsDate = event.date)
      }
    }
  }

  // if(isNumeric(event.text)) {
  //  state.value = ...
  // }

  fun isNumeric(toCheck: String): Boolean {
    return toCheck.all { char -> char.isDigit() }
  }
}