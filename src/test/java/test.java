import Config.GlobalConfig;
import Config.LifeConfig;
import Learn.AYM;
import Learn.LXY;
import Learn.Training;
import Play.Harem;
import Play.Princess;
import Play.PrincessRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author lxy
 * @version 1.0
 * @date 2019/8/6 9:15
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = LifeConfig.class)
//@ContextConfiguration(value = "classpath:spring-config.xml")
public class test {

    //    static {
//        System.setProperty("ConfessionSuccess", "true");
//    }
    @Autowired
    PrincessRepository princessRepository;

    @Test
    public void Test() {
//        harem.addGirl(new Princess("AYM", "Ice and fire|Uniform temptation"));
        princessRepository.addGirl(new Princess("WZH", "WhipTrain"));
//        System.out.println(princessRepository.findOne(2).toString());

    }
}
