package Learn;

import Config.Lovely;
import Config.Mature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author lxy
 * @version 1.0
 * @date 2019/8/6 9:14
 */
@Component
public class LXY {
    Girl girl;


    public void love(String location) {
        girl.doXXX(location);
    }

    public Girl getGirl() {
        return girl;
    }

    @Autowired
    public void setGirl(Girl girl) {
        this.girl = girl;
    }

}
