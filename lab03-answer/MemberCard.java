public class MemberCard {

    // >>>> 1. ----------
    private String name;
    private String phone;
    private double cumulativePurchase;
    private int stamp;
    // <<<< 1. ----------

    // >>>> 2. ----------

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public double getCumulativePurchase() {
        return cumulativePurchase;
    }

    public int getStamp() {
        return stamp;
    }

    // <<<< 2. -----------

    // >>>> 3.1 ----------

    public void addPurchase(double purchase) {
        cumulativePurchase += purchase;
        stamp += purchase / 50;
    }

    // <<<< 3.1 ----------

    // >>>> 3.2 ----------

    public boolean useStamp(int stamp) {
        if (this.stamp >= stamp) {
            this.stamp -= stamp;
            return true;
        }
        return false;
    }

    // <<<< 3.2 ----------

    // >>>> 4 ------------

//    public MemberCard(String name, String phone) {
//        this.name = name;
//        this.phone = phone;
//        cumulativePurchase = 0;
//        stamp = 0;
//    }

    // <<<< 4 ------------

    // >>>> 5 ------------

    public MemberCard(String name, String phone, int stamp) {
        this.name = name;
        this.phone = phone;
        this.stamp = stamp;
        cumulativePurchase = 0;
    }

    // <<<< 5. -----------

    // >>>> 6. -----------

    public MemberCard(String name, String phone) {
        this(name, phone, 0);
    }

    // <<<< 6. -----------
}
