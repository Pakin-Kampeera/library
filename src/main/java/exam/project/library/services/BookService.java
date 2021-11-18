package exam.project.library.services;

import exam.project.library.models.Book;

import java.util.List;

public interface BookService {
    List<Book> getAllBook();

    List<Book> getBookById(Long bookId);

    int saveNewBook(Book book);

    void updateBook(Long bookId, Book book);

    void deleteBook(Long bookId);
}
