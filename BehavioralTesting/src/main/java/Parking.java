public class Parking {
    int hour = 0;
    int min = 0;
    int price = 0;


    public Parking(int hour, int min) {
        this.hour = hour;
        this.min = min;

    }


    public int getParkingPrice() {
        if (hour < 0 || min < 0) {
            System.out.println("Error");
        } else {
            if (hour < 1 && min <= 15) {
                price = 0;
                System.out.println("No fee");
            } else if (hour < 2) {
                price = 10;
                System.out.println("CarFee " + price + " baht");
            } else {
                if (min == 0) {
                    price = 10 + (hour - 2) * 10;
                } else {
                    price = 20 + (hour - 2) * 10;
                }
                System.out.println("CarFee" + price + " baht");
            }
        }
        return price;
    }
}