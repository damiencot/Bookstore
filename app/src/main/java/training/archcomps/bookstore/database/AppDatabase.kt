package training.nansty.bookstore.database

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import training.nansty.bookstore.Book

const val DATABASE_NAME = "book_store"

@Database(entities = [Book::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun bookDao() : BookDao
}