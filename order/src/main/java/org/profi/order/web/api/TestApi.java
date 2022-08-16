package org.profi.order.web.api;

import io.swagger.annotations.ApiOperation;

public interface TestApi {

  @ApiOperation(value = "Test",
      notes = "Test",
      response = String.class)
  String test();

}
