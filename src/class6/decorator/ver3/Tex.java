package class6.decorator.ver3;

import class6.decorator.ver1.Calculator;

public class Tex extends Calculator {
    private final double ratio;
    public Tex(double ratio) {
        this.ratio = ratio;
    }

    @Override
    public Money calcCallFee(Set<Call> calls, Money result) {
        result = result.plus(result.times(ratio));
        return result;
    }
}
