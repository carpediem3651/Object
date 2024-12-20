package class6.decorator.ver2;

import class6.decorator.ver1.Calculator;

public class AmountDiscount extends Calculator {
    private final Money amount;
    public RateDiscount(Money amount){
        this.amount = amount;
    }

    @Override
    public Money calcCallFee(Set<Call> calls, Money result) {
        result = result.minus(amount);
        return result;
    }
}
