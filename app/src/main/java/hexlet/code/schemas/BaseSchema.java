package hexlet.code.schemas;

import hexlet.code.schemas.schemaValidator.SchemaValidator;

import java.util.HashMap;
import java.util.Map;

public abstract class BaseSchema<T> {
    private Map<String, SchemaValidator<T>> schemaValidators;

    public BaseSchema() {
        schemaValidators = new HashMap<String, SchemaValidator<T>>();
    }

    public final boolean isValid(T value) {
        for (var schemaValidator : schemaValidators.values()) {
            if (!schemaValidator.validateValue(value)) {
                return false;
            }
        }
        return true;
    }

    protected final void addSchemaValidator(SchemaValidator<T> schemaValidator) {
        schemaValidators.put(schemaValidator.getClass().getName(), schemaValidator);
    }
}
