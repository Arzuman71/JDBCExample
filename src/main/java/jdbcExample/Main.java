package jdbcExample;

import jdbcExample.maneger.UserManager;
import jdbcExample.model.User;

import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {
        UserManager userManager = new UserManager();
        List<User> users = userManager.getAllUsers();
        for (User user : users) {
            System.out.println(user);
        }
        userManager.deletUserBYid(2);

        users = userManager.getAllUsers();
        for (User user : users) {
            System.out.println(user);
        }
        //      try {
        //          userManager.addUser(new User("valod","poxosyan","@mali","1234"));
        ///      } catch (SQLException e) {
        //           e.printStackTrace();
//        }
    }
}
