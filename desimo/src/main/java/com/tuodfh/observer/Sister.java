package com.tuodfh.observer;

/**
 * @author tdj
 * 2022/4/18 0018
 * @desc
 */
public class Sister implements WakeUpObserver {
    @Override
    public boolean doObserver(WakeUpEvent wakeUpEvent) {
        if (wakeUpEvent.getSource() instanceof Child) {
            // 大哭
            if (wakeUpEvent.getType() == 1) {
                System.out.println("姐姐来了......");
            }
            // 小哭
            if (wakeUpEvent.getType() == 2) {
                System.out.println("继续玩耍中......");
            }
            return true;
        }
        return true;
    }
}
