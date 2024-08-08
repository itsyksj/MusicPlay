package app.practice.musicplay.dateBase.track

import androidx.room.Entity
import androidx.room.ForeignKey
import app.practice.musicplay.dateBase.music.Music
import app.practice.musicplay.dateBase.playList.PlayList

@Entity(
    tableName = "Track",
    primaryKeys = ["trackId", "playListId"],
    foreignKeys = [
        ForeignKey(
            entity = PlayList::class,
            parentColumns = ["playListId"],
            childColumns = ["playListId"],
            onDelete = ForeignKey.CASCADE
        ),
        ForeignKey(
            entity = Music::class,
            parentColumns = ["musicId"],
            childColumns = ["musicId"],
            onDelete = ForeignKey.CASCADE
        )
    ]
)
data class Track(
    val trackId: Int,
    val playListId: Int,
    val musicId: Int,
    val trackTotal: Int,
    var trackIndex: Int
)