package com.quest.telecom;

import java.io.Serializable;
import java.util.Date;

public class CallRecord implements Serializable {
    private String subscriberID;
    private String callType;
    private int duration;
    private Date timeStamp;

    public CallRecord(String subscriberID, String callType, int duration, Date timeStamp) {
        this.subscriberID = subscriberID;
        this.callType = callType;
        this.duration = duration;
        this.timeStamp = timeStamp;
    }

    public String getSubscriberID() {
        return subscriberID;
    }

    public void setSubscriberID(String subscriberID) {
        this.subscriberID = subscriberID;
    }

    public String getCallType() {
        return callType;
    }

    public void setCallType(String callType) {
        this.callType = callType;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    @Override
    public String toString() {
        return "CallRecord{" +
                "subscriberID='" + subscriberID + '\'' +
                ", callType='" + callType + '\'' +
                ", duration=" + duration +
                ", date=" + timeStamp +
                '}';
    }
}
