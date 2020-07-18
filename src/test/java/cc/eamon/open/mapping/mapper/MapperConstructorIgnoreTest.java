package cc.eamon.open.mapping.mapper;

import cc.eamon.open.mapping.mapper.constructorIgnore.DogDefaultMapper;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Field;

/**
 * @author: lucas
 * @date: 2020/7/18
 * @email: lucas@eamon.cc
 */
public class MapperConstructorIgnoreTest {
    @Test
    public void testSimpleMapperDoc() {
        DogDefaultMapper mapper = new DogDefaultMapper();
        Class clazz = mapper.getClass();
        Field[] declaredFields = clazz.getDeclaredFields();
        boolean isIgnore=true;
        for (Field declaredField : declaredFields) {
            if (declaredField.getName().equals("type"))
                isIgnore=false;
        }
        Assert.assertTrue(isIgnore);
    }
}
