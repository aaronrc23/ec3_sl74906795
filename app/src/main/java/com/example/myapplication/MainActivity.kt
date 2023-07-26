package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.Retrofit.RetrofitPersonajes
import com.example.myapplication.databinding.ActivityMainBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    val retroftiTraer = RetrofitPersonajes.consumirApi.getTraer()
    retroftiTraer.enqueue(object : Callback<List<Personajes>>{
        override fun onResponse(call: Call<List<Personajes>>, response: Response<List<Personajes>>) {
            binding.txthello.text = response.body().toString()
        }

        override fun onFailure(call: Call<List<Personajes>>, t: Throwable) {
            Toast.makeText(this@MainActivity, "Error al consultar Api Rest", Toast.LENGTH_SHORT).show()
        }
    })
    }
}