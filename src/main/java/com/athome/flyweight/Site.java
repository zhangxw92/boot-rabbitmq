package com.athome.flyweight;

/**
 * @Author zhangxw03
 * @Dat 2021-03-19 11:16
 * @Describe
 */
public abstract class Site {
    private Integer type;

    public Site(Integer type) {
        this.type = type;
    }

    protected abstract void use(User user);
}
