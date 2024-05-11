package hexlet.code.schemas;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

public abstract class BaseSchema<T> {
    private Map<String, Predicate<T>> schemaValidators;

    public BaseSchema() {
        schemaValidators = new HashMap<String, Predicate<T>>();
    }

    public final boolean isValid(T value) {
        for (var schemaValidator : schemaValidators.values()) {
            if (!schemaValidator.test(value)) {
                return false;
            }
        }
        return true;
    }

    protected final void addPredicate(String predicateName, Predicate<T> predicate) {
        schemaValidators.put(predicateName, predicate);
    }
}
