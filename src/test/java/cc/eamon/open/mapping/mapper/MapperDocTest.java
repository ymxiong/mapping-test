package cc.eamon.open.mapping.mapper;

import cc.eamon.open.mapping.enhancement.Doc;
import cc.eamon.open.mapping.mapper.doc.PersonDefaultMapper;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Field;

/**
 * Author: eamon
 * Email: eamon@eamon.cc
 * Time: 2019-11-29 22:38:41
 */
public class MapperDocTest {


    @Test
    public void testSimpleMapperDoc() {
        PersonDefaultMapper mapper = new PersonDefaultMapper();
        Class clazz = mapper.getClass();
        Field[] declaredFields = clazz.getDeclaredFields();
        boolean isFindDoc = false;
        for (Field declaredField : declaredFields) {
            Doc annotation = declaredField.getAnnotation(Doc.class);
            if (annotation != null && "name".equals(declaredField.getName())){
                Assert.assertEquals("姓名", annotation.note());
                isFindDoc = true;
                break;
            }
        }
        Assert.assertTrue(isFindDoc);
    }

}
