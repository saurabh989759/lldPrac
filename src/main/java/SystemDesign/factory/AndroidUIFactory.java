package SystemDesign.factory;

import SystemDesign.factory.components.button.AndroidButton;
import SystemDesign.factory.components.button.Button;
import SystemDesign.factory.components.menu.AndroidMenu;
import SystemDesign.factory.components.menu.Menu;

public class AndroidUIFactory implements UIFactory {

    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }
}
