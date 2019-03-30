/**
 * 测试类
 *
 * @author qubin
 * @date 2019-03-27 13:23
 */
public class App {

    public static void main(String[] args) {
        //静态代理
//        Swan swan = new Swan();
//        Broker broker = new Broker(swan);
//        broker.work();


        //动态代理
        Star swan = new Swan();
        //获取代理工厂对象
        ProxyFactory proxyFactory = new ProxyFactory(swan);
        Star broker = (Star)proxyFactory.getProxyInstance();
//        System.out.println(broker.getClass());
        broker.work();

    }

}
