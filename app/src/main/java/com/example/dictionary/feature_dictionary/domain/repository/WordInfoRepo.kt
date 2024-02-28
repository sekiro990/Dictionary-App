package com.example.dictionary.feature_dictionary.domain.repository

import com.example.dictionary.core.util.Resource
import com.example.dictionary.feature_dictionary.domain.models.WordInfo
import kotlinx.coroutines.flow.Flow

interface WordInfoRepo {
    fun getWordInfo(word:String): Flow<Resource<List<WordInfo>>>
}