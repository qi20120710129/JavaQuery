package cn.zywy.dao;

import cn.zywy.bean.Student;
import cn.zywy.util.SessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class StudentDaoImpl implements StudentDao{
    /*
    * 新增
    * */
    @Override
    public void addStudent(Student student) {
        //获取session
        SqlSession session = null;
        try {
            session= SessionFactoryUtil.getSession();
            session.insert("addStudent",student);
            session.commit();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
    }
    /*新增 获取id*/
    @Override
    public void addStudentByCache(Student student) {
        //获取session
        SqlSession session = null;
        try {
            session= SessionFactoryUtil.getSession();
            session.insert("addStudentByCache",student);
            session.commit();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
    }
    /*删除*/
    @Override
    public void deleteStudent(Serializable id) {
        //获取session
        SqlSession session = null;
        try {
            session= SessionFactoryUtil.getSession();
            session.delete("deleteStudent",id);
            session.commit();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
    }
/*修改*/
    @Override
    public void updateStudent(Student student) {
        //获取session
        SqlSession session = null;
        try {
            session= SessionFactoryUtil.getSession();
            session.update("updateStudent",student);
            session.commit();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
    }
/*查询所有*/
    @Override
    public List<Student> selectAllStudents() {
        //获取session
        SqlSession session = null;
        List<Student> students=null;
        try {
            session= SessionFactoryUtil.getSession();
            students=session.selectList("selectAllStudents");
            session.commit();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
        return students;
    }
    /*查询所有返回Map集合*/
    @Override
    public Map<String, Object> selectAllByMap() {
        //获取session
        SqlSession session = null;
        Map<String, Object> students=null;
        try {
            session = SessionFactoryUtil.getSession();
            /*s1 map集合中的key*/
            students= session.selectMap("selectAllByMap","name");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
        return  students;
    }
    /*查询指定id的学生*/
    @Override
    public Student selectStudentById(Serializable id) {
        //获取session
        SqlSession session = null;
        Student student=null;
        try {
            session = SessionFactoryUtil.getSession();
            student= session.selectOne("selectStudentById",id);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
        return  student;
    }
    /*根据名字模糊查询*/
    @Override
    public List<Student> selectByName(String name) {
        //获取session
        SqlSession session = null;
        List<Student> students=null;
        try {
            session = SessionFactoryUtil.getSession();
            //查询所有操作
            students = session.selectList("selectByName",name);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
        return  students;
    }
}
