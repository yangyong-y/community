package com.newcoder.community.dao;

import org.springframework.stereotype.Repository;

@Repository("alphaHibernate")
public class AlphadaoHibernateImpl implements Alphadao {
    @Override
    public String select() {
        return "Hibernate";
    }
}
