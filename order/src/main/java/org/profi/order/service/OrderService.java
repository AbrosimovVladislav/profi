package org.profi.order.service;

import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.profi.order.model.Order;
import org.profi.order.repo.OrderRepo;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class OrderService {

  private final OrderRepo orderRepo;

  public List<Order> getAll(){
    return orderRepo.findAll();
  }

}