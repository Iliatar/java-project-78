package hexlet.code;

import hexlet.code.schemas.BaseSchema;
import hexlet.code.schemas.RangeSchemaValidator;
import hexlet.code.schemas.PositiveSchemaValidator;
import hexlet.code.schemas.RequiredSchemaValidator;

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
