package SystemDesign.factory;

import org.springframework.ui.context.Theme;

public class Flutter {

    void refreshUI(){
        System.out.println("Refreshing UI");
    }
    void setTheme(){
        System.out.println("setting theme");
    }

    public UIFactory getUIFactory(Platform platform){
        return UIFactoryFactory.getUIFactory(platform);
    }
}
