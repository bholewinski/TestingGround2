package model;

import java.util.List;

/**
 * @author Ben Holewinski
 */
public class MenuService {
    private MenuItemAccessorStrategy accessor;
    
    public MenuService(MenuItemAccessorStrategy accessor) {
        this.setAccessor(accessor);
    }
    
    public void processOrder(String itemOrdered) {
        //Need to implement
    }
    
    public List<MenuItem> getMenuItems() {
        return accessor.getMenuItems();
    }

    public MenuItemAccessorStrategy getAccessor() {
        return accessor;
    }

    public void setAccessor(MenuItemAccessorStrategy accessor) {
        
        if(accessor == null) {
            throw new IllegalArgumentException("accessor is null");
        } else {
            this.accessor = accessor;
        }
    }
}
