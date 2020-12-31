package com.thoughtworks.basic;

public class OpenBox {
        public static Box getTreasureBox(int boxNumber, String preHashValue) {
            String hashStr = boxNumber + "" + preHashValue;
            HashValueAndLuckyNumber hashValueAndLuckyNumber = HashCalcute.getHashAndLuckyNum(hashStr);
            if (hashValueAndLuckyNumber != null) {
                return new Box(boxNumber, hashValueAndLuckyNumber.getHashValue(), preHashValue, hashValueAndLuckyNumber.getLuckNumber());
            }
            return null;
        }
}
