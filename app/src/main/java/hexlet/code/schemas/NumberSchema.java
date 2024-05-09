package hexlet.code.schemas;

import hexlet.code.schemas.schemaValidator.PositiveSchemaValidator;
import hexlet.code.schemas.schemaValidator.RangeSchemaValidator;
import hexlet.code.schemas.schemaValidator.RequiredSchemaValidator;

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
