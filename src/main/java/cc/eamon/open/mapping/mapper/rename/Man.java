package cc.eamon.open.mapping.mapper.rename;

import cc.eamon.open.mapping.mapper.Mapper;
import cc.eamon.open.mapping.mapper.MapperIgnore;
import cc.eamon.open.mapping.mapper.MapperRename;
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
        name = {"ManDefaultMapper"}
)
public class Man {

    private String name;

    @MapperRename(
            value = "default",
            name = "telNumber"
    )
    private String phoneNumber;

}
