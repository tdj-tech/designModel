package com.tuodfh.prototype;

/**
 * @author tdj
 * 2022/4/26 0026
 * @desc
 */
public class LocBuffer implements Cloneable {

    StringBuffer stree;
    int no;

    public LocBuffer() {
    }

    public LocBuffer(StringBuffer stree, int no) {
        this.stree = stree;
        this.no = no;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Loc{");
        sb.append("stree='").append(stree).append('\'');
        sb.append(", no=").append(no);
        sb.append('}');
        return sb.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
