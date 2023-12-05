package com.example.myapplication.api

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass



//Flickr GalleryItem
//@JsonClass(generateAdapter = true)
//data class GalleryItem(
//    val title: String,
//    val id: String,
//    @Json(name = "url_s") val url: String,
//)


//For NASA
@JsonClass(generateAdapter = true)
data class GalleryItem(
 val date: String,
 val explanation: String,
 @Json(name = "hdurl") val url: String,
 val media_type: String,
 val service_version: String,
 val title: String,
 @Json(name = "url") val url2: String,
)






//@JsonClass(generateAdapter = true)
//data class GalleryItem(
// val id: Int,
// val pageURL: String,
// val type: String,
// val tags: String,
// val previewURL: String,
// val previewWidth: Int,
// val previewHeight: Int,
//
// //What im going to be using for displaying the image in the recycler view
// @Json(name = "webformatURL") val url : String,
// val webformatWidth: Int,
// val webformatHeight: Int,
// val largeImageURL: String,
// val imageWidth: Int,
// val imageHeight: Int,
// val imageSize: Int,
// val views: Int,
// val downloads: Int,
// val collections: Int,
// val likes: Int,
// val comments: Int,
// val user_id: Int,
// val user: String,
// val userImageURL: String,
//)



//Everything NASA Brings back
//{
// "date": "2023-12-05",
// "explanation": "It was one of the most energetic particles ever known to strike the Earth -- but where did it come from?  Dubbed Amaterasu after the Shinto sun goddess, this particle, as do all cosmic rays that strike the Earth's atmosphere, caused an air shower of electrons, protons, and other elementary particles to spray down onto the Earth below. In the featured illustration, a cosmic ray air shower is pictured striking the Telescope Array in Utah, USA, which recorded the Amaterasu event in 2021 May.  Cosmic ray air showers are common enough that you likely have been in a particle spray yourself, although you likely wouldn't have noticed.  The origin of this energetic particle, likely the nucleus of an atom, remains a mystery in two ways. First, it is not known how any single particle or atomic nucleus can practically acquire so much energy, and second, attempts to trace the particle back to where it originated did not indicate any likely potential source.    Open Science: Browse 3,200+ codes in the Astrophysics Source Code Library",
// "hdurl": "https://apod.nasa.gov/apod/image/2312/Exaray_OsakaU_1500.jpg",
// "media_type": "image",
// "service_version": "v1",
// "title": "Energetic Particle Strikes the Earth",
// "url": "https://apod.nasa.gov/apod/image/2312/Exaray_OsakaU_1080.jpg"
//}


//Everything that pixabay brings back
//"id": 1236875,
//"pageURL": "https://pixabay.com/photos/animal-panda-mammal-species-fauna-1236875/",
//"type": "photo",
//"tags": "animal, panda, mammal",
//"previewURL": "https://cdn.pixabay.com/photo/2016/03/04/22/54/animal-1236875_150.jpg",
//"previewWidth": 150,
//"previewHeight": 99,
//"webformatURL": "https://pixabay.com/get/gc33231df327522365b1191fc08d74bafc0979676c7082659bf669a902494e74ac7cdfec1b879b67f5e1c89a35533ea12a6367aa0be3f7fc792b98f484d35f9e6_640.jpg",
//"webformatWidth": 640,
//"webformatHeight": 426,
//"largeImageURL": "https://pixabay.com/get/gbf733f1079c22701ffcfb90569c099a875da826b01cd556c0451a26bccde95d96348a4f3e2645f7915a404de7999219121c548445dcf3ff62ad4102deea7ae2d_1280.jpg",
//"imageWidth": 3456,
//"imageHeight": 2304,
//"imageSize": 1684392,
//"views": 208359,
//"downloads": 127177,
//"collections": 419,
//"likes": 483,
//"comments": 75,
//"user_id": 2163857,
//"user": "Cimberley",
//"userImageURL": "https://cdn.pixabay.com/user/2016/03/04/23-10-07-96_250x250.jpg"