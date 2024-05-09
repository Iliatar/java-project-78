package hexlet.code.schemas.schemaValidator;

public class RequiredStringSchemaValidator implements SchemaValidator<String> {
    @Override
    public boolean validateValue(String value) {
        if (value == null || value.length() == 0) {
            return  false;
        }
        return true;
    }
}
