package com.example.myapplication.api

import androidx.paging.PagedList
import com.example.myapplication.PhotoRepository
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import retrofit2.http.GET

private const val API_KEY = "38966820aba3820d74f6b3121335fe3d"

interface FlickrAPI {

//For Flickr
//    @GET(
//        "services/rest/?method=flickr.interestingness.getList" +
//                "&api_key=$API_KEY" +
//                "&format=json" +
//                "&page=4"+
//                "&per_page=100"+
//                "&nojsoncallback=1" +
//                "&extras=url_s"
//    )


//For NASA
@GET("planetary/apod" +
        "?api_key=a5Qn5reNAPxJFWmzLCJ5S3RlvkUvqcl0qdg8mvgI" +
        "&count=200")


//For Pixabay
//    @GET("api/?key=40895557-d49a07cca955c5315c2bae711" +
//            "&q=panda" +
//            "&format=json" +
//            "&page=4"+
//            "&per_page=100"+
//            "&nojsoncallback=1"
//    )


suspend fun fetchPhotos(): FlickrResponse

}


//https://api.nasa.gov/planetary/apod?api_key=a5Qn5reNAPxJFWmzLCJ5S3RlvkUvqcl0qdg8mvgI&count=100
//https://pixabay.com/api/?key=40895557-d49a07cca955c5315c2bae711&q=bear&format=json&nojsoncallback=1

