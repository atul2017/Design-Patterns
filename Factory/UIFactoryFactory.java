package Factory;

public class UIFactoryFactory {
    public static UIFactory getUIFactoryForPlatform(SupportedPlatform supportedPlatform){
        if(supportedPlatform == SupportedPlatform.ANDRIOD){
            return new AndriodUIFactory();
        }else if(supportedPlatform==SupportedPlatform.IOS){
            return new IOSUIFactory();
        }
        return null;
    }
}
