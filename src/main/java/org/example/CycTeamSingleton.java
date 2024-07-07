package org.example;

public class CycTeamSingleton {
    private static CycTeamSingleton instance;

    private CycTeamSingleton(){
    }

    public static CycTeamSingleton getInstance(){
        if (instance==null){
            instance=new CycTeamSingleton();
        } return instance;
    }
}
