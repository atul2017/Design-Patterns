package Factory;

import Factory.components.buttons.Button;
import Factory.components.menu.Menu;

public class Client {
    public static void main(String[] args){
        Flutter flutter = new Flutter(SupportedPlatform.ANDRIOD);
        UIFactory uiFactory = flutter.createUIFactory();

        Button button = uiFactory.createButton();
        button.changeSize();

        Menu menu = uiFactory.createMenu();
    }
}
