package training.nansty.bookstore

import android.app.Application
import android.arch.persistence.room.Room
import timber.log.Timber
import training.nansty.bookstore.database.AppDatabase
import training.nansty.bookstore.database.DATABASE_NAME
import training.nansty.bookstore.repository.BookRepository

class App : Application() {

    companion object {
        lateinit var db: AppDatabase
        lateinit var repository: BookRepository
    }

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
        db = Room.databaseBuilder(this,
                AppDatabase::class.java, DATABASE_NAME)
                .build()

        repository = BookRepository()
        repository.scheduleBooksSync()
    }
}