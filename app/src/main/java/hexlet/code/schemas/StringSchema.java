package hexlet.code.schemas;

import hexlet.code.schemas.schemaValidator.ContainsSchemaValidator;
import hexlet.code.schemas.schemaValidator.MinLengthSchemaValidator;
import hexlet.code.schemas.schemaValidator.RequiredStringSchemaValidator;

public class StringSchema extends BaseSchema<String> {

    public StringSchema required() {
        addSchemaValidator(new RequiredStringSchemaValidator());
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
