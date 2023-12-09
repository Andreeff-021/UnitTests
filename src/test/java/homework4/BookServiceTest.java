package homework4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

class BookServiceTest {

    @Test
    void findBookByIdMock() {
        BookRepository bookRepository = mock(BookRepository.class);
        String bookId = "1";
        bookRepository.findById(bookId);
        verify(bookRepository, times(1)).findById(anyString());
    }

    @Test
    void findAllBooks() {
        BookRepository bookRepository = mock(BookRepository.class);
        bookRepository.findAll();
        verify(bookRepository, times(1)).findAll();
    }
}