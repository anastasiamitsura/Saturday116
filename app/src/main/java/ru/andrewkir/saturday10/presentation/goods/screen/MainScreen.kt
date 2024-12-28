package ru.andrewkir.saturday10.presentation.goods.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import kotlinx.coroutines.flow.collectLatest
import ru.andrewkir.saturday10.presentation.destinations.GoodsScreenDestination
import ru.andrewkir.saturday10.presentation.goods.components.GoodsMainMenu
import ru.andrewkir.saturday10.presentation.goods.components.GoodsScreenContent
import ru.andrewkir.saturday10.presentation.goods.contract.GoodsEffect_2.OpenDetails_2
import ru.andrewkir.saturday10.presentation.goods.contract.GoodsEvent_2
import ru.andrewkir.saturday10.presentation.goods.viewmodels.GoodsViewModel_2

@Destination(start = true)
@Composable
fun MainScreen(
  //uiState: GoodsState_2,
  //onEvent: (GoodsEvent_2) -> Unit,
  navigator: DestinationsNavigator
) {
  Column (modifier = Modifier.fillMaxHeight()){
    Column(
      modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally
    ) {
      Button(
        modifier = Modifier.width(200.dp).padding(10.dp).height(60.dp),
        onClick = {
          navigator.navigate(GoodsScreenDestination)
        }) {
        Text(text = "Show Users")
      }
      Button(
        modifier = Modifier.width(200.dp).padding(10.dp).height(60.dp),
        onClick = {
          //navigator.navigate(GoodsScreen_2Destination)
        }) {
        Text(text = "Show Objects")
      }
      Button(
        modifier = Modifier.width(200.dp).padding(10.dp).height(60.dp),
        onClick = {
          navigator.navigate(GoodsScreenDestination)
        }) {
        Text(text = "Add User")
      }
      Button(
        modifier = Modifier.width(200.dp).padding(10.dp).height(60.dp),
        onClick = {
          //navigator.navigate(GoodsScreen_2Destination)
        }) {
        Text(text = "Add Object")
      }
    }

  }
}
