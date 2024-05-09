package hexlet.code.schemas.schemaValidator;

public class PositiveSchemaValidator implements SchemaValidator<Number> {

    @Override
    public boolean validateValue(Number value) {
        return value.doubleValue() > 0;
    }
}
