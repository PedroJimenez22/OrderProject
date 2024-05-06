package Repositories;

import Models.OrderModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Optional;

@Repository
public interface orderRepository extends CrudRepository<OrderModel, Long> {

    public Optional<ArrayList<OrderModel>> findOrderModelByCode(String code);

    public Optional<ArrayList<OrderModel>> findOrderModelModelByName(String name);
}
