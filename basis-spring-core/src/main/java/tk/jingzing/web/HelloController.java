package tk.jingzing.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tk.jingzing.core.Shanhy;
import tk.jingzing.core.sync.Task;

import javax.annotation.Resource;

/**
 * Created by wangyunjing on 2016/12/18.
 */
@RestController
public class HelloController {

    @Resource(name = "shanhyA")
    private Shanhy shanhyA;

    @Autowired
    @Qualifier("shanhyB")
    private Shanhy shanhyB;

    @RequestMapping("/test")
    public String test(){
        shanhyA.dispaly();
        shanhyB.dispaly();
        return"test";
    }

    @RequestMapping("/task")
    public String task2() throws Exception{
        Task task = new Task();
        task.doTaskOne();
        task.doTaskTwo();
        task.doTaskThree();
        return"task2";
    }
}
