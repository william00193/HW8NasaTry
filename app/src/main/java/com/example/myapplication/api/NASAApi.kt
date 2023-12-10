package com.example.myapplication.api

import android.widget.Toast
import retrofit2.http.GET

private const val API_KEY = "a5Qn5reNAPxJFWmzLCJ5S3RlvkUvqcl0qdg8mvgI"

interface NASAApi {


//For NASA
@GET(   "apod" +
        "?api_key=$API_KEY" +
        "&count=100")


suspend fun fetchPhotos(): List<GalleryItem>

}



//https://api.nasa.gov/planetary/apod?api_key=a5Qn5reNAPxJFWmzLCJ5S3RlvkUvqcl0qdg8mvgI&count=100

