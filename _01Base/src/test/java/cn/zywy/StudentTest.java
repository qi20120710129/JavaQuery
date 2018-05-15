package cn.zywy;


import cn.zywy.bean.Student;
import cn.zywy.dao.StudentDao;
import cn.zywy.dao.StudentDaoImpl;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;


public class StudentTest {
    StudentDao dao=null;
    Logger log=Logger.getLogger(StudentTest.class);
    @Before
    public void before(){
        dao=new StudentDaoImpl();
    }
    /*
    * 新增
    * */
    @Test
    public void testAddStudent(){
        Student student=new Student(25,"张三");
        dao.addStudent(student);
    }
}
