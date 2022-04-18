package com.tuodfh.observer;

/**
 * @author tdj
 * 2022/4/18 0018
 * 老爸
 */
public class Dad implements WakeUpObserver {

    @Override
    public boolean doObserver(WakeUpEvent wakeUpEvent) {
        if (wakeUpEvent.getSource() instanceof Child) {
            // 大哭
            if (wakeUpEvent.getType() == 1) {
                System.out.println("孩子大哭了，孩他妈呢？");
            }
            // 小哭
            if (wakeUpEvent.getType() == 2) {
                System.out.println("继续玩游戏中......");
            }
            return true;
        }
        return true;
    }
}
