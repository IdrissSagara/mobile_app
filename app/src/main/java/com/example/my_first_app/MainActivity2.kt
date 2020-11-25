package com.example.my_first_app

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.my_first_app.repository.Repository

class MainActivity2 : AppCompatActivity() {
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_main)

        val repository = Repository()
        val viewModelFactory = MainViewModelFactory(repository)
        viewModel = ViewModelProvider(this, viewModelFactory).get(MainViewModel::class.java)
        viewModel.getPost()
        viewModel.myResponse.observe(this, Observer { response  ->
            if (response.isSuccessful) {
                Log.d("response", response.body()?.userId.toString())
                Log.d("response", response.body()?.id.toString())
                //Log.d("response", response.body()?.title!!)
                Log.d("response", response.body()?.body!!)
            } else {
                Log.d("response", response.errorBody().toString())
            }
        })
    }
}