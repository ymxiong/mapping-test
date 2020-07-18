package cc.eamon.open.mapping.mapper.ignore;

import cc.eamon.open.mapping.mapper.Mapper;
import cc.eamon.open.mapping.mapper.MapperExtra;
import cc.eamon.open.mapping.mapper.MapperIgnore;
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
        value = {"default","test"},
        name = {"TeacherDefaultMapper","testMapper"}
)
public class Teacher {

    private String name;

    @MapperIgnore("default")
    private String phoneNumber;

}
