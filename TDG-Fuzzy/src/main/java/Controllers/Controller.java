package Controllers;

import Domain.gateways.IController;

import java.sql.SQLOutput;
import java.util.List;

public class Controller implements IController {


    @Override
    public List<String[]> getMethod1(String a, String b, String c) {
        System.out.println("Controller.getMethod1");
        System.out.println("Calling method 1 with...");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        //Data ejemplo
        String[] card1 = {"1","Papa", "Texto1", "potato.png"};
        String[] card2 = {"2","Aguacate", "Texto2", "avocado.png"};
        String[] card3 = {"3","Tomate", "Texto3", "tomato.png"};
        String[] card4 = {"4","Arroz", "Texto4", "rice.png"};
        List<String[]> cardsInfo = List.of(card1, card2, card3, card4);

        return cardsInfo;
    }

}
