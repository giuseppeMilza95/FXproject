package com.timbuchalka;

public class Planet extends HeavenlyBody{
    public Planet( String name, double orbitalPeriod) {
        super(bodyTypes.PLANET, name, orbitalPeriod);
    }

    @Override
    public boolean addSatellite(HeavenlyBody moon) {
        if (moon.getBodyType() == bodyTypes.MOON){
            return super.addSatellite(moon);
        } else {
            return false;
        }
    }
}
