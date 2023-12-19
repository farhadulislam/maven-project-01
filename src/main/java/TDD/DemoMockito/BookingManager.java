package TDD.DemoMockito;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookingManager {
    private HotelDao hotelDao;

    public BookingManager(HotelDao hotelDao){
        this.hotelDao = hotelDao;
    }

    boolean checkRoomAvailibility (String roomName) throws SQLException{

        List<String> availableRooms = hotelDao.fetchAvailableRooms();
        return availableRooms.contains(roomName);

    }

}
