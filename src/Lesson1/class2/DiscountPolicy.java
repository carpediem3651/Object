package Lesson1.class2;

interface DiscountPolicy {
    interface AMOUNT extends DiscountPolicy{}
    interface PERCENT extends DiscountPolicy{}
    interface COUNT extends DiscountPolicy{}
    interface NONE extends DiscountPolicy{}
}
