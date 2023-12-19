package TDD.DemoMockito;

import org.junit.Before;
import org.junit.Test;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BookingManagerTest {

    HotelDao hotelDaoMock;
    BookingManager bookingManager;

    @Before
    void setUp() throws SQLException {
        hotelDaoMock = mock(HotelDao.class);
        bookingManager = new BookingManager(hotelDaoMock);

        List<String> availableRooms = Arrays.asList("A");
        when(hotelDaoMock.fetchAvailableRooms()).thenReturn(availableRooms);

    }

    void checkAvailableRoomTest() throws SQLException {
        assertTrue(bookingManager.checkRoomAvailibility("A"));
    }


    void tearDown() {

    }
}