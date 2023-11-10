package org.example.Service.Impl;

import org.example.Dao.Interface.Dao;
import org.example.Service.Interface.Calculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("calculator")
public class CalculatorImpl implements Calculator {
    @Autowired
            @Qualifier("noSqlDao")
    Dao dao;

    public CalculatorImpl(Dao dao) {
        this.dao=dao;
    }

    public Dao getDao() {
        return dao;
    }

    public void setDao(Dao dao) {
        this.dao = dao;
    }

    @Override
    public int addNumberToMagicNumberFromDb(int x) {

        return x+dao.fetchMagicNumber();
    }
}
