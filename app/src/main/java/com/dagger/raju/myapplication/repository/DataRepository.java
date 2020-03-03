package com.dagger.raju.myapplication.repository;

public class DataRepository implements IDataRepository {
    @Override
    public String getData() {
        return "DataRepository";
    }
}
