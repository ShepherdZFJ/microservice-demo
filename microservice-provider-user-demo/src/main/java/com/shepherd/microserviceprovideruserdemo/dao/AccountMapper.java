package com.shepherd.microserviceprovideruserdemo.dao;

import com.shepherd.microserviceprovideruserdemo.domain.Account;

public interface AccountMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Account record);

    int insertSelective(Account record);

    Account selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Account record);

    int updateByPrimaryKey(Account record);
}