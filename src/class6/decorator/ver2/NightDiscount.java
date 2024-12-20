package class6.decorator.ver2;


public class NightDiscount extends Calculator {
    private final Money dayPrice;
    private final Money nightPrice;
    private final Duration duration;

    public NightDiscount(Money dayPrice, Money nightPrice, Duration second) {
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
        return result;
    }
}
