package SystemDesign.factory;

import SystemDesign.factory.components.button.Button;
import SystemDesign.factory.components.menu.Menu;

public interface UIFactory {
    Button createButton();
    Menu createMenu();

}
