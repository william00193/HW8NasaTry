package com.example.myapplication.api


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass



@JsonClass(generateAdapter = true)
data class NASAResponse(
   val new: PhotoResponse

)

