package hexlet.code.schemas.schemaValidator;

public class ContainsSchemaValidator implements SchemaValidator<String> {
    private String substring;

    public ContainsSchemaValidator(String substring) {
        this.substring = substring;
    }
    @Override
    public boolean validateValue(String value) {
        if (value == null) {
            return true;
        }
        return value.contains(substring);
    }
}
