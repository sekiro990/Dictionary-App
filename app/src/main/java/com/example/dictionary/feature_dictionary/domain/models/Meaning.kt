package com.example.dictionary.feature_dictionary.domain.models

data class Meaning(
    val definition: List<Definition>,
    val partOfSpeech:String
)
