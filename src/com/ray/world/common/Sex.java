package com.ray.world.common;

public enum Sex {
    Male("Male", 1), Female("Femal", 2);
    
    
    private String symbol;
    private int value;
    private Sex(String symbol, int value) {
        this.symbol = symbol;
        this.value = value;
    }
    
    public String getSymbol() {
        return symbol;
    }
    
    public int getValue() {
        return value;
    }
    
}
