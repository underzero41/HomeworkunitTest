package third.ttd;

public class User {
    String name;
    String password;
    public boolean isAuthenticate = false;
    private boolean isAdmin;
    public User(String name, String password, boolean isAdmin) {
        this.name = name;
        this.password = password;
        this.isAdmin = isAdmin;
    }

    public boolean authenticate(String name, String password) {
        // реализация аутентификации
        return false;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

}
