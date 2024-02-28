package com.example.dictionary.feature_dictionary.data.remote.dto

import com.example.dictionary.feature_dictionary.domain.models.Definition
import com.example.dictionary.feature_dictionary.domain.models.Meaning

data class MeaningDto(
    val antonyms: List<Any>,
    val definitions: List<DefinitionDto>,
    val partOfSpeech: String,
    val synonyms: List<String>
){
    fun toMeaning():Meaning{
        return Meaning(
            definition = definitions.map { it.toDefinition() },
            partOfSpeech = partOfSpeech
        )
    }
}