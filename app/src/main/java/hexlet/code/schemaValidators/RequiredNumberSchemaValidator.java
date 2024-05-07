package hexlet.code.schemaValidators;

import hexlet.code.SchemaValidator;

public class RequiredNumberSchemaValidator implements SchemaValidator<Number> {

    @Override
    public boolean validateValue(Number value) {
        if (value == null) {
            return  false;
        }
        return true;
    }
}
