package hexlet.code.schemas.schemaValidator;

public final class PositiveSchemaValidator implements SchemaValidator<Number> {

    @Override
    public boolean validateValue(Number value) {
        if (value == null) {
            return true;
        }
        return value.doubleValue() > 0;
    }
}
