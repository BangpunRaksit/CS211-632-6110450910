package shop.models;

import com.github.saacsos.FXRouter;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;
import java.util.ArrayList;

public class MemberCardList {
    private ArrayList<MemberCard> cards;

    public MemberCardList() {
        cards = new ArrayList<>();
    }

    public void addCard(MemberCard card) {
        cards.add(card);
    }

    public ArrayList<MemberCard> getAllCards() {
        return cards;
    }



}
