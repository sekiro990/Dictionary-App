package com.example.dictionary.feature_dictionary.data.local

import androidx.room.ProvidedTypeConverter
import androidx.room.TypeConverter
import com.example.dictionary.feature_dictionary.data.util.GsonParser
import com.example.dictionary.feature_dictionary.data.util.JsonParser
import com.example.dictionary.feature_dictionary.domain.models.Meaning
import com.google.gson.reflect.TypeToken
@ProvidedTypeConverter
class Converters(
    private val jsonParser: GsonParser
) {
    @TypeConverter
    fun fromMeaningsJson(json:String): List<Meaning>{
        return jsonParser.fromJson<ArrayList<Meaning>>(
            json,
            object:TypeToken<ArrayList<Meaning>>(){}.type
        )?: emptyList()
    }
    @TypeConverter
    fun toMeaningsJson(meanings:List<Meaning>):String{
        return jsonParser.toJson(
            meanings,
            object:TypeToken<ArrayList<Meaning>>(){}.type
        )?:"[]"
    }
}