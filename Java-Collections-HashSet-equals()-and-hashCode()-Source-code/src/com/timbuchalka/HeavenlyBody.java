package com.timbuchalka;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by dev on 12/01/2016.
 */
public abstract class HeavenlyBody {
    private final bodyTypes bodyType;
    private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;
    public enum bodyTypes{
        STAR,
        PLANET,
        MOON,
        DWARF_PLANET
    }
    public HeavenlyBody(bodyTypes bodyType, String name, double orbitalPeriod) {
        this.bodyType = bodyType;
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public bodyTypes getBodyType() {
        return bodyType;
    }

    public boolean addSatellite(HeavenlyBody moon) {

        return this.satellites.add(moon);
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }

    public final boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if (obj instanceof HeavenlyBody){
            HeavenlyBody  theObject = (HeavenlyBody) obj;
            if (this.name.equals(theObject.getName())){
                return this.bodyType == theObject.getBodyType();
            }
        }

        String objName = ((HeavenlyBody) obj).getName();
        return this.name.equals(objName);
    }


    @Override
    public final int hashCode() {
        return this.name.hashCode() + 57 + this.bodyType.hashCode();
    }

    @Override
    public String toString() {
        return this.name + ": " + this.bodyType + ", " + this.orbitalPeriod;
    }



}
