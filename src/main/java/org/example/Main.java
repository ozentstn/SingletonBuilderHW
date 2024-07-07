package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CycTeamSingleton cycTeamSingleton=CycTeamSingleton.getInstance();

        CycTeam cycTeam=new CycTeam.CycTeamBuilder()
                .withTeamName("Sky Team")
                .withTeamLeadName("Chris Froome")
                .withTourName("Tour de France")
                .withNumOfPlayers(20)
                .build();

        System.out.println(cycTeam);
    }
}