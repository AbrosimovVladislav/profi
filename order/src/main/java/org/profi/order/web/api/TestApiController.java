package org.profi.order.web.api;

import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.profi.order.model.Order;
import org.profi.order.model.Type;
import org.profi.order.service.OrderService;
import org.profi.order.service.TypeService;
import org.profi.order.web.dto.OrderDto;
import org.profi.order.web.dto.TypeDto;
import org.profi.order.web.mapper.OrderMapper;
import org.profi.order.web.mapper.TypeMapper;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
//@MeasurePerformance
@RequiredArgsConstructor
public class TestApiController implements TestApi {

  private final OrderService orderService;
  private final OrderMapper orderMapper;
  private final TypeService typeService;
  private final TypeMapper typeMapper;

  @GetMapping(value = "/test", produces = MediaType.APPLICATION_JSON_VALUE)
  public String test() {
    log.info("1");
    return "1";
  }

  @GetMapping(value = "/order", produces = MediaType.APPLICATION_JSON_VALUE)
  public List<OrderDto> getOrders() {
    List<Order> orders = orderService.getAll();
    List<OrderDto> dtos = orders.stream().map(orderMapper::orderToDto)
        .collect(Collectors.toList());
    log.info("GetOrders request: " + dtos);
    return dtos;
  }

  @GetMapping(value = "/type", produces = MediaType.APPLICATION_JSON_VALUE)
  public List<TypeDto> getTypes() {
    List<Type> types = typeService.getAll();
    List<TypeDto> dtos = types.stream().map(typeMapper::typeToDto).collect(Collectors.toList());
    log.info("GetTypes request: " + dtos);
    return dtos;
  }
}
