package class6.decorator.ver2;

import class6.combination.Calculator;

import java.util.Set;

public class Plan {
    private Calculator calc;
    private Set<Call> calls = new HashSet<>();

    public final void addCall(Call call) {
        calls.add(call);
    }

    public final void setCalculator(calculator calc) {
        this.calc = calc;
    }
    public final Money calculateFee(Calculator calc){
        return calc.calcCallFee(calls, Money.ZERO);
    }
}
