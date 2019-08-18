package Config;

import Learn.AYM;
import Learn.Girl;
import Learn.LXY;
import Learn.XXX;
import com.sun.org.apache.xpath.internal.operations.String;
import org.springframework.context.annotation.*;

import java.util.*;

/**
 * @author lxy
 * @version 1.0
 * @date 2019/8/6 9:51
 */
@Configuration
@Import(GirlConfig.class)
@EnableAspectJAutoProxy
@ComponentScan(basePackages = {"Learn","Config","Play"})
//@ImportResource("classpath:GirlConfig.xml")
public class LifeConfig {
//    @Bean
//    public LXY LXY(Girl girl) {
//        LXY lxy = new LXY();
//        lxy.setGirl(girl);
//        return lxy;
//    }
}


