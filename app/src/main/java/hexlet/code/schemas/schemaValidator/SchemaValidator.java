package hexlet.code.schemas.schemaValidator;

public interface SchemaValidator<T> {
    boolean validateValue(T value);
}
