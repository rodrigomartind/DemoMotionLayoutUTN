package com.rodrigodominguez.rappitest.filmdetail.data

import java.io.Serializable

data class SpokenLanguage(
    val iso_639_1: String,
    val name: String
) : Serializable