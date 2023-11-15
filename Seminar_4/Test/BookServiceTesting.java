import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import seminars.fourth.book.*;

import java.util.Arrays;
import java.util.List;


public class BookServiceTesting {

    private BookService bookService;
    private BookRepository bookRepository;

    @BeforeEach
    public void setup() {
        bookRepository = Mockito.mock(BookRepository.class);
        bookService = new BookService(bookRepository);
    }

    @Test
    public void testFindAllBooks() {
        Book book1 = new Book("1", "Book1", "Author1");
        Book book2 = new Book("2", "Book2", "Author2");

        Mockito.when(bookRepository.findAll()).thenReturn(Arrays.asList(book1, book2));

        List<Book> books = bookService.findAllBooks();

        Assertions.assertEquals(2, books.size());
        Assertions.assertTrue(books.contains(book1));
        Assertions.assertTrue(books.contains(book2));
    }

    @Test
    public void testFindBookById() {
        Book book = new Book("1", "Book1", "Author1");
        Mockito.when(bookRepository.findById("1")).thenReturn(book);
        Book result = bookService.findBookById("1");
        Assertions.assertEquals(book, result);
    }

}
