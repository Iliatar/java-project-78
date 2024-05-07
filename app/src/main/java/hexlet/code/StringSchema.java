package hexlet.code;

import hexlet.code.schemaValidators.ContainsSchemaValidator;
import hexlet.code.schemaValidators.MinLengthSchemaValidator;
import hexlet.code.schemaValidators.RequiredSchemaValidator;

import java.util.HashMap;
import java.util.Map;

public class StringSchema {
    Map<String, SchemaValidator> schemaValidators;

    public StringSchema() {
        schemaValidators = new HashMap<String, SchemaValidator>();
    }
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

    public boolean isValid(String value) {
        System.out.println(schemaValidators.keySet());
        for (var schemaValidator : schemaValidators.values()) {
            if (!schemaValidator.validateString(value)) {
                return false;
            }
        }
        return true;
    }

    private void addSchemaValidator(SchemaValidator schemaValidator) {
        schemaValidators.put(schemaValidator.getClass().getName(), schemaValidator);
    }
}
