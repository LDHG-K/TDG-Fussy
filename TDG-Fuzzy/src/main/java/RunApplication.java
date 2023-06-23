import Controllers.Controller;
import Interface.modules.principal.Principal;

public class RunApplication {
    public static void main(String[] args) {

        Controller controller = new Controller();

        Principal principal = new Principal(controller);

        System.out.println("Aplication stated suscessfully");
    }
}
