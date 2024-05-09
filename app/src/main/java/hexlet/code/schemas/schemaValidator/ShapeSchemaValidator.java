package hexlet.code.schemas.schemaValidator;

import hexlet.code.schemas.BaseSchema;

import java.util.Map;

public final class ShapeSchemaValidator implements SchemaValidator<Map> {
    private Map<String, BaseSchema> schemas;

    public ShapeSchemaValidator(Map<String, BaseSchema> val) {
        this.schemas = val;
    }

    @Override
    public boolean validateValue(Map value) {
        if (value == null) {
            return true;
        }

        for (var key : schemas.keySet()) {
            if (value.containsKey(key)) {
                if (!schemas.get(key).isValid(value.get(key))) {
                    return false;
                }
            }
        }

        return true;
    }
}
