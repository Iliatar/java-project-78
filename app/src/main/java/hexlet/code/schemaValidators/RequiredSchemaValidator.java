package hexlet.code.schemaValidators;

import hexlet.code.SchemaValidator;

public class RequiredSchemaValidator implements SchemaValidator {
    @Override
    public boolean validateString(String value) {
        if (value == null || value.length() == 0) {
            return  false;
        }
        return true;
    }
}
