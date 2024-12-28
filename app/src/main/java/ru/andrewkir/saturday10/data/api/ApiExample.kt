package ru.andrewkir.saturday10.data.api

import retrofit2.http.GET
import ru.andrewkir.saturday10.data.models.SearchModel
import ru.andrewkir.saturday10.data.models.UserModel

interface ApiExample {

  @GET("/users?since=<string>&per_page=30")
  suspend fun getUsers(): List<UserModel>

  @GET("/search/topics?q=%3Cstring%3E&per_page=30")
  suspend fun getSearch(): List<SearchModel>
}