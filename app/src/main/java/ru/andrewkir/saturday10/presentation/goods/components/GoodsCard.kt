package ru.andrewkir.saturday10.presentation.goods.components

import android.util.Log
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import ru.andrewkir.saturday10.R
import ru.andrewkir.saturday10.data.models.GoodsItemModel
import ru.andrewkir.saturday10.data.models.SearchModel
import ru.andrewkir.saturday10.data.models.UserModel
import ru.andrewkir.saturday10.presentation.goods.contract.GoodsEvent
import ru.andrewkir.saturday10.presentation.goods.contract.GoodsEvent_2

@OptIn(ExperimentalGlideComposeApi::class)
@Composable
fun GoodsCard(
  searchModel: SearchModel,
  onEvent: (GoodsEvent_2) -> Unit,
) {
  ElevatedCard(
    onClick = {
      onEvent(GoodsEvent_2.OnSearchItemClick(searchModel))
    }
  ) {
    GlideImage(
      model = searchModel.imageURL,
      contentDescription = null,
    )

    Row(
      modifier = Modifier.fillMaxWidth(),
      verticalAlignment = Alignment.CenterVertically,
    ) {
      Text(
        modifier = Modifier
          .padding(start = 12.dp, top = 16.dp, bottom = 16.dp),
        text = searchModel.name,
        fontSize = 24.sp
      )
      Spacer(modifier = Modifier.weight(1f))
    }

    Row {
      Text(
        modifier = Modifier.padding(14.dp),
        text = searchModel.date,
        fontSize = 20.sp
      )

      Spacer(modifier = Modifier.weight(1f))

      Button(
        modifier = Modifier.padding(end = 14.dp),
        onClick = {
          Log.d("MYTAG", "On button clicked")
        }
      ) {
        Text(text = "Подробнее")
      }
    }
  }
}

@Composable
@Preview
private fun UserCardPreview() {
  GoodsCard(
    SearchModel("test", "25.09.09", "бла бла бла", "https://vkplay.ru/pre_0x736_resize/hotbox/content_files/article/2021/01/27/b4ba922982214de7926fb5f1ee706e6a.jpg?quality=85"), {

    }
  )
}
