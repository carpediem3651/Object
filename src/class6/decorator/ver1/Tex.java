package class6.decorator.ver1;

public class Tex implements Calculator{
    private final Calculator next;
    private final double ratio;
    public Tex(Calculator next, double ratio) {
        this.next = next;
        this.ratio = ratio;
    }

    @Override
    public Money calcCallFee(Set<Call> calls, Money result) {
        result = result.plus(result.times(ratio));
        return next == null ? result : next.calcCallFee(calls, result);
    }
}
