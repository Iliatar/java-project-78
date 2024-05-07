package hexlet.code;

import java.util.HashMap;
import java.util.Map;

public abstract class BaseSchema<T> {
    private Map<String, SchemaValidator<T>> schemaValidators;

    public BaseSchema() {
        schemaValidators = new HashMap<String, SchemaValidator<T>>();
    }

    public boolean isValid(T value) {
        for (var schemaValidator : schemaValidators.values()) {
            if (!schemaValidator.validateValue(value)) {
                return false;
            }
        }
        return true;
    }

    protected void addSchemaValidator(SchemaValidator<T> schemaValidator) {
        schemaValidators.put(schemaValidator.getClass().getName(), schemaValidator);
    }
}
