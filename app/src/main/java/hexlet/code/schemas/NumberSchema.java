package hexlet.code.schemas;

public final class NumberSchema extends BaseSchema<Number> {
    public NumberSchema required() {
        addPredicate("required",
                value -> !(value == null));
        return this;
    }

    public NumberSchema positive() {
        addPredicate("positive",
                value -> value == null || value.doubleValue() > 0);
        return this;
    }

    public NumberSchema range(Number minValue, Number maxValue) {
        addPredicate("range",
                value -> value == null || (value.doubleValue() >= minValue.doubleValue()
                        && value.doubleValue() <= maxValue.doubleValue()));
        return this;
    }
}
