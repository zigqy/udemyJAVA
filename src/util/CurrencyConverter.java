package util;

public class CurrencyConverter {

    public static final double IOF = 0.06;

public static double dolToReal(double dollarPrice, double amount){
    double valueInReais = dollarPrice * amount;
valueInReais += valueInReais * IOF;
return  valueInReais;
    }
}




