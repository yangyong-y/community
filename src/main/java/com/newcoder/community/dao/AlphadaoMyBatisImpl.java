package com.newcoder.community.dao;

import com.newcoder.community.dao.Alphadao;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class AlphadaoMyBatisImpl implements Alphadao {

    @Override
    public  String select()
    {
        return "MyBtis";
    }
}
