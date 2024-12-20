package class6.combination;

import java.util.Set;

abstract class Plan {
    private Calculator calc;
    private Set<Call> calls = new HashSet<>();

    public final void addCall(Call call) {
        calls.add(call);
    }

    public final void setCalculator(calculator calc) {
        this.calc = calc;
    }
    public final Money calculateFee(Calculator calc){
        Money result = Money.ZERO;
        for(Call call : calls) result = result.plus(calcCallFee(call));
        return result;
    }
}
