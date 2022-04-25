package com.tuodfh.brige;

/**
 * @author tdj
 * 2022/4/25 0025
 * @desc
 */
public class WormGift extends AbstractGift {

    AbstractGiftImp giftImp;

    public WormGift() {
    }

    public WormGift(AbstractGiftImp giftImp) {
        this.giftImp = giftImp;
    }

    @Override
    String getName() {
        return giftImp.getName();
    }
}
