package model;


public enum CurrencyKind {

    USD(1,"USD"),
    EUR(1.07435,"EUR"),
    AUD(0.76926 , "AUD"),
    JPY(0.00888, "JPY" ),
    CNY(0.144749 , "CNY"),
    GBP(1.23743 , "GBP");

    private double mConversionValue;
    private String mCurrencyName;


    CurrencyKind(double value, String currencyName) {
        mConversionValue = value;
        mCurrencyName = currencyName;
}

    public String getCurrencyName() {
        return mCurrencyName;
    }

    public double getConversionValue() {
        return mConversionValue;
    }

/*    public void setConversionValue(double conversionValue) {
        mConversionValue = conversionValue;
    }*/
}
