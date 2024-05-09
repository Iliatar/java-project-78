package hexlet.code;

import hexlet.code.schemaValidators.MapSizeValidator;
import hexlet.code.schemaValidators.RequiredSchemaValidator;
import hexlet.code.schemaValidators.ShapeSchemaValidator;

import java.util.Map;

public class MapSchema extends BaseSchema<Map> {
    public MapSchema sizeof(int size) {
        addSchemaValidator(new MapSizeValidator(size));
        return this;
    }

    public MapSchema required() {
        addSchemaValidator(new RequiredSchemaValidator());
        return this;
    }

    public MapSchema shape(Map schemas) {
        addSchemaValidator(new ShapeSchemaValidator(schemas));
        return this;
    }
}
