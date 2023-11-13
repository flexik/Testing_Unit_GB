import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import seminars.third.tdd.*;

public class UserTest {
    @Test
    public void testLogoutUsers() {
        UserRepository userRepository = new UserRepository();
        User adminUser = new User("admin", "admin", true);
        User User1 = new User("user1", "dfgdsfg",false);
        User User2 = new User("user2", "dfgdsfg",false);
        User User3 = new User("user3", "dfgdsfg",false);


        userRepository.addUser(adminUser);
        userRepository.addUser(User1);
        userRepository.addUser(User2);
        userRepository.addUser(User3);

        userRepository.logoutUsers();

        Assertions.assertTrue(adminUser.isAuth());
        Assertions.assertFalse(User1.isAuth());
        Assertions.assertFalse(User2.isAuth());
        Assertions.assertFalse(User3.isAuth());
    }

}
