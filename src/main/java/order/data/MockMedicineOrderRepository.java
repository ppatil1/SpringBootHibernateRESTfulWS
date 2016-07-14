package order.data;

import order.MedicineOrder;
import org.springframework.stereotype.Repository;

/**
 * Created by prabhu on 13/7/16.
 */
@Repository
public class MockMedicineOrderRepository implements MedicineOrderRepository {
    @Override
    public MedicineOrder findOrderById(long id){
        return new MedicineOrder(id,"This is just a mock order!");
    }
}
