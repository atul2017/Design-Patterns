package Factory;

import Factory.components.buttons.Button;
import Factory.components.dropdown.Dropdown;
import Factory.components.menu.Menu;

public interface UIFactory {
    public Button createButton();
    public Menu createMenu();
    public Dropdown createDropdown();
}
