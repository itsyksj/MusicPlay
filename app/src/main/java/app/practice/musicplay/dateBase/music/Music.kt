package app.practice.musicplay.dateBase.music

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import app.practice.musicplay.dateBase.artist.Artist

@Entity(
    tableName = "Music",
    foreignKeys = [
        ForeignKey(
            entity = Artist::class,
            parentColumns = ["artistId"],
            childColumns = ["artistId"],
            onDelete = ForeignKey.CASCADE
        )
    ]
)
data class Music(
    @PrimaryKey(autoGenerate = true)
    val musicId: Int,
    val artistId: Int,
    val musicTitle: String,
    val musicTime: Int,
    val musicPhoto: String,
    val musicAudio: String,
    val releaseDate: String,
    val composer: String,
    val lyricist: String?,
    val lyrics: String?
)