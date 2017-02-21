/**
 * Created by YanMing on 2017/2/20.
 */

import org.junit.Test;
public class Juggler implements Performer {
    private int beanBags;

    public Juggler(){}

    public void setBeanBags(int beanBags)
    {
        this.beanBags = beanBags;
    }

    public Juggler(int beanBags)
    {
        this.beanBags = beanBags;
    }

    public void perform() {
        System.out.println("my beanBags is " + this.beanBags);
    }
}
