package Services;

import Models.OrderModel;
import Repositories.orderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class orderService {
    @Autowired
    OrderRepository repository;

    //CRUD

    public OrderModel saveOrder(OrderModel Order){
        if(repository.findOrderModelByCode(order.getCode()).toString().equals("Optional[[]]")){
            return repository.save(order);
        }else{
            //retornar un error de repetido
            OrderModel orderError = new OrderModel();
            orderError.setId(-1L);
            return orderError;
        }



    }

    public ArrayList<OrderModel> getAllOrders(){
        return (ArrayList<OrderModel>) repository.findAll();
    }

    public Optional<OrderModel> findOrderById(Long id){
        return repository.findById(id);
    }



    public OrderModel editOrder(OrderModel order){
        return repository.save(order);
    }

    public String deleteOrderById(Long id){

        if(findOrderById(id).isPresent()){
            repository.deleteById(id);
            return "order deleted successfully";
        }else {
            return "order with id="+ id+ " not foud";
        }
    }

    public Optional<ArrayList<OrderModel>> findOrderByCode(String code){
        return repository.findOrderModelByCode(code);
    }
    public Optional<ArrayList<OrderModel>> findOrderByName(String name){
        return repository.findOrderModelByName(name);
    }
}
