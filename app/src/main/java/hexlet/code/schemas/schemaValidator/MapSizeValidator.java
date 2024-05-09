package hexlet.code.schemas.schemaValidator;

import java.util.Map;

public class MapSizeValidator implements SchemaValidator<Map> {
    private int size;

    public  MapSizeValidator(int size) {
        this.size = size;
    }
    @Override
    public boolean validateValue(Map value) {
        if (value == null) {
            return true;
        }
        return value.size() == size;
    }
}
