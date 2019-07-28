package edu.mum.domain;

import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;

public class Phone {

    @NotNull
    @Range(min = 100, max = 999, message = "{phone.area.range.validation}")
    private Integer area;

    @NotNull
    @Range(min = 100, max = 999, message = "{phone.prefix.range.validation}")
    private Integer prefix;

    @Range(min = 1000, max = 9999, message = "{phone.number.range.validation}")
    @NotNull
    private Integer number;

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public Integer getPrefix() {
        return prefix;
    }

    public void setPrefix(Integer prefix) {
        this.prefix = prefix;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return String.format("(%s) %s %s", area, prefix, number);
    }
}
