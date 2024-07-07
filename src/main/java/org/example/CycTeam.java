package org.example;

public class CycTeam {
   private String teamName;
   private String teamLeadName;
   private String tourName;
   private int numOfPlayers;

   public static final class CycTeamBuilder {
      private String teamName;
      private String teamLeadName;
      private String tourName;
      private int numOfPlayers;

      CycTeamBuilder() {
      }

      public static CycTeamBuilder aCycTeam() {
         return new CycTeamBuilder();
      }

      public CycTeamBuilder withTeamName(String teamName) {
         this.teamName = teamName;
         return this;
      }

      public CycTeamBuilder withTeamLeadName(String teamLeadName) {
         this.teamLeadName = teamLeadName;
         return this;
      }

      public CycTeamBuilder withTourName(String tourName) {
         this.tourName = tourName;
         return this;
      }

      public CycTeamBuilder withNumOfPlayers(int numOfPlayers) {
         this.numOfPlayers = numOfPlayers;
         return this;
      }

      public CycTeam build() {
         CycTeam cycTeam = new CycTeam();
         cycTeam.teamLeadName = this.teamLeadName;
         cycTeam.tourName = this.tourName;
         cycTeam.teamName = this.teamName;
         cycTeam.numOfPlayers = this.numOfPlayers;
         return cycTeam;
      }
   }

   public String toString(){
      return "Bisiklet takımı{ " + "Takım adı: " + teamName +
              "\nTakım lideri adı: "+ teamLeadName +
              "\nBisiklet turu adı: "+ tourName +
              "\nTakımdaki oyuncu sayısı: " + numOfPlayers + " }";
   }

  /* public String infoTeam(){
      String info=("Takım adı: " + teamName +
             "Takım lideri adı: "+ teamLeadName +
              "Bisiklet turu adı: "+ tourName +
              "Takımdaki oyuncu sayısı: " + numOfPlayers
            ) ;
      return info;
   }*/

}
