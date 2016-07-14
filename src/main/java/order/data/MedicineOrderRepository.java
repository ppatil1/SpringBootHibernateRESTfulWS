package order.data;

import order.MedicineOrder;

/**
 * Created by prabhu on 13/7/16.
 */
public interface MedicineOrderRepository {
    MedicineOrder findOrderById(long id);
}
