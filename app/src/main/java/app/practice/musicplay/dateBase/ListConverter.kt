package app.practice.musicplay.dateBase

import androidx.room.TypeConverter

class ListConverter {
    @TypeConverter
    fun fromListToString(list: List<String>?): String? {
        return list?.joinToString(separator = ",")
    }

    @TypeConverter
    fun fromStringToList(data: String?): List<String>? {
        return data?.split( ",")?.map { it.trim() }
    }
}