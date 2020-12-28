public class Main {

    public static void main(String[] args) {
        // >>>> 8.1 -----------

        MemberCard john = new MemberCard("John", "0891234567");
        john.addPurchase(360);
        john.addPurchase(486.50);
        System.out.println("8.1 ----------------");
        System.out.println("John's Cumulative Purchase: " + john.getCumulativePurchase());
        System.out.println("John's E-Stamp: " + john.getStamp());
        System.out.println("--------------------");

        // <<<< 8.1 -----------

        // >>>> 8.2 -----------

        MemberCard smith = new MemberCard("Smith", "0678901234", 35);
        smith.addPurchase(35);
        smith.addPurchase(186);
        smith.addPurchase(311);
        System.out.println("8.2 ----------------");
        System.out.println("Smith's Cumulative Purchase: " + smith.getCumulativePurchase());
        System.out.println("Smith's E-Stamp: " + smith.getStamp());
        System.out.println("--------------------");

        // <<<< 8.2 -----------

        // >>>> 13.1 ----------

        CashRegister register = new CashRegister();
        register.purchaseItem(15);
        register.purchaseItem(16.50);
        register.purchaseItem(24);
        register.purchaseItem(18);
        register.purchaseItem(30);
        register.setCard(john);
        System.out.println("------------- 13.1 ----------------");
        System.out.println(
                "John ซื้อสินค้าทั้งหมด " + register.getNumberOfItem() + " ชิ้น "
                + "รวมเป็นเงิน " + register.getTotalPrice() + " บาท"
        );
        System.out.println("--- รับเงิน 500 บาท และใช้ E-Stamp 4 ดวง ---");
        register.pay(500, 4);
        System.out.println(
                "สรุป John ซื้อสินค้าทั้งหมด " + register.getNumberOfItem() + " ชิ้น "
                        + "รวมเป็นเงิน " + register.getTotalPrice() + " บาท"
        );
        System.out.println("ราคาสินค้าที่ต้องจ่ายจริง " + register.getActualPayment() + " บาท");
        System.out.println("รับเงินมา " + register.getCash() + " บาท");
        System.out.println("เงินทอน " + register.getChange() + " บาท");
        System.out.println("เหลือ E-Stamp " + john.getStamp() + " ดวง");
        register.clear();
        System.out.println("-----------------------------------");

        // <<<< 13.1 ----------

        // >>>> 13.2 ----------

        register.purchaseItem(34);
        register.purchaseItem(65);
        register.purchaseItem(20);
        System.out.println("------------- 13.2 ----------------");
        System.out.println(
                "Belle ซื้อสินค้าทั้งหมด " + register.getNumberOfItem() + " ชิ้น "
                        + "รวมเป็นเงิน " + register.getTotalPrice() + " บาท"
        );
        System.out.println("--- รับเงิน 100 บาท และใช้ stamp 30 ดวง ---");
        register.pay(100, 30);
        System.out.println(
                "สรุป Belle ซื้อสินค้าทั้งหมด " + register.getNumberOfItem() + " ชิ้น "
                        + "รวมเป็นเงิน " + register.getTotalPrice() + " บาท"
        );
        System.out.println("ราคาสินค้าที่ต้องจ่ายจริง " + register.getActualPayment() + " บาท");
        System.out.println("รับเงินมา " + register.getCash() + " บาท");
        System.out.println("เงินทอน " + register.getChange() + " บาท");
        register.clear();
        System.out.println("-----------------------------------");

        // <<<< 13.2 ----------

    }
}
