package com.tuodfh.brige;

/**
 * @author tdj
 * 2022/4/25 0025
 * @desc
 */
public class ColdGift extends AbstractGift {

    AbstractGiftImp giftImp;

    public ColdGift() {
    }

    public ColdGift(AbstractGiftImp giftImp) {
        this.giftImp = giftImp;
    }

    @Override
    String getName() {
        return giftImp.getName();
    }
}
