package cwx.source.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author chenweixuan
 * @date 2020/6/16
 */
@Service
public class AopService {

    @Autowired
    private DepService depService;

    @JoinPoiint
    public String show() {
        return "aopService!" + depService.show();
    }

    public String show2() {
        return "aopService!" + depService.show();
    }

}
