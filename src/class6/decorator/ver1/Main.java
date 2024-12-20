package class6.decorator.ver1;

import java.time.Duration;

class Main {
    public static void main(String[] args) {
        Plan plan = new Plan();
        plan.setCalculator(
                new PricePerTime(
                        new AmountDiscount(
                                new Tex(null, 0.1),
                                Money.of(10000)
                        ),
                        Money.of(18),
                        Duration.ofSeconds(60)
                )
        );
    }
}
