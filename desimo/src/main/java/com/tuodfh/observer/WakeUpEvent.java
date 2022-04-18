package com.tuodfh.observer;

/**
 * @author tdj
 * 2022/4/18 0018
 * 醒事件对象
 */
public class WakeUpEvent {

    long timestamp;
    String loc;
    int type;
    Object source;

    public WakeUpEvent() {
    }

    public WakeUpEvent(int type, Object source) {
        this.type = type;
        this.source = source;
    }

    public WakeUpEvent(long timestamp, String loc, int type, Object source) {
        this.timestamp = timestamp;
        this.loc = loc;
        this.type = type;
        this.source = source;
    }

    public Object getSource() {
        return source;
    }

    public void setSource(Object source) {
        this.source = source;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
