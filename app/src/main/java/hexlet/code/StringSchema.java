package hexlet.code;

import hexlet.code.schemas.BaseSchema;
import hexlet.code.schemas.ContainsSchemaValidator;
import hexlet.code.schemas.MinLengthSchemaValidator;
import hexlet.code.schemas.RequiredStringSchemaValidator;

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
