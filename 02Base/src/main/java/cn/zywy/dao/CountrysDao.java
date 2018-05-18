package cn.zywy.dao;

import cn.zywy.bean.Countrys;

import java.io.Serializable;

public interface CountrysDao {
    Countrys selectCountryById(Serializable id);
}
