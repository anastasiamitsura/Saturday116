package ru.andrewkir.saturday10.presentation.goods.contract

import ru.andrewkir.saturday10.data.models.SearchModel

sealed class GoodsEvent_2 {

  data class UpdateGoodsTextField(val text: String): GoodsEvent_2()
  data class UpdateGoodsDateField(val date: String): GoodsEvent_2()
  data class OnSearchItemClick(val query: SearchModel): GoodsEvent_2()
  data object AddButtonClicked: GoodsEvent_2()
}