package Factory;

import Factory.components.buttons.AndriodButton;
import Factory.components.buttons.Button;
import Factory.components.dropdown.AndriodDropdown;
import Factory.components.dropdown.Dropdown;
import Factory.components.menu.AndriodMenu;
import Factory.components.menu.Menu;

public class AndriodUIFactory implements UIFactory{

    @Override
    public AndriodButton createButton() {
        return new AndriodButton();
    }

    @Override
    public AndriodMenu createMenu() {
        return new AndriodMenu();
    }

    @Override
    public AndriodDropdown createDropdown() {
        return new AndriodDropdown();
    }
}
