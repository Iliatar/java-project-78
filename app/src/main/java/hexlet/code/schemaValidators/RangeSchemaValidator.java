package hexlet.code.schemaValidators;

import hexlet.code.SchemaValidator;

public class RangeSchemaValidator implements SchemaValidator<Number> {
    private Number minValue;
    private Number maxValue;

    public RangeSchemaValidator(Number minValue, Number maxValue) {
        this.minValue = minValue;
        this.maxValue = maxValue;
    }
    @Override
    public boolean validateValue(Number value) {
        return (double) value >= (double) minValue && (double) value <= (double) maxValue;
    }
}
