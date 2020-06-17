package cwx.source.aop;

/**
 * @author chenweixuan
 * @date 2020/6/17
 */
public class AopInterfaceImpl implements AopInterface {

    @JoinPoiint
    @Override
    public String show() {
        return "AopInterfaceImpl!";
    }
}
