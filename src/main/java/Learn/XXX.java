package Learn;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author lxy
 * @version 1.0
 * @date 2019/8/7 10:39
 */
@Component
public class XXX implements Girl {
    String act;

    public XXX(@Value("XXX Do Make Love") String act) {
        this.act = act;
    }

    @Override
    public void doXXX(String location) {
        System.out.println(act);
    }
}
