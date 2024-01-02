package HW_3.task3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserRepositoryTest {
    private User user1;
    private User user2;
    private User user3;
    private User admin1;
    private User admin2;
    private UserRepository repo;


    // В начале тестов будут созаны данные для работы, чтобы исключить дублирование
    @BeforeEach
    void createData() {
        user1 = new User("Jon", "145");
        user2 = new User("Jim", "145");
        admin2 = new User("Mot", "547");

        admin2.doAdmin();
        repo = new UserRepository();
        repo.addUser(user1);
        repo.addUser(user2);
        repo.addUser(admin2);
    }

    @Test
    void relogging() {
        repo.relogging();
        assertFalse(user1.isAuthenticate);
        assertTrue(admin2.isAuthenticate);
    }

    @Test
    void addUser() {
        assertEquals(3, repo.data.size());
        assertTrue(repo.data.contains(user1));
        assertTrue(repo.data.contains(user2));
        assertTrue(repo.data.contains(admin2));
    }
}