package class6.decorator.ver1;

public class NightDiscount implements Calculator{
    private final Calculator calculator;
    private final Money dayPrice;
    private final Money nightPrice;
    private final Duration duration;

    public NightDiscount(Calculator next, Money dayPrice, Money nightPrice, Duration second) {
        this.next = next;
        this.dayPrice = dayPrice;
        this.nightPrice = nightPrice;
        this.second = second;
    }

    @Override
    public Money calcCallFee(Set<Call> calls, Money result) {
        for(Call call : calls) {
            Money price = call.getFrom().getHour() >= 22 ? nightPrice : dayPrice;
            result = result.plus(price.times((call.getDuration().getSeconds() / second.getSeconds())));
        }
        return next == null ? result : next.calCallFee(calls, result);
    }
}
