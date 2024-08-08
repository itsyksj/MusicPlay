package app.practice.musicplay.dateBase.playList

import androidx.room.Entity
import androidx.room.ForeignKey
import app.practice.musicplay.dateBase.user.User

@Entity(
    tableName = "PlayList",
    primaryKeys = ["playListId", "userId"],
    foreignKeys = [
        ForeignKey(
            entity = User::class,
            parentColumns = ["userId"],
            childColumns = ["userId"],
            onDelete = ForeignKey.CASCADE
        )
    ]
)
data class PlayList(
    val playListId: Int,
    val userId: Int,
    var playListName: String,
    var playListPhoto: String?
)