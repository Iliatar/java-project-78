package hexlet.code.schemas.schemaValidator;

public class RangeSchemaValidator implements SchemaValidator<Number> {
    private Number minValue;
    private Number maxValue;

    public RangeSchemaValidator(Number minValue, Number maxValue) {
        this.minValue = minValue;
        this.maxValue = maxValue;
    }
    @Override
    public boolean validateValue(Number value) {
        return value.doubleValue() >= minValue.doubleValue() && value.doubleValue() <= maxValue.doubleValue();
    }
}
