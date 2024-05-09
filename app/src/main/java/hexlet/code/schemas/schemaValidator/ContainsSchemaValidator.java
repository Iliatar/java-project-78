package hexlet.code.schemas.schemaValidator;

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
