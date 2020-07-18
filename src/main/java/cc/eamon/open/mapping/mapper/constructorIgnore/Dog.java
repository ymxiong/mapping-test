package cc.eamon.open.mapping.mapper.constructorIgnore;

import cc.eamon.open.mapping.mapper.Mapper;
import cc.eamon.open.mapping.mapper.MapperConstructorIgnore;
import cc.eamon.open.mapping.mapper.MapperDefaultValue;
import lombok.Getter;
import lombok.Setter;

/**
 * Author: Lucas
 * Email: 1181370590@qq.com
 * Time: 2020-04-03 08:53:34
 */
@Setter
@Getter
@Mapper(
        value = {"default"},
        name = {"DogDefaultMapper"}
)
public class Dog {

    private String name;
    @MapperConstructorIgnore("default")
    private String type;



}
