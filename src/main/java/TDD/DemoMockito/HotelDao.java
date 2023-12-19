package TDD.DemoMockito;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class HotelDao {

    List<String> fetchAvailableRooms() throws SQLException {

        List<String> availableRooms = new ArrayList<>();
        Connection connection = DriverManager.getConnection("");
        Statement statement = connection.createStatement();
        ResultSet rs;
        rs = statement.executeQuery("SELECT * FROM ROOM WHERE AVAILABLE like '1' ");
        while (rs.next()){
            availableRooms.add(rs.getString("Room name"));
        }
        return availableRooms;

    }
}
