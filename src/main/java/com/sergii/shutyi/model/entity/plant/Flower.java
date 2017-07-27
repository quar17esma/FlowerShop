package com.sergii.shutyi.model.entity.plant;

public class Flower extends Plant {
    private boolean isFeedingNeed;
    private boolean isSupportNeed;

    public boolean isFeedingNeed() {
        return isFeedingNeed;
    }

    public void setFeedingNeed(boolean feedingNeed) {
        isFeedingNeed = feedingNeed;
    }

    public boolean isSupportNeed() {
        return isSupportNeed;
    }

    public void setSupportNeed(boolean supportNeed) {
        isSupportNeed = supportNeed;
    }
}
