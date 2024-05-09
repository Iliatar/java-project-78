package hexlet.code.schemas.schemaValidator;

import java.util.Map;

public final class MapSizeValidator implements SchemaValidator<Map> {
    private int size;

    public  MapSizeValidator(int mapSize) {
        this.size = mapSize;
    }
    @Override
    public boolean validateValue(Map value) {
        if (value == null) {
            return true;
        }
        return value.size() == size;
    }
}
