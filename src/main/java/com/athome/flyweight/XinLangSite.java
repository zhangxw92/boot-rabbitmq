package com.athome.flyweight;

/**
 * @Author zhangxw03
 * @Dat 2021-03-19 11:19
 * @Describe
 */
public class XinLangSite extends Site {

    public XinLangSite(Integer type) {
        super(type);
    }

    @Override
    protected void use(User user) {
        System.out.println("这是新浪网站，使用者：" + user.name);
    }
}
