package app.practice.musicplay.dateBase

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [], version = 1)
abstract class AppDatabase : RoomDatabase() {
    companion object {
        @Volatile
        private var INSTEANCE: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase {
            return INSTEANCE?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "app_database"
                ).build()
                INSTEANCE = instance
                instance
            }
        }
    }
}