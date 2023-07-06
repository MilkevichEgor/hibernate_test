import models.Auto;
import models.User;
import services.UserService;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {

        UserService userService = new UserService();
        List<User> users = userService.findAllUsers();
        for (User user : users) {
            System.out.println(user.getId() + " " + user.getName() + " " + user.getAge());
            userService.deleteUser(user);
        }

    }
}