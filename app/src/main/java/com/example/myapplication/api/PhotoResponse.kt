package com.example.myapplication.api

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass




//For NASA
@JsonClass(generateAdapter = true)
data class PhotoResponse(

     val galleryItems: List<GalleryItem>

)



