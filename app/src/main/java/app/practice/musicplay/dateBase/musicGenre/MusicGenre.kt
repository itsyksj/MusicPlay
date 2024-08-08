package app.practice.musicplay.dateBase.musicGenre

import androidx.room.Entity
import androidx.room.ForeignKey
import app.practice.musicplay.dateBase.genre.Genre
import app.practice.musicplay.dateBase.music.Music

@Entity(
    tableName = "MusicGenre",
    foreignKeys = [
        ForeignKey(
            entity = Music::class,
            parentColumns = ["musicId"],
            childColumns = ["musicId"],
            onDelete = ForeignKey.CASCADE
        ),
        ForeignKey(
            entity = Genre::class,
            parentColumns = ["genreId"],
            childColumns = ["genreId"],
            onDelete = ForeignKey.CASCADE
        )
    ]
)
data class MusicGenre(
    val musicId: Int,
    val genreId: Int
)