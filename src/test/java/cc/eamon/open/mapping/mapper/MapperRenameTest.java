package cc.eamon.open.mapping.mapper;

import cc.eamon.open.mapping.mapper.rename.ManDefaultMapper;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Field;

/**
 * Author: Lucas
 * Email: 1181370590@qq.com
 * Time: 2020-03-28 08:58:34
 */
public class MapperRenameTest {
    @Test
    public void testMapperRename() {
        ManDefaultMapper mapper = new ManDefaultMapper();
        Class clazz = mapper.getClass();
        Field[] declaredFields = clazz.getDeclaredFields();
        boolean isRename=false;
        for (Field declaredField : declaredFields) {
            if (declaredField.getName().equals("telNumber"))
                isRename=true;
        }
        Assert.assertTrue(isRename);
    }

}
