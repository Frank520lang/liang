package testMapper;

import com.Application;
import com.liang.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

//        原来因为SpringRunner.class继承了SpringJUnit4ClassRunner.class且没有进行任何修改
//        所以@RunWith(SpringRunner.class)基本等同于@RunWith(SpringJUnit4ClassRunner.class)
//
//注解的作用：
//        让测试在Spring容器环境下执行。如测试类中无此注解，将导致service,dao等自动注入失败。

//@RunWith(SpringJUnit4ClassRunner.class)
@RunWith(SpringRunner.class)
@SpringBootTest(classes= Application.class)
public class UserMapperTest {
    @Resource
    private UserMapper userMapper;
    @Test
    public void test(){
        List list =userMapper.selectList(null);
        System.out.println(list);
    }
}
