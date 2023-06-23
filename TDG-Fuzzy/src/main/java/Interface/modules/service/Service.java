package Interface.modules.service;

import Controllers.Controller;
import Domain.gateways.IController;
import Interface.modules.models.Card;

import java.util.ArrayList;
import java.util.List;

public class Service {

    private IController controller;

    public Service(IController controller) {
        this.controller = controller;
    }

    public List<Card> getCardsInfo(String A, String B, String C) {
        List<Card> result = new ArrayList<>();
        List<String[]> cardsInfo = controller.getMethod1(A,B,C);

        cardsInfo.forEach(cardInfo -> {
            String position = cardInfo[0];
            String title = cardInfo[1];
            String text = cardInfo[2];
            String imageName = cardInfo[3];
            Card card = new Card(position, title, text, imageName);
            result.add(card);
        });

        return result;
    }

}
