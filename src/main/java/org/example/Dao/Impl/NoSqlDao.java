package org.example.Dao.Impl;

import org.example.Dao.Interface.Dao;

public class NoSqlDao implements Dao {


    @Override
    public int fetchMagicNumber() {
        System.out.println("this is a fetch from a no sql db");
        return 10;
    }
}
