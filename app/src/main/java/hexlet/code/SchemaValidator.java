package hexlet.code;

public interface SchemaValidator<T> {
    boolean validateValue(T value);
}
