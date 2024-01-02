package HW_4;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.MockitoSession;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class BookServiceTest {
    //В начале сессии все mock-объекты инициализируются, а после работы обязательно должно быть
    // выполнено её окончание прописанное в аннотации  @AfterMethod
    @Mock
    MockitoSession session;

    @BeforeMethod
    void initAllMockObjects(){
        session = Mockito.mockitoSession()
                .initMocks(this)
                .startMocking();
    }
    @Test
    void  testBookServiceWithMockRepository() {
// Создаем заглушку, которая будет иммитировать репозиторий (хранилище книг)
        BookRepository bookRepository = mock(BookRepository.class);
        BookService bookService = new BookService(bookRepository);
// Создаем данные для новой книги
        String id = "1";
        String title = "Book1";
        String author = "Author1";
// Сравниваем эквивалентность результата работы метода findById(id) над нашей заглушкой bookRepository. Т.е книга
// созданная нами во время тестирования с полями id, title, author соответствует той, что возвращается нам в результате
// работы  findById(id) над bookRepository
        when(bookRepository.findById(id)).thenReturn(new Book(id, title, author));

        Book book = bookRepository.findById(id);
// verify проверяет вызывался ли единожды метод findById(id) с параметром id
        verify(bookRepository, times(1)).findById(id);

// Создаем объекты book1 и book2  для проверки метода findAll()
        Book book1 = new Book("1", "Book1", "Author1");
        Book book2 = new Book("2", "Book2", "Author2");
// Проверяем соответствие возращаемых списков при работе метода findAll() над заглушкой bookRepository
        when(bookRepository.findAll()).thenReturn(List.of(book1,book2));

// Эквивалентность можно проверить через assertArrayEquals
        assertArrayEquals(bookRepository.findAll().toArray(), List.of(book1,book2).toArray());

// verify проверяет вызывался ли единожды метод findAll()
        verify(bookRepository, times(1)).findAll();
    }
    @AfterMethod
    public void afterMethod() {
        session.finishMocking();
    }
}