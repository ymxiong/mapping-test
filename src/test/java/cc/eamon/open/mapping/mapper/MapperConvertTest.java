package cc.eamon.open.mapping.mapper;

import cc.eamon.open.mapping.mapper.convert.ConvertFrom;
import cc.eamon.open.mapping.mapper.convert.ConvertFromDefaultMapper;
import cc.eamon.open.mapping.mapper.convert.ConvertTo;
import org.junit.Assert;
import org.junit.Test;

/**
 * Author: eamon
 * Email: eamon@eamon.cc
 * Time: 2019-11-08 02:54:01
 */
public class MapperConvertTest {

    @Test
    public void testSimpleMapperConvert() {
        ConvertFrom convertFromMain = new ConvertFrom();
        convertFromMain.setNumber("1");
        ConvertTo convertTo = new ConvertTo();
        ConvertFromDefaultMapper.convert(convertFromMain, convertTo);
        Assert.assertEquals(convertFromMain.getNumber(), convertTo.getId() + "");
    }

}
