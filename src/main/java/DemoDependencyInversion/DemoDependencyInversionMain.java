package DemoDependencyInversion;

public class DemoDependencyInversionMain {
    public static void main(String[] args) {

        OnOffDevice tv = new Televison();
        Remote remote = new Remote();
        remote.turnOn(tv);
    }
}
