package cn.zywy;


import cn.zywy.bean.Countrys;
import cn.zywy.dao.CountrysDao;
import cn.zywy.util.SessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class CountrysTest {
    CountrysDao dao=null;
    SqlSession session=null;
    Logger log=Logger.getLogger(CountrysTest.class);
    @Before
    public void before(){
        session= SessionFactoryUtil.getSession();
        dao=session.getMapper(CountrysDao.class);
    }
    @After
    public void after(){
        if (session!=null){
            session.close();
        }
    }
    /**
     * 没有延迟加载
     */
    @Test
    public  void selectCountry(){
        Countrys country = dao.selectCountryById(1);
        log.debug(country);
    }
    /**
     * 有延迟加载
     */
    @Test
    public  void selectCountryLazy(){
        Countrys country = dao.selectCountryById(1);
        log.debug(country.getcName());
        log.debug(country.getcName());
        log.debug(country.getProvincials());
    }
}
