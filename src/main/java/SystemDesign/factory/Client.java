package SystemDesign.factory;

import SystemDesign.factory.components.button.Button;
import SystemDesign.factory.components.menu.Menu;
import org.springframework.cglib.proxy.Factory;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter();
        UIFactory uiFactory = flutter.getUIFactory(Platform.IOS);

        Button button = uiFactory.createButton() ;
        button.displayButton() ;

        Menu menu = uiFactory.createMenu();

        menu.displayMenu() ;

    }
}
