package class6.decorator.ver2;

import class6.decorator.ver1.Plan;
import class6.decorator.ver1.Tex;

import java.time.Duration;

public class Main {
    public static void main(String[] args) {
        Plan plan = new Plan();
        plan.setCalculator(
                new PricePerTime((Money.of(18), Duration.ofSeconds(60))
                        .setNext(new AmountDiscount(Money.of(10000)))
                        .setNext(new Tex(0.1))
        );
    }
}
