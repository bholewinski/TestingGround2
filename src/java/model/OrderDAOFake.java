package model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ben Holewinski
 */
public class OrderDAOFake implements IOrderDAO {
    private List<MenuItem> menuItems;
    
    public OrderDAOFake() {
        menuItems = new ArrayList<MenuItem>();
        MenuItem item = new MenuItem("House Salad", 9.95);
        menuItems.add(item);
        item = new MenuItem("Steak", 19.95);
        menuItems.add(item);
    }
    
    @Override
    public List<MenuItem> getCurrentMenuChoice() throws RuntimeException {
        List<MenuItem> items = new ArrayList<MenuItem>();
        return menuItems;
    }
    
    @Override
    public void saveOrder(List<MenuItem> orderList ) {
        //Need to implement
    }
}
