package com.kavinschool.verify;

import java.nio.charset.Charset;
import java.text.DecimalFormat;

public class NumberCurrencySymbolVerify {

    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private static final DecimalFormat CURRENCY = new DecimalFormat("$#,##0.00;-$#,##0.00");

    public static void main(String[] args) {
        double premium = 100d;
        String premiumCurrency = CURRENCY.format(premium);
        System.out.println(premiumCurrency);
    }
}
