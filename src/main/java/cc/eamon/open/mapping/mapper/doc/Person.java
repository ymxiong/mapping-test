package cc.eamon.open.mapping.mapper.doc;

import cc.eamon.open.mapping.mapper.Mapper;
import cc.eamon.open.mapping.mapper.MapperDoc;
import lombok.Getter;
import lombok.Setter;

/**
 * Author: eamon
 * Email: eamon@eamon.cc
 * Time: 2019-11-29 22:32:02
 */
@Setter
@Getter
@Mapper(
        value = {"default"},
        name = {"PersonDefaultMapper"}
)
@MapperDoc(value = "default", note = "人")
public class Person {

    @MapperDoc(value = "default", note = "姓名")
    private String name;

}
