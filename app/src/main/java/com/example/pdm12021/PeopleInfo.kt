package com.example.pdm12021

class PeopleInfo (
    val people: List<PeopleModel>
)
data class PeopleModel(
    val name: String, val age: Int, val advice: String, val image: String
)


