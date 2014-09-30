package model;

import java.util.List;

/**
 * @author Ben Holewinski
 */
public interface IOrderDAO {
    List<MenuItem> getCurrentMenuChoice() throws RuntimeException;

    void saveOrder(List<MenuItem> orderList);
}
