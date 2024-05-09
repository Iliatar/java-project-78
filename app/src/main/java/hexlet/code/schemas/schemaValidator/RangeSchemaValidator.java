package hexlet.code.schemas.schemaValidator;

public final class RangeSchemaValidator implements SchemaValidator<Number> {
    private Number minValue;
    private Number maxValue;

    public RangeSchemaValidator(Number minVal, Number maxVal) {
        this.minValue = minVal;
        this.maxValue = maxVal;
    }
    @Override
    public boolean validateValue(Number value) {
        if (value == null) {
            return true;
        }
        return value.doubleValue() >= minValue.doubleValue() && value.doubleValue() <= maxValue.doubleValue();
    }
}
