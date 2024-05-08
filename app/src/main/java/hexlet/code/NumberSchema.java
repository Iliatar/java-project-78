package hexlet.code;

import hexlet.code.schemaValidators.RangeSchemaValidator;
import hexlet.code.schemaValidators.PositiveSchemaValidator;
import hexlet.code.schemaValidators.RequiredSchemaValidator;

public class NumberSchema extends BaseSchema<Number> {
    public NumberSchema required() {
        addSchemaValidator(new RequiredSchemaValidator());
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
