package seminars.third.tdd;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    // Тут можно хранить аутентифицированных пользователей
    List<User> data = new ArrayList<>();

    public void addUser(User user) {
       this.data.add(user);
    }

    // функция, которая разлогинивает всех пользователей, кроме администраторов
    public void logoutUsers() {
        for (User user : data) {
            if (!user.isAdmin()) {
                user.setAuth(false);
            }
        }
    }

}