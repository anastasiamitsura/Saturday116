package ru.andrewkir.saturday10.presentation.goods.contract

import ru.andrewkir.saturday10.data.models.SearchModel

sealed interface GoodsEffect_2 {

  data class OpenDetails_2(val item: SearchModel): GoodsEffect_2

}