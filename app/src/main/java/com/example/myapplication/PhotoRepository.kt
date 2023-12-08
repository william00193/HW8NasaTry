package com.example.myapplication

import android.provider.Contacts
import android.provider.ContactsContract
import android.util.Log
import android.view.ViewGroup
import androidx.paging.*
import androidx.recyclerview.widget.DiffUtil
import com.example.myapplication.api.GalleryItem
import com.example.myapplication.api.NASAApi
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.create



class PhotoRepository(private val nasaApi: NASAApi) {

    class PhotoPagingSource(private val nasaApi: NASAApi) : PagingSource<Int, GalleryItem>() {

        override suspend fun load(params: LoadParams<Int>): LoadResult<Int, GalleryItem> {
            try {
                val page = params.key ?: 1
                val response = nasaApi.fetchPhotos()
                val photos = response.photos.galleryItems


                if (photos.isEmpty()) {
                    return LoadResult.Error(Exception("No more results"))
                }

                val prevKey = if (page > 1) page - 1 else null
                val nextKey = if (photos.isNotEmpty()) page + 1 else null

                return LoadResult.Page(
                    data = photos,
                    prevKey = prevKey,
                    nextKey = nextKey
                )
            } catch (e: Exception) {
                return LoadResult.Error(e)
            }


        }

        override fun getRefreshKey(state: PagingState<Int, GalleryItem>): Int? {
            return state.anchorPosition?.let { anchorPosition ->
                val anchorPage = state.closestPageToPosition(anchorPosition)
                anchorPage?.prevKey?.plus(1) ?: anchorPage?.nextKey?.minus(1)


            }
        }
    }
}