/**
 * 经纪人
 *
 * @author qubin
 * @date 2019-03-27 13:19
 */
public class Broker implements Star{

    private Swan target;

    public Broker(Swan target) {
        this.target = target;
    }

    @Override
    public void work() {
        System.out.println("xx经纪人安排今日行程");
        target.work();
        System.out.println("安排后面的行程");
    }

}
