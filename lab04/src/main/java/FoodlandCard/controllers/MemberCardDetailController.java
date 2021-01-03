package FoodlandCard.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import FoodlandCard.models.MemberCard;
import javafx.scene.control.TextField;

public class MemberCardDetailController {
    @FXML private Label nameLabel;
    @FXML private Label phoneLabel;
    @FXML private Label cumulativePurchaseLabel;
    @FXML private Label pointLabel;
    @FXML private TextField purchaseTextField;
    @FXML private TextField pointTextField;

    private MemberCard memberCard;

    @FXML
    public void initialize() {
        System.out.println("initialize MemberCardDetailController");
        memberCard = new MemberCard("Raksit Phoopongpattana", "084-559-2270");
        showMemberCardData();
    }
    @FXML
    public void handleAddPurchaseButton(ActionEvent actionEvent) {
        String purchaseString = purchaseTextField.getText();
        double purchase = Double.parseDouble(purchaseString);
        memberCard.addPurchase(purchase);
        showMemberCardData();
        purchaseTextField.clear();
    }

    @FXML
    public void handleUsePointButton(ActionEvent actionEvent) {
        String pointString = pointTextField.getText();
        int point = Integer.parseInt(pointString);
        memberCard.useStamp(point);
        showMemberCardData();
        pointTextField.clear();
    }


    private void showMemberCardData() {
        nameLabel.setText(memberCard.getName());
        phoneLabel.setText(memberCard.getPhone());
        String cumulativePurchase =
                String.format("%.2f", memberCard.getCumulativePurchase());
        cumulativePurchaseLabel.setText(cumulativePurchase);
        String point = "" + memberCard.getStamp();
        pointLabel.setText(point);
    }
}


