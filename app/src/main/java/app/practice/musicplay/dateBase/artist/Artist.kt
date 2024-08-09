package app.practice.musicplay.dateBase.artist

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import app.practice.musicplay.dateBase.artistType.ArtistType

@Entity(
    tableName = "Artist",
    foreignKeys = [
        ForeignKey(
            entity = ArtistType::class,
            parentColumns = ["artistType"],
            childColumns = ["artistType"],
            onDelete = ForeignKey.CASCADE
        )
    ]
)
data class Artist(
    @PrimaryKey(autoGenerate = true)
    val artistId: Int,
    val artistType: Int,
    val artistName: String,
    var member: List<String>,
    val debutDate: String,
    var artistPhoto: String,
    var artistInfo: String,
    var agency: String,
    var official: String,
    var instagram: String,
    var twitter: String
)