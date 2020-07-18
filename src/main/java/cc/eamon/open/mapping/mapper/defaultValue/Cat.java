package cc.eamon.open.mapping.mapper.defaultValue;

import cc.eamon.open.mapping.mapper.Mapper;
import cc.eamon.open.mapping.mapper.MapperDefaultValue;
import cc.eamon.open.mapping.mapper.MapperDoc;
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
        name = {"CatDefaultMapper"}
)
public class Cat {
    @MapperDefaultValue(value = "default", defaultValue = "\"卷卷\"")
    private String name;
    @MapperDefaultValue(value = "default", defaultValue = "\"英短\"")
    private String type;
    @MapperDefaultValue(value = "default", defaultValue = "1")
    private Integer age;


}
