package com.example.my_first_app.model

import com.google.gson.annotations.SerializedName

data class Post(
        @SerializedName("userId")
        val userId: Int,
        val id: Int,
        val title: String,
        val body: String
)