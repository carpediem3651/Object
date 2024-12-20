package Lesson1.class2;

interface DiscountCondition {
    // 발동
    public boolean isSatisfiedBy(Screening screening, int audienceCount);
    // 실행
    public Money calculateFee(Money fee);
}
