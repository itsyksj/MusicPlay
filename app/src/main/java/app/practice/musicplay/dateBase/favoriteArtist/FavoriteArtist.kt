package app.practice.musicplay.dateBase.favoriteArtist

import androidx.room.Entity
import androidx.room.ForeignKey
import app.practice.musicplay.dateBase.artist.Artist
import app.practice.musicplay.dateBase.user.User

@Entity(
    tableName = "FavoriteArtist",
    foreignKeys = [
        ForeignKey(
            entity = User::class,
            parentColumns = ["userId"],
            childColumns = ["userId"],
            onDelete = ForeignKey.CASCADE
        ),
        ForeignKey(
            entity = Artist::class,
            parentColumns = ["artistId"],
            childColumns = ["artistId"],
            onDelete = ForeignKey.CASCADE
        )
    ]
)
data class FavoriteArtist(
    val userId: Int,
    val artistId: Int
)