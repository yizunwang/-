package com.dao;

import com.pojo.T_BM_Currency;

public interface T_BM_CurrencyMapper {
    int deleteByPrimaryKey(Integer currenyId);

    int insert(T_BM_Currency record);

    int insertSelective(T_BM_Currency record);

    T_BM_Currency selectByPrimaryKey(Integer currenyId);

    int updateByPrimaryKeySelective(T_BM_Currency record);

    int updateByPrimaryKey(T_BM_Currency record);
}