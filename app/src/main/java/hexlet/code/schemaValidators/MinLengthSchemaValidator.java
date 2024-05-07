package hexlet.code.schemaValidators;

import hexlet.code.SchemaValidator;

public class MinLengthSchemaValidator implements SchemaValidator {
    private int minLength;

    public MinLengthSchemaValidator(int minLength) {
        this.minLength = minLength;
    }
    @Override
    public boolean validateString(String value) {
        return value.length() >= minLength;
    }
}
