import book.Book;
import book.BookRepository;
import book.BookService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class BookServiceTest {
    @Test
    public void testFindBookById() {
        // Создание мок-объекта BookRepository
        BookRepository bookRepositoryMock = Mockito.mock(BookRepository.class);

        // Настройка поведения мок-объекта
        Book expectedBook = new Book("1", "Book1", "Author1");
        when(bookRepositoryMock.findById("1")).thenReturn(expectedBook);

        // Создание экземпляра класса BookService с использованием мок-объекта
        BookService bookService = new BookService(bookRepositoryMock);

        // Вызов метода findBookById
        Book result = bookService.findBookById("1");

        // Проверка результата
        assertEquals(expectedBook, result);
    }

    @Test
    public void testFindAllBooks() {
        // Создание мок-объекта BookRepository
        BookRepository bookRepositoryMock = Mockito.mock(BookRepository.class);

        // Настройка поведения мок-объекта
        Book book1 = new Book("1", "Book1", "Author1");
        Book book2 = new Book("2", "Book2", "Author2");
        List<Book> expectedBooks = Arrays.asList(book1, book2);
        when(bookRepositoryMock.findAll()).thenReturn(expectedBooks);

        // Создание экземпляра класса BookService с использованием мок-объекта
        BookService bookService = new BookService(bookRepositoryMock);

        // Вызов метода findAllBooks
        List<Book> result = bookService.findAllBooks();

        // Проверка результата
        assertEquals(expectedBooks, result);
    }
}
