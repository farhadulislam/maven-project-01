package DemoDependencyInversion;


public class Televison implements OnOffDevice{

    private Boolean tvStatus;

    public Televison() {
        if(null != tvStatus && Boolean.TRUE.equals(tvStatus))
            tvStatus = Boolean.FALSE;
    }

    @Override
    public void turnOn() {
        tvStatus = tvStatus != null ? Boolean.TRUE : Boolean.FALSE;
        System.out.println("TV ON: " + tvStatus.toString());
    }

    @Override
    public void turnOff() {
        tvStatus = tvStatus != null ? Boolean.FALSE : Boolean.TRUE;
        System.out.println("TV ON: " + tvStatus.toString());
    }
}
