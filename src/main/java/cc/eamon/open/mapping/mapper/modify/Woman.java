package cc.eamon.open.mapping.mapper.modify;

import cc.eamon.open.mapping.mapper.Mapper;
import cc.eamon.open.mapping.mapper.MapperIgnore;
import cc.eamon.open.mapping.mapper.MapperModify;
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
        name = {"WomanDefaultMapper"}
)
public class Woman {

    private String name;

//    @MapperModify(
//            value = "default",
//            modify = "convertPhone",
//            recover = ""
//    )
    private String phoneNumber;

    public String convertPhone(String phoneNumber) {
        if (phoneNumber == null) return "";
        return this.phoneNumber.substring(0, 3) + "****" + this.phoneNumber.substring(7);
    }

}
