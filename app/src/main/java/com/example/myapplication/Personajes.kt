package com.example.myapplication

data class Personajes(
    val _id: String,
    val allies: List<String>,
    val enemies: List<Any>,
    val name: String,
    val photoUrl: String
)