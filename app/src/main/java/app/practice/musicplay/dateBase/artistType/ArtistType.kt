package app.practice.musicplay.dateBase.artistType

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "ArtistType")
data class ArtistType(
    @PrimaryKey(autoGenerate = false)
    val artistType: Int,
    val gender: Int,
    val group: Boolean
)