package hexlet.code;

import hexlet.code.schemas.BaseSchema;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public final class AppTest {
    @Test
    public void stringSchemaTest() {
        var v = new Validator();

        var schema = v.string();

        // Пока не вызван метод required(), null и пустая строка считаются валидным
        assertTrue(schema.isValid(""));
        assertTrue(schema.isValid(null));
        assertTrue(schema.isValid("Petya"));

        schema.required();

        assertFalse(schema.isValid(""));
        assertFalse(schema.isValid(null));
        assertTrue(schema.isValid("Petya"));

        assertTrue(schema.contains("wh").isValid("what does the fox say"));
        assertTrue(schema.contains("what").isValid("what does the fox say"));
        assertFalse(schema.contains("whatthe").isValid("what does the fox say"));
        assertFalse(schema.isValid(""));
        assertTrue(schema.contains("wh").minLength(5).isValid("what does the fox say"));
        assertFalse(schema.minLength(45).isValid("what does the fox say"));

        var schema1 = v.string();
        assertFalse(schema1.minLength(4).minLength(10).isValid("Hexlet"));
    }

    @Test
    public void numberSchemaTest() {
        var v = new Validator();

        var schema = v.number();

        assertTrue(schema.isValid(null));
        assertTrue(schema.isValid(5));
        assertTrue(schema.isValid(-5));

        schema.required();
        assertFalse(schema.isValid(null));
        assertTrue(schema.isValid(5));

        schema.positive();
        assertTrue(schema.isValid(5));
        assertFalse(schema.isValid(-5));

        schema.range(5, 15);
        assertFalse(schema.isValid(4));
        assertTrue(schema.isValid(5));
        assertTrue(schema.isValid(10));
        assertTrue(schema.isValid(15));
        assertFalse(schema.isValid(16));
    }

    @Test
    public void mapTest() {
        var v = new Validator();

        var schema = v.map();

        assertTrue(schema.isValid(null));
        assertTrue(schema.isValid(new HashMap<>()));

        schema.required();

        assertFalse(schema.isValid(null));
        assertTrue(schema.isValid(new HashMap<>()));

        Map<String, String> data = new HashMap<>();

        assertTrue(schema.isValid(data));

        schema.sizeof(2);

        assertFalse(schema.isValid(data));
        data.put("key1", "value1");
        data.put("key2", "value2");
        assertTrue(schema.isValid(data));
        data.put("key3", "value3");
        assertFalse(schema.isValid(data));
    }

    @Test
    public void mapShapeTest() {
        var v = new Validator();

        var schema = v.map();

        Map<String, BaseSchema<String>> schemas = new HashMap<>();

        schemas.put("firstName", v.string().required());
        schemas.put("lastName", v.string().required().minLength(2));

        schema.shape(schemas);

        Map<String, String> human1 = new HashMap<>();
        human1.put("firstName", "John");
        human1.put("lastName", "Smith");
        assertTrue(schema.isValid(human1));

        Map<String, String> human2 = new HashMap<>();
        human2.put("firstName", "John");
        human2.put("lastName", null);
        assertFalse(schema.isValid(human2));

        Map<String, String> human3 = new HashMap<>();
        human3.put("firstName", "Anna");
        human3.put("lastName", "B");
        assertFalse(schema.isValid(human3));
    }
}
