package ru.andrewkir.saturday10.presentation.details.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ramcosta.composedestinations.annotation.Destination
import ru.andrewkir.saturday10.data.models.SearchModel

@Destination
@Composable
fun DetailsScreenContentt(
  search: SearchModel,
) {
  Column {
    Text("Имя запроса: ${search.name}!", fontSize = 24.sp)
    Spacer(modifier = Modifier.height(10.dp))
    Text("Дата запроса: ${search.date}!", fontSize = 24.sp)
    Spacer(modifier = Modifier.height(10.dp))
    Text("Описание запроса: ${search.description}!", fontSize = 24.sp)
    Spacer(modifier = Modifier.height(10.dp))
  }
}