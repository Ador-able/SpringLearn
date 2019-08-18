package Play;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author lxy
 * @version 1.0
 * @date 2019/8/17 10:47
 */
@Component
public class Harem {
    @Autowired
    DataSource dataSource;
    private static final String SQL_INSERT = "insert into princess (name,hobby) values (?,?)";

    //    public void addGirl(Princess princess) {
//        Connection connection = null;
//        PreparedStatement preparedStatement = null;
//        try {
//            connection = dataSource.getConnection();
//            preparedStatement = connection.prepareStatement(SQL_INSERT);
//            preparedStatement.setString(1, princess.getName());
//            preparedStatement.setString(2, princess.getHobby());
//            preparedStatement.execute();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                if (preparedStatement != null) {
//                    preparedStatement.close();
//
//                }
//                if (connection != null) {
//                    connection.close();
//                }
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
//    }
}
