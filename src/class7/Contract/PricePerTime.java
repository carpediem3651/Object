package class7.Contract;

public class PricePerTime extends Calculator {
    private final Money price;
    private final Duration second;

    public PricePerTime(class6.decorator.ver3.Calculator next, Duration second) {
        this.price = price;
        this.second = second;
    }

    @Override
    protected Money calcCallFee(Call call, Money result) {
        for(Call call : calls){
            // result 축적
            result = result.plus(price.times((call.getDuration().getSeconds() / second.getSeconds())));
        }
        // 다음으로 떠넘기기
        return result;
    }
}
