package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import model.Currency;
import model.CurrencyKind;


public class Controller {

    private Currency mCurrency;
    private CurrencyKind mKind;
    private CurrencyKind mKindTo;
    private double mAnswer;
    private double moneySubmitAmount;

    @FXML
    private VBox container;
    @FXML
    private TextField moneyOutput;
    @FXML
    private TextField moneyInput;
    @FXML
    private Label headerText;


    public Controller() {
        mKind = CurrencyKind.USD;
        mKindTo = CurrencyKind.USD;
}

    public void prepareConversion() {
        if (moneyInput.getText().isEmpty()) {
            moneyInput.setPromptText("Please enter a number");
            setToDefault();
        } else {
            if (mKind == null && mKindTo == null) {
                setToDefault();
            }
            moneySubmitAmount = Double.parseDouble(moneyInput.getText());
            mCurrency = new Currency();
            mCurrency.setCurrentMoney(moneySubmitAmount);
            calculate(mKind, mKindTo);
        }


    }

    public double calculate(CurrencyKind kind, CurrencyKind newKind) {
        // double calculation = mCurrency.getCurrentMoney() * mKind.getConversionValue() *(1/mKindTo.getConversionValue());
        mAnswer = mCurrency.getCurrentMoney() * mKind.getConversionValue() * (1 / mKindTo.getConversionValue());
        String output = Double.toString(mAnswer) + " " + mKindTo.getCurrencyName();
        moneyOutput.setText(output);
        return mAnswer;
    }

    public void setToDefault() {
        mKind = CurrencyKind.USD;
        mKindTo = CurrencyKind.USD;
        setLabelText(mKind, mKindTo);

    }

    //-----------------------------------------------FROM---------------------------------------//
    public void handleUSD(ActionEvent actionEvent) {
        mKind = CurrencyKind.USD;
        setLabelText(mKind, mKindTo);
       /* if(mAnswer != null) {
            convertedMoney = mAnswer;
        }
*/

    }

    public void handleEUR(ActionEvent actionEvent) {
        mKind = CurrencyKind.EUR;
        setLabelText(mKind, mKindTo);


    }

    public void handleAUD(ActionEvent actionEvent) {
        mKind = CurrencyKind.AUD;
        setLabelText(mKind, mKindTo);
    }

    public void handleJPY(ActionEvent actionEvent) {
        mKind = CurrencyKind.JPY;
        setLabelText(mKind, mKindTo);
    }

    public void handleCNY(ActionEvent actionEvent) {
        mKind = CurrencyKind.CNY;
        setLabelText(mKind, mKindTo);
    }

    public void handleGBP(ActionEvent actionEvent) {
        mKind = CurrencyKind.GBP;
        setLabelText(mKind, mKindTo);
    }

    //---------------------------------TO---------------------------------------------------------------//

    public void handleUSDto(ActionEvent actionEvent) {
        mKindTo = CurrencyKind.USD;
        setLabelText(mKind, mKindTo);
       /* if(mAnswer != null) {
            convertedMoney = mAnswer;
        }
*/

    }

    public void handleEURto(ActionEvent actionEvent) {
        mKindTo = CurrencyKind.EUR;
        setLabelText(mKind, mKindTo);


    }

    public void handleAUDto(ActionEvent actionEvent) {
        mKindTo = CurrencyKind.AUD;
        setLabelText(mKind, mKindTo);
    }

    public void handleJPYto(ActionEvent actionEvent) {
        mKindTo = CurrencyKind.JPY;
        setLabelText(mKind, mKindTo);
    }

    public void handleCNYto(ActionEvent actionEvent) {
        mKindTo = CurrencyKind.CNY;
        setLabelText(mKind, mKindTo);
    }

    public void handleGBPto(ActionEvent actionEvent) {
        mKindTo = CurrencyKind.GBP;
        setLabelText(mKind, mKindTo);
    }


    public void setLabelText(CurrencyKind mKind, CurrencyKind mKindTo) {
        if (mKind == null && mKindTo == null) {
            setToDefault();
        }
        String value = "Currency selected: " + mKind.getCurrencyName() + " to " + mKindTo.getCurrencyName();
        headerText.setText(value);


    }


    public void handleSubmit(ActionEvent actionEvent) {
        prepareConversion();
    }

    public void handleReset(ActionEvent actionEvent) {
        setToDefault();
        moneyInput.clear();
        moneyOutput.clear();
    }
}

