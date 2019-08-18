package Play;

/**
 * @author lxy
 * @version 1.0
 * @date 2019/8/17 11:14
 */
public class Princess {
    String name;
    String hobby;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public Princess(String name, String hobby) {
        this.name = name;
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "Princess{" +
                "name='" + name + '\'' +
                ", hobby='" + hobby + '\'' +
                '}';
    }
}
