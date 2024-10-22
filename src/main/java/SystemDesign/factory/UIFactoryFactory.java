package SystemDesign.factory;

public class UIFactoryFactory{
    public static UIFactory getUIFactory(Platform platform){
        switch (platform){
            case IOS : return new IOSUIFactory();
            case Android: return new AndroidUIFactory();
            case Mac: return new MacUIFactory();
            default: return null;
        }
    }
}
