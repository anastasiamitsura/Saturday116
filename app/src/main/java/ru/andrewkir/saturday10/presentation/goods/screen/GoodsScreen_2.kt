package ru.andrewkir.saturday10.presentation.goods.screen

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.lifecycle.viewmodel.compose.viewModel
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import kotlinx.coroutines.flow.collectLatest
import ru.andrewkir.saturday10.presentation.destinations.DetailsScreenContentDestination
import ru.andrewkir.saturday10.presentation.goods.components.GoodsScreenContent
import ru.andrewkir.saturday10.presentation.goods.components.SearchScreenContent
import ru.andrewkir.saturday10.presentation.goods.contract.GoodsEffect.OpenDetails
import ru.andrewkir.saturday10.presentation.goods.contract.GoodsEffect_2
import ru.andrewkir.saturday10.presentation.goods.viewmodels.GoodsViewModel
import ru.andrewkir.saturday10.presentation.goods.viewmodels.GoodsViewModel_2

@Destination
@Composable
fun GoodsScreen_2(
  navigator: DestinationsNavigator,
) {

  val viewModel = viewModel<GoodsViewModel_2>()

  val state by viewModel.state.collectAsState()

  SearchScreenContent(
    uiState = state,
    onEvent = viewModel::handleEvent
  )

  LaunchedEffect(viewModel.effect) {
    viewModel.effect.collectLatest { effect ->
      when (effect) {
        is GoodsEffect_2.OpenDetails_2 -> {
          //navigator.navigate(DetailsScreenContenttDestination(user = effect.item))
        }
      }
    }
  }
}