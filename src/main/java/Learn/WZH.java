package Learn;

import Config.Lovely;
import Config.Mature;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author lxy
 * @version 1.0
 * @date 2019/8/8 10:58
 */
@Component
public class WZH implements Girl{
    String act;

    public WZH(@Value("WZH Do Make Love") String act) {
        this.act = act;
    }

    @Override
    public void doXXX(String location) {
        System.out.println(act);
    }
}
