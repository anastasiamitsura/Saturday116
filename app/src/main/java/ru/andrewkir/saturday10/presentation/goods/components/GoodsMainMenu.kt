package ru.andrewkir.saturday10.presentation.goods.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.SearchBar
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import ru.andrewkir.saturday10.R
import ru.andrewkir.saturday10.data.models.GoodsItemModel
import ru.andrewkir.saturday10.data.models.SearchModel
import ru.andrewkir.saturday10.presentation.goods.contract.GoodsEvent_2
import ru.andrewkir.saturday10.presentation.goods.contract.GoodsState_2

@Composable
fun GoodsMainMenu(
    //uiState: GoodsState_2,
    onEvent: (GoodsEvent_2) -> Unit,
    navigator: DestinationsNavigator){
//) {
//    Column (modifier = Modifier.fillMaxHeight()){
//        Column(
//            modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally
//        ) {
//            Button(
//                modifier = Modifier.width(200.dp).padding(10.dp).height(60.dp),
//                onClick = {
//                    navigator.navigate(Destination.GoodsScreen())
//                }) {
//                Text(text = "Show Users")
//            }
//            Button(
//                modifier = Modifier.width(200.dp).padding(10.dp).height(60.dp),
//                onClick = {
//                    onEvent(GoodsEvent_2.AddButtonClicked)
//                }) {
//                Text(text = "Show Objects")
//            }
//            Button(
//                modifier = Modifier.width(200.dp).padding(10.dp).height(60.dp),
//                onClick = {
//                    onEvent(GoodsEvent_2.AddButtonClicked)
//                }) {
//                Text(text = "Add User")
//            }
//            Button(
//                modifier = Modifier.width(200.dp).padding(10.dp).height(60.dp),
//                onClick = {
//                    onEvent(GoodsEvent_2.AddButtonClicked)
//                }) {
//                Text(text = "Add Object")
//            }
//        }
//
//    }
}
