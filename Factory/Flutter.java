package Factory;

public class Flutter {
    private SupportedPlatform supportedPlatform;

    public Flutter(SupportedPlatform supportedPlatform){
        this.supportedPlatform = supportedPlatform;
    }

    public void setTheme(){
        System.out.println("SetTheme");
    }

    public void setRefreshRate(){
        System.out.println("setRefreshRate");
    }

    public UIFactory createUIFactory(){
       return UIFactoryFactory.getUIFactoryForPlatform(supportedPlatform);
    }
}
