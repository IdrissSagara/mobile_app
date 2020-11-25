package com.example.my_first_app.repository

import com.example.my_first_app.api.RetrofitInstance
import com.example.my_first_app.model.Post
import retrofit2.Response

class Repository {
    suspend fun getPost(): Response<Post> {
       return RetrofitInstance.api.getPost()
    }
}