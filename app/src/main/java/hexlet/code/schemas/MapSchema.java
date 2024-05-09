package hexlet.code.schemas;

import hexlet.code.schemas.schemaValidator.MapSizeValidator;
import hexlet.code.schemas.schemaValidator.RequiredSchemaValidator;
import hexlet.code.schemas.schemaValidator.ShapeSchemaValidator;

import java.util.Map;

public final class MapSchema extends BaseSchema<Map> {
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
