package micronaut.mapstruct;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import javax.inject.Inject;
import micronaut.mapstruct.mapper.ModelMapper;

@Controller("/test")
public class TestController {

  @Inject
  private ModelMapper modelMapper;

  @Get(produces = MediaType.TEXT_PLAIN)
  public String index() {
    return "Hello World";
  }
}
