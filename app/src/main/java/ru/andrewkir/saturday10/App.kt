package ru.andrewkir.saturday10

import android.app.Application
import androidx.room.Room
import ru.andrewkir.saturday10.data.db.SearchDatabase
import ru.andrewkir.saturday10.data.db_2.UsersDatabase


class App : Application() {
  override fun onCreate() {
    super.onCreate()
    db = Room.databaseBuilder(
      applicationContext,
      UsersDatabase::class.java,
      "user-db"
    )
      .allowMainThreadQueries()
      .build()

    db_2 = Room.databaseBuilder(
      applicationContext,
      SearchDatabase::class.java,
      "search-db"
    )
      .allowMainThreadQueries()
      .build()
  }

  companion object {
    var db: UsersDatabase? = null
    fun getDatabase(): UsersDatabase? {
      return db
    }

    var db_2: SearchDatabase? = null
    fun getDatabase_2(): SearchDatabase? {
      return db_2
    }
  }
}