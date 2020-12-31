package com.thoughtworks.basic;

public class Box {
    private int  box_number;
    private String time_point;
    private String self_hash_value;
    private String pre_hash_value;
    private int lucky_number;
}


/* 宝箱编号、时间戳、Hash值、上一个宝箱的Hash值、神秘数字
宝箱属性说明：
宝箱编号：从1到10；
时间戳：当你尝试打开宝箱时，记录下时间；
Hash值：将宝箱编号、时间戳、上一个宝箱的Hash值、神秘数字拼成一个字符串，然后求字符串的Hash值，Hash统一采用sha256算法；
上一个宝箱的Hash值：上一个序号的宝箱的Hash值，1号宝箱的上一个宝箱的Hash值是0；
神秘数字：可以打开宝箱的神秘数字，是一个正整数；
宝箱开启规则：找到那个神秘数字，使得宝箱的Hash值的前5位都是数字0，宝箱即为开启状态*/