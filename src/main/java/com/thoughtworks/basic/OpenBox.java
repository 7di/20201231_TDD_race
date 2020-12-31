package com.thoughtworks.basic;

public class OpenBox {
        public static Box getTreasureBox(int id, String preHashValue) {
            String hashStr = id + "" + preHashValue;
            HashValueAndLuckyNumber hashValueAndLuckyNumber = HashCalcute.getHashAndLuckyNum(hashStr);
            if (hashValueAndLuckyNumber != null) {
                return new Box(id, hashValueAndLuckyNumber.getHashValue(), preHashValue, hashValueAndLuckyNumber.getLuckNumber());
            }
            return null;
        }
}
