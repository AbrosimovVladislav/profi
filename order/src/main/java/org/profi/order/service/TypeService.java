package org.profi.order.service;

import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.profi.order.model.Type;
import org.profi.order.repo.TypeRepo;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class TypeService {

  private final TypeRepo typeRepo;

  public List<Type> getAll() {
    return typeRepo.findAll();
  }

}
