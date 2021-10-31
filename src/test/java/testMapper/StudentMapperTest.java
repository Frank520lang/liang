package testMapper;

import com.Application;
import com.liang.mapper.StudentMapper;
import com.liang.mapper.TeacherMapper;
import com.liang.pojo.Student;
import com.liang.pojo.Teacher;
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
    @Resource
    private TeacherMapper teacherMapper;

    @Test
    public void testGetStudent() {
        List<Student> studentList = studentMapper.getStudent();
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
    //一个老师对应多个学生的情况
    @Test
    public void testOneToMany(){

        List<Teacher> teachers =teacherMapper.oneToMany();
        System.out.println("----------------------------");
        System.out.println("----------------------------");
        System.out.println("----------------------------");
        System.out.println(teachers.get(1));
        System.out.println("----------------------------");
        System.out.println("----------------------------");
        System.out.println("----------------------------");
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
        System.out.println("----------------------------");
        System.out.println("----------------------------");
        System.out.println("----------------------------");
    }
}
