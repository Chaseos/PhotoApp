package com.chase.photoapp.api

import com.chase.photoapp.models.PhotoList
import retrofit2.Call
import retrofit2.http.GET

interface PhotoAPI {
    @GET("?key=707634-6b1d986fdd2d464ef7b2cf4b4&q=nature&image_type=photo")
    fun getPhotos() : Call<PhotoList>
}