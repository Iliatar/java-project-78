package hexlet.code.schemas;

import hexlet.code.SchemaValidator;

public class ContainsSchemaValidator implements SchemaValidator<String> {
    private String substring;

    public ContainsSchemaValidator(String substring) {
        this.substring = substring;
    }
    @Override
    public boolean validateValue(String value) {
        return value.contains(substring);
    }
}
