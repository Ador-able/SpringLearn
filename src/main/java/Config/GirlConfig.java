package Config;

import Learn.AYM;
import Learn.ConfessionSuccessCheck;
import Learn.Girl;
import Learn.XXX;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;

import java.util.*;

/**
 * @author lxy
 * @version 1.0
 * @date 2019/8/7 16:01
 */
@Configuration
public class GirlConfig {

    @Bean(name = "xxx")
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Girl XXXGirl() {
        return new XXX("XXX Do make love");
    }


    @Bean(name = "aym")
    @Primary
    public Girl AYMGirl() {
        List<String> hobby = new ArrayList<>();
        hobby.add("Ice and fire");
        hobby.add("Uniform temptation");
        AYM aym = new AYM("AYM", hobby);
        aym.setAct("Do make love");
        return aym;
    }
}
