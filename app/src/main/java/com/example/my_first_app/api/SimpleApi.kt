package com.example.my_first_app.api

import com.example.my_first_app.model.Post
import retrofit2.Response
import retrofit2.http.GET

interface SimpleApi {
    @GET("posts/1")
    suspend fun getPost(): Response<Post>
}