package com.odougle.nytbooksapi.presentation.books

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.odougle.nytbooksapi.data.model.Book

class BooksViewModel: ViewModel() {
    val booksLiveData: MutableLiveData<List<Book>> = MutableLiveData()

    fun getBooks(){

    }
}