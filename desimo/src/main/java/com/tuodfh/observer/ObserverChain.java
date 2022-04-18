package com.tuodfh.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author tdj
 * 2022/4/18 0018
 * @desc
 */
public class ObserverChain implements WakeUpObserver {

    List<WakeUpObserver> wakeUpObservers = new ArrayList<>();

    @Override
    public boolean doObserver(WakeUpEvent wakeUpEvent) {
        for (WakeUpObserver wakeUpObserver : wakeUpObservers) {
            if (!wakeUpObserver.doObserver(wakeUpEvent)) {
                return false;
            }
        }
        return true;
    }

    public ObserverChain addObserver(WakeUpObserver wakeUpObserver) {
        wakeUpObservers.add(wakeUpObserver);
        return this;
    }
}
