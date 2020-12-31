package com.thoughtworks.basic;

import com.sun.org.apache.xpath.internal.operations.String;

public class Box {
    private int  box_number;
    private String self_hash_value;
    private String pre_hash_value;
    private Integer lucky_number;

    //构造宝箱函数
    public Box(int boxNumber, String selfHashValue, String preHashValue, Integer luckyNumber) {
        this.box_number = boxNumber;
        this.self_hash_value = selfHashValue;
        this.pre_hash_value = preHashValue;
        this.lucky_number = luckyNumber;
    }


    public String getHashValue() {
        return self_hash_value;
    }

    @Override
    public java.lang.String toString() {
        return this.box_number + "号宝箱对应的神秘数字为：" + this.lucky_number;
    }

}


/* 宝箱编号、时间戳、Hash值、上一个宝箱的Hash值、神秘数字
宝箱属性说明：
宝箱编号：从1到10；
Hash值：将宝箱编号、上一个宝箱的Hash值、神秘数字拼成一个字符串，然后求字符串的Hash值，Hash统一采用sha256算法；
上一个宝箱的Hash值：上一个序号的宝箱的Hash值，1号宝箱的上一个宝箱的Hash值是0；
神秘数字：可以打开宝箱的神秘数字，是一个正整数；
宝箱开启规则：找到那个神秘数字，使得宝箱的Hash值的前5位都是数字0，宝箱即为开启状态*/