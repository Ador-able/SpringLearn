package Learn;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

/**
 * @author lxy
 * @version 1.0
 * @date 2019/8/12 15:00
 */
@Aspect
@Component
public class Foster {
    @DeclareParents(value = "Learn.Girl+",defaultImpl = WhipTraining.class)
    public static Training training;
}
