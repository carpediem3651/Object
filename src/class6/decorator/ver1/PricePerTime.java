package class6.decorator.ver1;

public class PricePerTime implements Calculator {
    private final Calculator next;
    private final Money price;
    private final Duration second;

    public PricePerTime(Calculator next, Money price, Duration second) {
        this.next = next;
        this.price = price;
        this.second = second;
    }

    @Override
    protected Money calcCallFee(Call call) {
        for(Call call : calls){
            // result 축적
            result = result.plus(price.times((call.getDuration().getSeconds() / second.getSeconds())));
        }
        // 다음으로 떠넘기기
        return next == null ? result : next.calcCallFee(calls, result);
    }
}
