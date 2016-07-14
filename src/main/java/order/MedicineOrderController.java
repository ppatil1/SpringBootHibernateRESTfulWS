package order;

import java.util.concurrent.atomic.AtomicLong;

import order.data.MockMedicineOrderRepository;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

/**
 * Created by prabhu on 11/7/16.
 */
@RestController
public class MedicineOrderController {

    @RequestMapping("/getOrder")
    public MedicineOrder orderById(@RequestParam(value = "id") long id){
        return new MockMedicineOrderRepository().findOrderById(id);
    }

}
