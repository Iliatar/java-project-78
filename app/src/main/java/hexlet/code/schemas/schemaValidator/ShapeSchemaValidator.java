package hexlet.code.schemas.schemaValidator;

import hexlet.code.schemas.BaseSchema;

import java.util.Map;

public class ShapeSchemaValidator implements SchemaValidator<Map> {
    Map<String, BaseSchema> schemas;

    public ShapeSchemaValidator(Map<String, BaseSchema> schemas) {
        this.schemas = schemas;
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
