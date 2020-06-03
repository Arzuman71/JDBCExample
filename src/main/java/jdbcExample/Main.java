package jdbcExample;

import jdbcExample.maneger.UserManager;
import jdbcExample.model.User;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {
        UserManager userManager = new UserManager();


        //      try {
                  userManager.addUser(new User("d","poxosyan","@mali","1234"));
        ///      } catch (SQLException e) {
        //           e.printStackTrace();
//        }
    }
}
