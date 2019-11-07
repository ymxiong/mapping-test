package cc.eamon.open.mapping.mapper.convert;

import cc.eamon.open.mapping.mapper.Mapper;
import cc.eamon.open.mapping.mapper.MapperConvert;
import cc.eamon.open.mapping.mapper.MapperModify;
import cc.eamon.open.mapping.mapper.MapperRename;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Author: eamon
 * Email: eamon@eamon.cc
 * Time: 2019-11-08 02:58:10
 */
@Setter
@Getter
@Mapper
@MapperConvert(
        value = "default",
        type = ConvertTo.class
)
public class ConvertFrom {

    @MapperRename(value = "default", name = "id")
    @MapperModify(value = "default", modify = "modifyStringToInt", recover = "recoverIntToString")
    private String number;

    private List<ConvertFrom> covertFroms;

    public Integer modifyStringToInt(String number) {
        if (number == null) return 0;
        return Integer.getInteger(number);
    }

    public String recoverIntToString(Integer id) {
        return id + "";
    }

}
