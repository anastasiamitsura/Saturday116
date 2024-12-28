package ru.andrewkir.saturday10.data.models

import androidx.annotation.DrawableRes
import com.google.gson.annotations.SerializedName
import kotlinx.serialization.Serializable

@Serializable
data class SearchModel(

    @SerializedName("name")
    val name: String,

    @SerializedName("created_at")
    val date: String,

    @SerializedName("description")
    val description: String,

    val imageURL: String = ""
)
