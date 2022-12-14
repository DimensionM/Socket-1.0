package testdemo;

import com.springtest.spring5.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring5 {

    @Test
    public void testAdd(){
        //1 加载spring配置文件
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");

        //2 获取配置创建的对象
        User user = context.getBean("user", User.class); //导入类User
        System.out.println(user);
        user.add();

    }
}
