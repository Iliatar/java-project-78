package hexlet.code.schemas;

import hexlet.code.schemas.schemaValidator.ShapeSchemaValidator;

import java.util.Map;

public final class MapSchema extends BaseSchema<Map> {
    public MapSchema sizeof(int size) {
        addPredicate("sizeof",
                value -> value == null || value.size() == size);
        return this;
    }

    public MapSchema required() {
        addPredicate("required",
                value -> !(value == null));
        return this;
    }

    public MapSchema shape(Map schemas) {
        addPredicate("shape", new ShapeSchemaValidator(schemas));
        return this;
    }
}
