package testMapper;

import com.Application;
import com.liang.mapper.StudentMapper;
import com.liang.pojo.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class StudentMapperTest {
    @Resource
    private StudentMapper studentMapper;

    @Test
    public void testGetStudent() {
        List<Student> studentList = studentMapper.getStudent();
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}
