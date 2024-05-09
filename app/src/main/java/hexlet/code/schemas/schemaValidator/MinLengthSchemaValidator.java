package hexlet.code.schemas.schemaValidator;

public class MinLengthSchemaValidator implements SchemaValidator<String> {
    private int minLength;

    public MinLengthSchemaValidator(int minLength) {
        this.minLength = minLength;
    }
    @Override
    public boolean validateValue(String value) {
        return value.length() >= minLength;
    }
}
