package model;

import json.OpenValue;

public class Cash extends OpenValue {


    private String code;
    private double value;

    public Cash(String code, double value) {
        this.code = code;
        this.value = value;
    }

    public Cash() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
