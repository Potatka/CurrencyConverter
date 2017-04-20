package model;


public class Currency {

    private CurrencyKind mCurrencyKind;
    private CurrencyKind mNewCurrencyKind;


    private double mCurrentMoney;


    public Currency() {

        mCurrencyKind = CurrencyKind.USD;


    }
    public Currency(CurrencyKind kind, CurrencyKind newCurrencyKind) {
        mCurrencyKind = kind;
        mNewCurrencyKind = newCurrencyKind;

    }

    public double getCurrentMoney() {
        return mCurrentMoney;
    }

    public void setCurrentMoney(double currentMoney) {
        mCurrentMoney = currentMoney;
    }

    public CurrencyKind getCurrencyKind() {
        return mCurrencyKind;
    }

    public CurrencyKind getNewCurrencyKind() {
        return mNewCurrencyKind;
    }

    public void setNewCurrencyKind(CurrencyKind newCurrencyKind) {
        mNewCurrencyKind = newCurrencyKind;
    }

    public void setCurrencyKind(CurrencyKind currencyKind) {
        mCurrencyKind = currencyKind;
    }



}
