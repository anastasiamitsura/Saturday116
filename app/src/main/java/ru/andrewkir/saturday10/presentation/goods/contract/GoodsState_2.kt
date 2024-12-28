package ru.andrewkir.saturday10.presentation.goods.contract

import ru.andrewkir.saturday10.data.models.GoodsItemModel
import ru.andrewkir.saturday10.data.models.SearchModel
import ru.andrewkir.saturday10.data.models.UserModel

data class GoodsState_2(
  val goodsName: String = "",
  val goodsDate: String = "",
  val goods: List<SearchModel> = emptyList(),
  val search: List<SearchModel> = emptyList()
)