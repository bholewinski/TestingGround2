package model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ben Holewinski
 */
public class OrderService {
    private List<MenuItem> menuList;
    private List<MenuItem> orderList;
    private IOrderDAO orderDao;
    
    public OrderService(String dao) throws Exception {
        initItemsDb(dao);
    }
    
    private void initItemsDb(String dao) throws Exception {
        Class clazz = Class.forName(dao);
        orderDao = (IOrderDAO)clazz.newInstance();
        menuList = orderDao.getCurrentMenuChoice();
        orderList = new ArrayList<MenuItem>();
    }
    
    public void placeOrder() {
        orderDao.saveOrder(orderList);
        menuList = orderDao.getCurrentMenuChoice();
        orderList = new ArrayList<MenuItem>();
    }
}
