package my.gambi.json.generator.basic;

import java.lang.reflect.Type;
import my.gambi.exception.ParseException;
import my.gambi.json.DefaultObjectGenerator;

/**
 *
 * @author Victor Machado
 */
public class DoubleGenerator extends DefaultObjectGenerator {

    @Override
    public Object generate(Type type, Object value) throws ParseException {

        if (value instanceof Double) {
            return value;
        }
        if (value instanceof String) {
            return Double.valueOf((String) value);
        }
        if (value instanceof Integer) {
            return new Double((Integer) value);
        }
        if (value instanceof Long) {
            return new Double((Long) value);
        }
        throw new ParseException(value, type);
    }

}
