package micronaut.mapstruct.mapper;

import micronaut.mapstruct.model.ModelA;
import micronaut.mapstruct.model.ModelB;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(
    componentModel = "jsr330"
)
public abstract class ModelMapper {

  @Mapping(target = "otherName", source = "name")
  public abstract ModelB map(ModelA modelA);
}
