package third.hw;

import org.testng.annotations.Test;
import third.ttd.User;
import third.ttd.UserRepository;

import static org.testng.AssertJUnit.assertFalse;

public class UserRepoTest {
    @Test
    public void testLogoutUsers() {
        User admin = new User("admin", "admin123", true);
        User user1 = new User("user1", "password1", false);
        User user2 = new User("user2", "password2", false);

        UserRepository userRepository = new UserRepository();
        userRepository.addUser(admin);
        userRepository.addUser(user1);
        userRepository.addUser(user2);

        userRepository.logoutUsers();

        assertFalse(admin.isAuthenticate);
        assertFalse(user1.isAuthenticate);
        assertFalse(user2.isAuthenticate);
    }
}
