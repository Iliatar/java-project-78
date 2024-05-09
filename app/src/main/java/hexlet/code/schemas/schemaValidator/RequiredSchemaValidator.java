package hexlet.code.schemas.schemaValidator;

public class RequiredSchemaValidator implements SchemaValidator {

    @Override
    public boolean validateValue(Object value) {
        if (value == null) {
            return  false;
        }
        return true;
    }
}
