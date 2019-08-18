package Config;

import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author lxy
 * @version 1.0
 * @date 2019/8/8 10:54
 */
@Target({ElementType.CONSTRUCTOR,ElementType.FIELD, ElementType.METHOD,  ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Qualifier
public @interface Lovely {
}
