package com.dylanrathbone.app;

import com.dylanrathbone.app.services.AirCraft;
import com.google.inject.Inject;

class AirCraftFactory
{

    private AirCraft airCraft;

    @Inject
    public AirCraftFactory(AirCraft airCraft) {
       this.setAirCraft(airCraft);
    }

    public AirCraft getAirCraft() {
        return airCraft;
    }

    public void setAirCraft(AirCraft airCraft) {
        this.airCraft = airCraft;
    }
}
