package app.practice.musicplay.dateBase.currentTrack

import androidx.room.Entity
import androidx.room.ForeignKey
import app.practice.musicplay.dateBase.playList.PlayList
import app.practice.musicplay.dateBase.track.Track
import app.practice.musicplay.dateBase.user.User

@Entity(
    tableName = "CurrentTrack",
    primaryKeys = ["userId", "playListId"],
    foreignKeys = [
        ForeignKey(
            entity = User::class,
            parentColumns = ["userId"],
            childColumns = ["userId"],
            onDelete = ForeignKey.CASCADE
        ),
        ForeignKey(
            entity = PlayList::class,
            parentColumns = ["playListId"],
            childColumns = ["playListId"],
            onDelete = ForeignKey.CASCADE
        ),
        ForeignKey(
            entity = Track::class,
            parentColumns = ["trackIndex"],
            childColumns = ["trackIndex"],
            onDelete = ForeignKey.CASCADE
        )
    ]
)
data class CurrentTrack(
    val userId: Int,
    val playListId: Int,
    var playState: Boolean = false,
    var trackIndex: Int,
    var currentTime: Int = 0
)