package cc.eamon.open.mapping.mapper;

import cc.eamon.open.mapping.mapper.extra.StudentDefaultMapper;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Field;

/**
 * Author: Lucas
 * Email: 1181370590@qq.com
 * Time: 2020-03-28 08:58:34
 */
public class MapperExtraTest {

    @Test
    public void testMapperExtra() {
        StudentDefaultMapper mapper = new StudentDefaultMapper();
        Class clazz = mapper.getClass();
        Field[] declaredFields = clazz.getDeclaredFields();
        boolean isFindExtra=false;
        for (Field declaredField : declaredFields) {
            if (declaredField.getName().equals("age"))
                isFindExtra=true;
        }
        Assert.assertTrue(isFindExtra);
    }
}
