package com.timbuchalka;

public class Moon extends HeavenlyBody{
    public Moon(String name, double orbitalPeriod) {
        super(bodyTypes.MOON, name, orbitalPeriod);
    }
}
