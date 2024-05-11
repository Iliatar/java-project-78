package hexlet.code.schemas;

public final class StringSchema extends BaseSchema<String> {

    public StringSchema required() {
        addPredicate("required",
                value -> !(value == null || value.length() == 0));
        return this;
    }

    public StringSchema contains(String substring) {
        addPredicate("contains",
                value -> value == null || value == "" || value.contains(substring));
        return this;
    }

    public StringSchema minLength(int minLength) {
        addPredicate("minLength",
                value -> value == null || value == "" || value.length() >= minLength);
        return this;
    }
}
