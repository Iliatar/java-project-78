package hexlet.code.schemaValidators;

import hexlet.code.SchemaValidator;

public class PositiveSchemaValidator implements SchemaValidator<Number> {

    @Override
    public boolean validateValue(Number value) {
        return value.doubleValue() > 0;
    }
}
