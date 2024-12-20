package Lesson1.class2;

public class SequenceAmountDiscount extends SequenceDiscount implements DiscountPolicy.AMOUNT{
    private final Money amount;
    public SequenceAmountDiscount(int sequence, Money amount) {
        super(sequence);
        this.amount = amount;
    }
    @Override
    public Money calculateFee(Money fee) {
        return fee.minus(amount);
    }
}
