package hexlet.code;

import hexlet.code.schemaValidators.RangeSchemaValidator;
import hexlet.code.schemaValidators.RequiredNumberSchemaValidator;
import hexlet.code.schemaValidators.PositiveSchemaValidator;

public class NumberSchema extends BaseSchema<Number> {
    public NumberSchema required() {
        addSchemaValidator(new RequiredNumberSchemaValidator());
        return this;
    }

    public NumberSchema positive() {
        addSchemaValidator(new PositiveSchemaValidator());
        return this;
    }

    public NumberSchema range(Number minValue, Number maxValue) {
        addSchemaValidator(new RangeSchemaValidator(minValue, maxValue));
        return this;
    }
}
