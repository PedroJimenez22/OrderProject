package Controllers;

import Models.orderModel;
import Services.orderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/orders")
public class orderController {
    @Autowired
    OrderService order;

    @PostMapping()
    public OrderModel saveOrder(@RequestBody OrderModel order){
        return service.saveOrder(order);
    }

    @PutMapping()
    public OrderModel editOrder(@RequestBody OrderModel Order){
        return service.editOrder(order);
    }

    @GetMapping()
    public ArrayList<OrderModel> getAllOrders(){
        return service.getAllOrders();
    }


    @GetMapping("/findOrdersById/{id}")
    public Optional<OrderModel> findOrderById(@PathVariable Long id){
        return service.findOrderById(id);
    }

    @GetMapping("/findOrderByCode/{code}")
    public Optional<ArrayList<OrderModel>> findOrderById(@PathVariable String code){
        return service.findOrderByCode(code);
    }


    @GetMapping("/findOrderByName/{name}")
    public Optional<ArrayList<OrderModel>> findOrderById(@PathVariable String name){
        return service.findOrderByName(name);
    }
    @DeleteMapping("/delete-order-by-id")
    public String deleteOrderById(@RequestParam("id") Long id){
        return service.deleteOrderById(id);
    }


}
