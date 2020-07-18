package cc.eamon.open.mapping.mapper;

import cc.eamon.open.mapping.mapper.ignore.TeacherDefaultMapper;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Field;

/**
 * Author: Lucas
 * Email: 1181370590@qq.com
 * Time: 2020-03-28 08:58:34
 */
public class MapperIgnoreTest {

    @Test
    public void testMapperIgnore() {
        TeacherDefaultMapper mapper = new TeacherDefaultMapper();
        Class clazz = mapper.getClass();
        Field[] declaredFields = clazz.getDeclaredFields();
        boolean isIgnore=true;
        for (Field declaredField : declaredFields) {
            if (declaredField.getName().equals("phoneNumber"))
                isIgnore=false;
        }
        Assert.assertTrue(isIgnore);

    }
}
