package cc.eamon.open.mapping.mapper.convert;

import cc.eamon.open.mapping.mapper.*;
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
@Mapper(
        value = "default",
        name = "ConvertData"
)
@MapperConvert(
        value = "default",
        type = ConvertTo.class
)
public class ConvertFrom {
    private String name;

    private String number;

    private List<ConvertFrom> covertFroms;

}
