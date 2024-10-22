package SystemDesign.factory;

import SystemDesign.factory.components.button.Button;
import SystemDesign.factory.components.button.MacButton;
import SystemDesign.factory.components.menu.MacMenu;
import SystemDesign.factory.components.menu.Menu;

public class MacUIFactory implements UIFactory {

    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Menu createMenu() {
        return new MacMenu();
    }
}
