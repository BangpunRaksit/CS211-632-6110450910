package shop.services;

import shop.models.MemberCard;
import shop.models.MemberCardList;

public class MemberCardListHardCodeDataSource {
    private MemberCardList cardList;

    public MemberCardListHardCodeDataSource() {
        cardList = new MemberCardList();
        readData();
    }

    public void readData() {
        MemberCard john = new MemberCard("John Smith", "081-222-8888");
        MemberCard anna = new MemberCard("Anna Frost", "082-333-9999", 135);
        MemberCard harry = new MemberCard("Harry Potter", "083-444-0000", 40000);
        cardList.addCard(john);
        cardList.addCard(anna);
        cardList.addCard(harry);
        cardList.addCard(new MemberCard("Charles Babbage", "091-777-6543", 800));

        cardList.addCard(new MemberCard("Raksit Phoopongpattana", "6110450910", 5000));
        cardList.addCard(new MemberCard("Kittipong Satayanusakkul", "091-777-6543", 850));
        cardList.addCard(new MemberCard("Philip Wright", "098-778-6533", 500));
        cardList.addCard(new MemberCard("Daranphop Kemajuntri", "081-302-6545", 1200));
        cardList.addCard(new MemberCard("Vichit Makhasakulchalean", "098-878-8876", 2400));
    }

    public MemberCardList getCardList() {
        return cardList;
    }
}
