package hexlet.code.schemas.schemaValidator;

public final class MinLengthSchemaValidator implements SchemaValidator<String> {
    private int minLength;

    public MinLengthSchemaValidator(int minLength) {
        this.minLength = minLength;
    }
    @Override
    public boolean validateValue(String value) {
        if (value == null || value == "") {
            return true;
        }
        return value.length() >= minLength;
    }
}
