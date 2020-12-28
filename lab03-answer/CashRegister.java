public class CashRegister {

    // >>>> 9. ---------------
    private int numberOfItem;       // จำนวนสินค้าทั้งหมดที่ซื้อ
    private double totalPrice;      // จำนวนราคาสินค้ารวม
    private MemberCard card;        // บัตรสมาชิกที่ลูกค้าใช้ในการซื้อสินค้าครั้งนี้
    private double actualPayment;   // ยอดชำระสินค้าที่ลูกค้าต้องจ่ายจริง
    private double cash;          // เงินที่ลูกค้าจ่าย
    private double change;          // เงินทอน

    // <<<< 9. --------------

    // >>>> 11. -------------

    public void setCard(MemberCard card) {
        this.card = card;
    }

    // <<<< 11. -------------

    // >>>> 12.1 ------------

    public void purchaseItem(double purchase) {
        numberOfItem++;
        totalPrice += purchase;
        actualPayment += purchase;
    }

    // <<<< 12.1 ------------

    // >>>> 12.2 ------------

    public void pay(double cash, int stamp) {
        this.cash = cash;

        if (card == null) {
            actualPayment -= stamp;
        } else {
            if (card.useStamp(stamp)) {
                actualPayment -= 2 * stamp;
            }
        }

        this.change = this.cash - actualPayment;
    }

    // <<<< 12.2 ------------

    // >>>> 12.3 ------------

    public void clear() {
        this.numberOfItem = 0;
        this.totalPrice = 0;
        this.card = null;
        this.actualPayment = 0;
        this.cash = 0;
        this.change = 0;
    }

    // <<<< 12.3 ------------

    // getter

    public int getNumberOfItem() {
        return numberOfItem;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public double getActualPayment() {
        return actualPayment;
    }

    public double getCash() {
        return cash;
    }

    public double getChange() {
        return change;
    }
}
