package org.example.Dao.Impl;

import org.example.Dao.Interface.Dao;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
@Primary
@Component("sqlDao")
public class SqlDao implements Dao {

    @Override
    public int fetchMagicNumber() {
        System.out.println("this is a fetch from a sql db");
        return 93;
    }
}
