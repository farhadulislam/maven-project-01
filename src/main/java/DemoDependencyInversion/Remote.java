package DemoDependencyInversion;

public class Remote {

    private OnOffDevice onOffDevice;

    public void turnOn(OnOffDevice onOffDevice) {
        onOffDevice.turnOn();
    }

    public void turnOff(OnOffDevice onOffDevice) {
        onOffDevice.turnOff();
    }
}
