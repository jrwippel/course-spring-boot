package com.estudojava.course.services;

import com.estudojava.course.entities.OrderItem;
import com.estudojava.course.repositories.OrderItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderItemService {

    @Autowired
    private OrderItemRepository repository;

    public List<OrderItem> findAll(){
        return repository.findAll();
    }
    public OrderItem findById(Long id){
        Optional <OrderItem> optionalOrderItem = repository.findById(id);
        return optionalOrderItem.get();
    }
}
