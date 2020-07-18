package cc.eamon.open.mapping.mapper.extra;

import cc.eamon.open.mapping.mapper.Mapper;
import cc.eamon.open.mapping.mapper.MapperExtra;
import lombok.Getter;
import lombok.Setter;

/**
 * Author: Lucas
 * Email: 1181370590@qq.com
 * Time: 2020-03-28 08:53:34
 */
@Setter
@Getter
@Mapper(
        value = {"default"},
        name = {"StudentDefaultMapper"}
)
@MapperExtra(
        value = {"default"},
        name = {"age"},
        type = {Integer.class},
        typeArgs = {"null"},
        list = {false},
        defaultValues ={"1"}
)
public class Student {

    private String name;

}
