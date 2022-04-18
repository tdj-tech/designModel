package com.tuodfh.observer;

/**
 * @author tdj
 * 2022/4/18 0018
 * 母亲
 */
public class Mother implements WakeUpObserver {
    @Override
    public boolean doObserver(WakeUpEvent wakeUpEvent) {
        if (wakeUpEvent.getSource() instanceof Child) {
            // 大哭
            if (wakeUpEvent.getType() == 1) {
                System.out.println("妈咪来了.....");
            }
            // 小哭
            if (wakeUpEvent.getType() == 2) {
                System.out.println("妈咪一会就来了.....");
            }
            return false;
        }
        return true;
    }
}
