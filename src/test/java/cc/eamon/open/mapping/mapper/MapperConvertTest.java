package cc.eamon.open.mapping.mapper;

import cc.eamon.open.mapping.mapper.convert.ConvertData;
import cc.eamon.open.mapping.mapper.convert.ConvertFrom;
import cc.eamon.open.mapping.mapper.convert.ConvertTo;
import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

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
        ConvertData.convert(convertFromMain, convertTo);
        Assert.assertEquals(convertFromMain.getNumber(), convertTo.getNumber() + "");
    }

    @Test
    public void testMapperParse(){
        ConvertFrom convertFromMain = new ConvertFrom();
        convertFromMain.setNumber("1");
        Map<String, Object> objectMap =  ConvertData.buildMap(convertFromMain);
        Map<String, String> stringMap = ConvertData.buildSerialMap(convertFromMain);

        ConvertFrom from1 = ConvertData.parseEntity(objectMap);
        ConvertFrom from2 = ConvertData.parseSerialEntity(stringMap);

        Assert.assertEquals(from1.getNumber(), "1");
        Assert.assertEquals(from2.getNumber(), "1");

    }


}
