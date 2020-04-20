package com.example.calorie_counter.util;

import java.text.DecimalFormat;

public class Util {

    public static  String formatNumber(int value) {

        DecimalFormat formatter = new DecimalFormat("#,###,###");
        String formatted = formatter.format(value);

        return formatted;
    }
}
