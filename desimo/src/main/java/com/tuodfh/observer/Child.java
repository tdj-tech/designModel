package com.tuodfh.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author tdj
 * 2022/4/18 0018
 * 事件源 小孩
 */
public class Child {

    List<WakeUpObserver> wakeUpObservers = new ArrayList<>();

    public Child addObserver(WakeUpObserver wakeUpObserver) {
        wakeUpObservers.add(wakeUpObserver);
        return this;
    }

    public void wakeUp() {
        System.out.println("宝宝醒了");
        WakeUpEvent event = new WakeUpEvent();
        event.setSource(this);
        event.setType(1);
        for (WakeUpObserver wakeUpObserver : wakeUpObservers) {
            if (!wakeUpObserver.doObserver(event)) {
                break;
            }
        }
    }

}
