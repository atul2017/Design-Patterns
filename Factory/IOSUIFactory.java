package Factory;

import Factory.components.buttons.Button;
import Factory.components.buttons.IOSButton;
import Factory.components.dropdown.Dropdown;
import Factory.components.dropdown.IOSDropdown;
import Factory.components.menu.IOSMenu;
import Factory.components.menu.Menu;

public class IOSUIFactory implements UIFactory{
    @Override
    public IOSButton createButton() {
        return new IOSButton();
    }

    @Override
    public IOSMenu createMenu() {
        return new IOSMenu();
    }

    @Override
    public IOSDropdown createDropdown() {
        return new IOSDropdown();
    }
}
