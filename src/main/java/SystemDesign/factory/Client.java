package SystemDesign.factory;

import SystemDesign.factory.components.button.Button;
import org.springframework.cglib.proxy.Factory;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter();
        UIFactory uiFactory = flutter.getUIFactory(Platform.Android);

        Button button = uiFactory.createButton() ;
        button.displayButton() ;
    }
}
