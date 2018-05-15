package cn.zywy.dao;

import cn.zywy.bean.Student;
import cn.zywy.util.SessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;

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
}
