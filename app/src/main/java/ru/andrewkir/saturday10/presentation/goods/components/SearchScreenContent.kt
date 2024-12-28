package ru.andrewkir.saturday10.presentation.goods.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ru.andrewkir.saturday10.R
import ru.andrewkir.saturday10.data.models.SearchModel
import ru.andrewkir.saturday10.presentation.goods.contract.GoodsEvent_2
import ru.andrewkir.saturday10.presentation.goods.contract.GoodsState_2

@Composable
fun SearchScreenContent(
  uiState: GoodsState_2,
  onEvent: (GoodsEvent_2) -> Unit,
) {
  Column (modifier = Modifier){
    Column(
      modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally
    ) {

    LazyColumn {
      uiState.search.forEach { item ->
        item {
          GoodsCard(item, onEvent)
        }
      }
    }
  }
}
}

@Preview
@Composable
private fun SearchScreenContentPreview() {
  SearchScreenContent(
    uiState = GoodsState_2(
      goodsName = "test",
      goods = listOf(
        SearchModel(
          name = "Name",
          imageURL = "",
          date = "",
          description = ""
        )
      )
    )
  ) { _ -> }
}
