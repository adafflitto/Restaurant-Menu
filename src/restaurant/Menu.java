package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {

    private ArrayList<MenuItem> menuItems;
    private Date lastUpdate;

    public Menu(ArrayList<MenuItem> menuItems, Date lastUpdate) {
        this.menuItems = menuItems;
        this.lastUpdate = lastUpdate;
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    protected void setMenuItems(ArrayList<MenuItem> aMenuItems) {
        menuItems = aMenuItems;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date aLastUpdate) {
        lastUpdate = aLastUpdate;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "menuItems=" + menuItems +
                ", lastUpdate=" + lastUpdate +
                '}';
    }
}
