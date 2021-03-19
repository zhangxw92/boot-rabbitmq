package com.athome.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author zhangxw03
 * @Dat 2021-03-19 11:22
 * @Describe
 */
public class SiteFactory {
    private SiteFactory() {
    }

    private static Map<Integer, Site> map = new HashMap<>();

    public static Site getSite(Integer type) {
        if (!map.containsKey(type)) {
            if (type.equals(1)) {
                map.put(type, new BolgSite(1));
            } else if (type.equals(2)) {
                map.put(type, new XinLangSite(2));
            }
        }
        return map.get(type);
    }

    public static void main(String[] args) {
        Site site = SiteFactory.getSite(1);
        Site site2 = SiteFactory.getSite(1);

        System.out.println(site);
        System.out.println(site2);

    }
}
