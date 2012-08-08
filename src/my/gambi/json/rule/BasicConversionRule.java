package my.gambi.json.rule;

import java.lang.reflect.Type;
import my.gambi.ConversionRule;
import static  my.gambi.utils.TypeAssertion.*;
/**
 *
 * @author Victor Machado
 */
public class BasicConversionRule implements ConversionRule {

    public Object getConversionParameter(Type type, Object value) {
        return isBasic(type) ? "BasicObjectGenerator" : null;
    }

}
