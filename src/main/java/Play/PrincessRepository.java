package Play;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcOperations;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author lxy
 * @version 1.0
 * @date 2019/8/17 14:34
 */
@Repository
public class PrincessRepository {
    //    private JdbcOperations jdbcOperations;
//
//    @Autowired
//    public PrincessRepository(JdbcOperations jdbcOperations) {
//        this.jdbcOperations = jdbcOperations;
//    }
    private NamedParameterJdbcOperations namedParameterJdbcOperations;

    @Autowired
    public PrincessRepository(NamedParameterJdbcOperations namedParameterJdbcOperations) {
        this.namedParameterJdbcOperations = namedParameterJdbcOperations;
    }

    private static final String SQL_INSERT = "insert into princess (name,hobby) values (:name,:hobby)";
    private static final String SQL_SELECT_BY_ID = "select * from princess where id=?";

    public void addGirl(Princess princess) {
        Map<String, String> parammap = new HashMap<>();
        parammap.put("name", princess.getName());
        parammap.put("hobby", princess.getHobby());
        namedParameterJdbcOperations.update(SQL_INSERT, parammap);
    }
//    public void addGirl(Princess princess) {
//        jdbcOperations.update(SQL_INSERT, princess.getName(), princess.getHobby());
//    }
//
//    public Princess findOne(int id) {
//        return jdbcOperations.queryForObject(SQL_SELECT_BY_ID, this::mapRow, id);
//    }

//    private static final class PrincessRowMapper implements RowMapper<Princess> {
//        @Override
//        public Princess mapRow(ResultSet resultSet, int i) throws SQLException {
//            return new Princess(resultSet.getString("name"), resultSet.getString("hobby"));
//        }
//    }

    public Princess mapRow(ResultSet resultSet, int i) throws SQLException {
        return new Princess(resultSet.getString("name"), resultSet.getString("hobby"));
    }

}
