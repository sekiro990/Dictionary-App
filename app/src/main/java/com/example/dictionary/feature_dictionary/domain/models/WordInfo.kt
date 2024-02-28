package com.example.dictionary.feature_dictionary.domain.models

data class WordInfo(
    val meanings: List<Meaning>,
    val phonetic: String,
    val word: String
)
