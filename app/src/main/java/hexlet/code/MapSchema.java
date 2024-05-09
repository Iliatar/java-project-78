package hexlet.code;

import hexlet.code.schemas.BaseSchema;
import hexlet.code.schemas.MapSizeValidator;
import hexlet.code.schemas.RequiredSchemaValidator;
import hexlet.code.schemas.ShapeSchemaValidator;

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
