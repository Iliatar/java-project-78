package hexlet.code.schemas;

import hexlet.code.SchemaValidator;

import java.util.Map;

public class ShapeSchemaValidator implements SchemaValidator<Map> {
    Map<String, BaseSchema> schemas;

    public ShapeSchemaValidator(Map<String, BaseSchema> schemas) {
        this.schemas = schemas;
    }

    @Override
    public boolean validateValue(Map value) {
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
