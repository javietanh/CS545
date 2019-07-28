package edu.mum.cs.domain;

import java.io.Serializable;

public class Calculator implements Serializable {
    private static final long serialVersionUID = 748392348L;

    private Double add1;
    private Double add2;
    private Double sum;
    private Double mult1;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Double getAdd1() {
        return add1;
    }

    public void setAdd1(Double add1) {
        this.add1 = add1;
    }

    public Double getAdd2() {
        return add2;
    }

    public void setAdd2(Double add2) {
        this.add2 = add2;
    }

    public Double getSum() {
        return sum;
    }

    public void setSum(Double sum) {
        this.sum = sum;
    }

    public Double getMult1() {
        return mult1;
    }

    public void setMult1(Double mult1) {
        this.mult1 = mult1;
    }

    public Double getMult2() {
        return mult2;
    }

    public void setMult2(Double mult2) {
        this.mult2 = mult2;
    }

    public Double getProduct() {
        return product;
    }

    public void setProduct(Double product) {
        this.product = product;
    }

    private Double mult2;
    private Double product;
}
