package cn.zywy;


import cn.zywy.bean.Student;
import cn.zywy.dao.StudentDao;
import cn.zywy.dao.StudentDaoImpl;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Map;


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
        log.debug("insert之前的编号："+student.getId());
        dao.addStudent(student);
        log.debug("insert之后的编号："+student.getId());
    }
    /*
    * 新增 获取id
    * */
    @Test
    public void addStudentByCache(){
        Student student=new Student(26,"赵四");
        log.debug("insert之前的编号："+student.getId());
        dao.addStudentByCache(student);
        log.debug("insert之后的编号："+student.getId());
    }
    /*
    * 删除
    * */
    @Test
    public void deleteStudent(){
        dao.deleteStudent(1);
    }
    /*
    * 修改
    * */
    @Test
    public void updateStudent(){
        Student student=new Student(3,26,"王五");
        dao.updateStudent(student);
    }
    /*
    * 查询所有
    * */
    @Test
    public void selectAllStudents(){
        List<Student> students = dao.selectAllStudents();
        log.debug(students);
    }
    /**
     * 查询所有
     */
    @Test
    public void mapStudent(){
        Map<String, Object> students = dao.selectAllByMap();
        log.debug(students.size());
        log.debug(students.get("赵四"));
    }
    /**
     * 查询指定的student
     */
    @Test
    public void selectStudentById(){
        Student student = dao.selectStudentById(2);
        //获取一个对象
        log.debug(student);
    }
    /**
     * 根据姓名模糊查询
     */
    @Test
    public void selectStudentByName(){
        List<Student> students = dao.selectByName("赵");
        //获取一个对象
        log.debug(students);
    }
}
