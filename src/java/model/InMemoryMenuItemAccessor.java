package model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ben Holewinski
 */
public class InMemoryMenuItemAccessor implements MenuItemAccessorStrategy {
    private List<MenuItem> items;
    
    public InMemoryMenuItemAccessor() {
        items = new ArrayList<MenuItem>();
        MenuItem item = new MenuItem("Steak", 29.95);
        items.add(item);
        item = new MenuItem("Beer", 5.95);
        items.add(item);
    }
    
    @Override
    public List<MenuItem> getMenuItems() {
        return items;
    }
}
