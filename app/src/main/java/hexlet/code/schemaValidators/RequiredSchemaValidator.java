package hexlet.code.schemaValidators;

import hexlet.code.SchemaValidator;

public class RequiredSchemaValidator implements SchemaValidator<String> {
    @Override
    public boolean validateValue(String value) {
        if (value == null || value.length() == 0) {
            return  false;
        }
        return true;
    }
}
