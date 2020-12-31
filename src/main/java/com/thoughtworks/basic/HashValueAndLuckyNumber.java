package com.thoughtworks.basic;

public class HashValueAndLuckyNumber {
    //hash值
    private String hashValue;

    //神秘数字
    private Integer luckNumber;

    public HashValueAndLuckyNumber(String hash, Integer secretNum) {
        this.hashValue = hash;
        this.luckNumber = secretNum;
    }

    public String getHashValue() {
        return hashValue;
    }

    public Integer getLuckNumber() {
        return luckNumber;
    }

    @Override
    public String toString() {
        return "HashAndSecretNum{" +
                "hashValue='" + hashValue + '\'' +
                ", luckNumber=" + luckNumber +
                '}';
    }

}
