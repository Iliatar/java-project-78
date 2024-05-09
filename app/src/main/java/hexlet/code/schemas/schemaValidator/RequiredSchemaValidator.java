package hexlet.code.schemas.schemaValidator;

public final class RequiredSchemaValidator implements SchemaValidator {

    @Override
    public boolean validateValue(Object value) {
        if (value == null) {
            return  false;
        }
        return true;
    }
}
