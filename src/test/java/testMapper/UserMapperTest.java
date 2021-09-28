package testMapper;

import com.Application;
import com.liang.mapper.UserMapper;
import com.liang.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//        原来因为SpringRunner.class继承了SpringJUnit4ClassRunner.class且没有进行任何修改
//        所以@RunWith(SpringRunner.class)基本等同于@RunWith(SpringJUnit4ClassRunner.class)
//
//注解的作用：
//        让测试在Spring容器环境下执行。如测试类中无此注解，将导致service,dao等自动注入失败。

//@RunWith(SpringJUnit4ClassRunner.class)
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class UserMapperTest {
    @Resource
    private UserMapper userMapper;

    @Test
    public void test() {
        List list = userMapper.selectList(null);
        System.out.println(list);
    }

    @Test
    public void testGetName() {
        String name = userMapper.getUserName();
        System.out.println(name);
    }

    @Test
    public void testAddUser() {
        User user = new User();
        user.setId(3);
        user.setName("梁山伯");
        user.setAge(67);
        userMapper.addUser(user);

    }

    @Test
    public void testDelUser() {
        User user = new User();
        user.setId(3);
        userMapper.delUser(user);

    }

    @Test
    public void testUpdateUser() {
        User user = new User();
        user.setId(3);
        user.setName("蒋介石");
        user.setAge(100);
        userMapper.updateUser(user);

    }

    @Test
    public void testLikeUser() {
        System.out.println("模糊查询前：");
        String like = "石";
        List list = userMapper.likeUser(like);
        for (Object o : list) {
            System.out.println("模糊查询：" + o);
        }
        System.out.println("模糊查询后：");
    }

//    @Test
//    public void testPageUserByMap() {
//        Integer startIndex = 0;
//        Integer pageSize = 5;
//        Map<String,Integer> map =new HashMap<String,Integer>();
//        map.put("startIndex",startIndex);
//        map.put("pageSize",pageSize);
//        List<User> userList = userMapper.pageUser(map);
//        for (User user : userList) {
//            System.out.println(user);
//        }
//    }

    @Test
    public void testPageUserByList() {
        Integer startIndex = 0;
        Integer pageSize = 5;
        List list = new ArrayList<Integer>();
        list.add(0);
        list.add(5);
        List<User> userList = userMapper.pageUser(list);
        for (User user : userList) {
            System.out.println(user);
        }
    }

}
