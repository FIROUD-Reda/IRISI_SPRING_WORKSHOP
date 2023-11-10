package org.example.Service.Impl;

import org.example.Dao.Impl.SqlDao;
import org.example.Dao.Interface.Dao;
import org.example.Service.Interface.Calculator;

public class CalculatorImpl implements Calculator {
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
