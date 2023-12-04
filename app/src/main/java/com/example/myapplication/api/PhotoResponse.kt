package com.example.myapplication.api

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass



//@JsonClass(generateAdapter = true)
//data class PhotoResponse(
//     @Json(name = "photo") val galleryItems: List<GalleryItem>
//)


@JsonClass(generateAdapter = true)
data class PhotoResponse(
     val total: Int,
     val totalHits: Int,
     @Json(name = "hits") val galleryItems: List<GalleryItem>
)

