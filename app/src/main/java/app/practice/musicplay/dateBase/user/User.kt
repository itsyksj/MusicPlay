package app.practice.musicplay.dateBase.user

import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(
    tableName = "User",
    indices = [
        Index(
            value = ["userName"],
            unique = true
        ),
        Index(
            value = ["userPhone"],
            unique = true
        )
    ]
)
data class User(
    @PrimaryKey(autoGenerate = true)
    val userId: Int,
    val loginId: String,
    val loginPwd: String,
    val userName: String,
    var userPhone: String,
    var userPhoto: String?
)