package com.java.oop.data;

public interface ReposutoryComputer extends RepoComputerStorage{
    void spesifikasi();

    String jamanNow();

    default String sponsoredAplication(){
        return "Tokopedia";
    }
}
