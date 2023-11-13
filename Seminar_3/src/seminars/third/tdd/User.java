package seminars.third.tdd;

// Добавьте функцию в класс UserRepository, которая разлогинивает всех пользователей, кроме администраторов.
// Для этого, вам потребуется расширить класс User новым свойством, указывающим, обладает ли пользователь админскими правами.
// Протестируйте данную функцию.

public class User {

    String name;
    String password;

    boolean isAuthenticate = false;
    boolean isAdmin = false;


    public User(String name, String password, boolean isAdmin) {
        this.name = name;
        this.password = password;
        this.isAdmin = isAdmin;
        this.isAuthenticate = true;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public boolean isAuth() {
        return isAuthenticate;
    }

    public void setAuth(boolean auth) {
        isAuthenticate = auth;
    }

}