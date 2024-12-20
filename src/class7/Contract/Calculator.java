package class7.Contract;

abstract class Calculator {
    private Calculator next;
    public final Calculator setNext(Calculator next){
        if(next == null) throw new IllegalArgumentException("next is null");
        calcs.add(next);
        return this;
    }
    public final Money calCallFee(Set<Call> calls, Money result){
        if(calcs.size() > 0) throw new IllegalArgumentException("calc is empty");
        for(Calc calc : calcs) result = calc.calc(calls, result);
        if(calls.size() > 0 && (
                result.equals(Money.ZERO) ||
                        result.isLessThan(Money.ZERO)
        )) throw new RuntimeException("calculate error");
        return result;
    }
    public final void check(){
        if(calcs.size() > 0) throw new IllegalArgumentException("calc is empty");
    }
}
