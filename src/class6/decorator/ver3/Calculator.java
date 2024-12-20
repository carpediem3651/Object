package class6.decorator.ver3;

abstract class Calculator {
    private Calculator next;
    public final Calculator setNext(Calculator next){
        this.next = next;
        return this;
    }
    public final Money calCallFee(Set<Call> calls, Money result){
        result = calc(calls, result);
        return next == null ? result : next.calcCallFee(calls, result);
    }

    abstract protected Money calc(Set<Call> calls, Money result);
}
