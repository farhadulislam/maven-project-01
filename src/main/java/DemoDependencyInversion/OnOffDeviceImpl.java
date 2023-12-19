package DemoDependencyInversion;

public class OnOffDeviceImpl implements OnOffDevice {
    private OnOffDevice onOffDevice;
    @Override
    public void turnOn() {
        onOffDevice.turnOn();
    }

    @Override
    public void turnOff() {
        onOffDevice.turnOff();
    }

}
