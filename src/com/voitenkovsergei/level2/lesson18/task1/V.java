package com.voitenkovsergei.level2.lesson18.task1;

public class V {

    private final String value;

    public V(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "V{" +
                "value='" + value + '\'' +
                '}';
    }

    public String getValue() {
        return value;
    }
}
