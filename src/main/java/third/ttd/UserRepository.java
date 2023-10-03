package third.ttd;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    private List<User> data = new ArrayList<>();

    public void logoutUsers() {
        for (User user : data) {
            if (!user.isAdmin()) {
                user.isAuthenticate = false;
            }
        }
    }

    public void addUser(User user) {
        data.add(user);
    }

    public boolean isAuthenticate(String name, String password) {
        for (User user : data) {
            if (user.authenticate(name, password)) {
                return true;
            }
        }
        return false;
    }


}
