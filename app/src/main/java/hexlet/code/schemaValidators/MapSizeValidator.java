package hexlet.code.schemaValidators;

import hexlet.code.SchemaValidator;

import java.util.Map;

public class MapSizeValidator implements SchemaValidator<Map> {
    private int size;

    public  MapSizeValidator(int size) {
        this.size = size;
    }
    @Override
    public boolean validateValue(Map value) {
        return value.size() == size;
    }
}