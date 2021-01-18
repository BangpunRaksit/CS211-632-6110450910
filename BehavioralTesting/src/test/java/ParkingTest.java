import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParkingTest {
    @Test
    void Park_test(){
        Parking Parking = new Parking(0,15);
        assertEquals(0,Parking.getParkingPrice());
    }
    @Test
    void Park_test2() {
        Parking Parking = new Parking(2, 0);
        assertEquals(10, Parking.getParkingPrice());
    }
    @Test
    void Park_test3() {
        Parking Parking = new Parking(2, 1);
        assertEquals(20, Parking.getParkingPrice());
    }
    @Test
    void Park_test4() {
        Parking Parking = new Parking(0, -10);
        assertEquals(0, Parking.getParkingPrice());
    }

    @Test
    void Park_test5() {
        Parking Parking = new Parking(3, 0);
        assertEquals(20, Parking.getParkingPrice());
    }
}