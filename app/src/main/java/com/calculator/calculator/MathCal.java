package com.calculator.calculator;

class MathCal implements cal{

    @Override
    public String add(Numbers n) {
        String add= (String.valueOf((n.getFirstNumber())+(n.getSecondNumber())));
        return add;
    }

    @Override
    public String sub(Numbers n) {
        String add= (String.valueOf((n.getFirstNumber())-(n.getSecondNumber())));
        return add;
    }

    @Override
    public String divide(Numbers n) {
        String add= (String.valueOf((n.getFirstNumber())/(n.getSecondNumber())));
        return add;
    }

    @Override
    public String mul(Numbers n) {
        String add= (String.valueOf((n.getFirstNumber())*(n.getSecondNumber())));
        return add;
    }
}
