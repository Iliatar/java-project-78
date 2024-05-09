package hexlet.code.schemas.schemaValidator;

public final class ContainsSchemaValidator implements SchemaValidator<String> {
    private String substring;

    public ContainsSchemaValidator(String val) {
        this.substring = val;
    }
    @Override
    public boolean validateValue(String value) {
        if (value == null || value == "") {
            return true;
        }
        return value.contains(substring);
    }
}
