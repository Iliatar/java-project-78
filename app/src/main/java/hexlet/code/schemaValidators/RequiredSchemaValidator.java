package hexlet.code.schemaValidators;

import hexlet.code.SchemaValidator;

public class RequiredSchemaValidator implements SchemaValidator {

    @Override
    public boolean validateValue(Object value) {
        if (value == null) {
            return  false;
        }
        return true;
    }
}
