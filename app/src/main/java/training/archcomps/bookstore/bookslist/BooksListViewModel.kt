package training.nansty.bookstore.bookslist

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.ViewModel
import training.nansty.bookstore.App
import training.nansty.bookstore.Book

class BooksListViewModel : ViewModel() {

    val books : LiveData<List<Book>> = App.db.bookDao().getAllBooks()

    fun refreshBooks() {
        App.repository.syncBooksNow()
    }
}