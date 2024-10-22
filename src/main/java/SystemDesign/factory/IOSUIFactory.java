package SystemDesign.factory;

import SystemDesign.factory.components.button.Button;
import SystemDesign.factory.components.button.IOSButton;
import SystemDesign.factory.components.menu.IOSMenu;
import SystemDesign.factory.components.menu.Menu;

public class IOSUIFactory implements UIFactory {

    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public Menu createMenu() {
        return new IOSMenu();
    }
}
