package Learn;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author lxy
 * @version 1.0
 * @date 2019/8/6 9:47
 */
public class AYM implements Girl {
    String act;
    String name;
    List<String> hobby;

    public AYM(String name, List<String> hobby) {
        this.name = name;
        this.hobby = hobby;
    }

    public String getAct() {
        return act;
    }

    public void setAct(String act) {
        this.act = act;
    }

    @Override
    public void doXXX(String localcation) {
        System.out.println(name + " " + act +" in "+localcation);
        hobby.forEach(s -> System.out.println(" -" + s));
    }
}
