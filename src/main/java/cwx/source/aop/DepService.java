package cwx.source.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author chenweixuan
 * @date 2020/6/16
 */
@Service
public class DepService {

    @Autowired
    private AopInterface aopInterface;

    public String show() {
        return "DepService!" + aopInterface.show();
    }

}
