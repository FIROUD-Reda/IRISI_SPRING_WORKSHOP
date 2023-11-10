package org.example.Dao.Impl;

import org.example.Dao.Interface.Dao;

public class SqlDao implements Dao {

    @Override
    public int fetchMagicNumber() {
        System.out.println("this is a fetch from a sql db");
        return 93;
    }
}
