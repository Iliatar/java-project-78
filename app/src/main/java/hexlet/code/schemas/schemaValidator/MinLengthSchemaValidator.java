package hexlet.code.schemas.schemaValidator;

public final class MinLengthSchemaValidator implements SchemaValidator<String> {
    private int minLength;

    public MinLengthSchemaValidator(int val) {
        this.minLength = val;
    }
    @Override
    public boolean validateValue(String value) {
        if (value == null || value == "") {
            return true;
        }
        return value.length() >= minLength;
    }
}
