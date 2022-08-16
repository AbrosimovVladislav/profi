package org.profi.order.web.api;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
//@MeasurePerformance
@RequiredArgsConstructor
public class TestApiController implements TestApi {

  @GetMapping(value = "/test", produces = MediaType.APPLICATION_JSON_VALUE)
  public String test() {
    return "1";
  }
}
