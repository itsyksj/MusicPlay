package app.practice.musicplay.dateBase.genre

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Genre")
data class Genre(
    @PrimaryKey(autoGenerate = false)
    val genreId: Int,
    val genreName: String
)