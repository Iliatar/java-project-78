package hexlet.code;

import hexlet.code.schemaValidators.ContainsSchemaValidator;
import hexlet.code.schemaValidators.MinLengthSchemaValidator;
import hexlet.code.schemaValidators.RequiredSchemaValidator;

public class StringSchema extends BaseSchema {

    public StringSchema required() {
        addSchemaValidator(new RequiredSchemaValidator());
        return this;
    }

    public StringSchema contains(String substring) {
        addSchemaValidator(new ContainsSchemaValidator(substring));
        return this;
    }

    public StringSchema minLength(int minLength) {
        addSchemaValidator(new MinLengthSchemaValidator(minLength));
        return this;
    }
}
