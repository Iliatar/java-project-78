package hexlet.code.schemaValidators;

import hexlet.code.SchemaValidator;

public class ContainsSchemaValidator implements SchemaValidator {
    private String substring;

    public ContainsSchemaValidator(String substring) {
        this.substring = substring;
    }
    @Override
    public boolean validateString(String value) {
        return value.contains(substring);
    }
}
