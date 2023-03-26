package ro.sda.advanced._06_generics;
public class FootballTeam extends Team<FootballTeam> {
    public FootballTeam(String name) {
        super(name);
    }

}