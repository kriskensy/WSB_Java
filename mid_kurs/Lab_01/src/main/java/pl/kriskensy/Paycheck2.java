package pl.kriskensy;

public class Paycheck2 {
    public static void main(String[] args) {

        int[] paychecks = new int[5];
        int sumOfPaychecks = 0;
        int sumOfCashierMoney = 0;
        int[] cashierMoney = {100, 50, 20, 10, 5, 2, 1, 100, 50, 20, 10, 5, 2, 1, 100, 50, 20, 10, 5, 2, 1,
                100, 50, 20, 10, 5, 2, 1, 100, 50, 20, 10, 5, 2, 1, 100, 50, 20, 10, 5, 2, 1,
                100, 50, 20, 10, 5, 2, 1, 100, 50, 20, 10, 5, 2, 1, 100, 50, 20, 10, 5, 2, 1,
                100, 50, 20, 10, 5, 2, 1, 100, 50, 20, 10, 5, 2, 1, 100, 50, 20, 10, 5, 2, 1,
                100, 50, 20, 10, 5, 2, 1, 100, 50, 20, 10, 5, 2, 1, 100, 50, 20, 10, 5, 2, 1,
                100, 50, 20, 10, 5, 2, 1, 100, 50, 20, 10, 5, 2, 1, 100, 50, 20, 10, 5, 2, 1,
                100, 50, 20, 10, 5, 2, 1, 100, 50, 20, 10, 5, 2, 1, 100, 50, 20, 10, 5, 2, 1,
                100, 50, 20, 10, 5, 2, 1, 100, 50, 20, 10, 5, 2, 1, 100, 50, 20, 10, 5, 2, 1,
                100, 50, 20, 10, 5, 2, 1, 100, 50, 20, 10, 5, 2, 1, 100, 50, 20, 10, 5, 2, 1,
                100, 50, 20, 10, 5, 2, 1, 100, 50, 20, 10, 5, 2, 1, 100, 50, 20, 10, 5, 2, 1,
                100, 50, 20, 10, 5, 2, 1, 100, 50, 20, 10, 5, 2, 1, 100, 50, 20, 10, 5, 2, 1,
                100, 50, 20, 10, 5, 2, 1, 100, 50, 20, 10, 5, 2, 1, 100, 50, 20, 10, 5, 2, 1,
                100, 50, 20, 10, 5, 2, 1, 100, 50, 20, 10, 5, 2, 1, 100, 50, 20, 10, 5, 2, 1,
                100, 50, 20, 10, 5, 2, 1, 100, 50, 20, 10, 5, 2, 1, 100, 50, 20, 10, 5, 2, 1,
                100, 50, 20, 10, 5, 2, 1, 100, 50, 20, 10, 5, 2, 1, 100, 50, 20, 10, 5, 2, 1,
                100, 50, 20, 10, 5, 2, 1, 100, 50, 20, 10, 5, 2, 1, 100, 50, 20, 10, 5, 2, 1,
                100, 50, 20, 10, 5, 2, 1, 100, 50, 20, 10, 5, 2, 1, 100, 50, 20, 10, 5, 2, 1,
                100, 50, 20, 10, 5, 2, 1, 100, 50, 20, 10, 5, 2, 1, 100, 50, 20, 10, 5, 2, 1,
                100, 50, 20, 10, 5, 2, 1, 100, 50, 20, 10, 5, 2, 1, 100, 50, 20, 10, 5, 2, 1,
                100, 50, 20, 10, 5, 2, 1, 100, 50, 20, 10, 5, 2, 1, 100, 50, 20, 10, 5, 2, 1,
                100, 50, 20, 10, 5, 2, 1, 100, 50, 20, 10, 5, 2, 1, 100, 50, 20, 10, 5, 2, 1,
                100, 50, 20, 10, 5, 2, 1, 100, 50, 20, 10, 5, 2, 1, 100, 50, 20, 10, 5, 2, 1,
                100, 50, 20, 10, 5, 2, 1, 100, 50, 20, 10, 5, 2, 1, 100, 50, 20, 10, 5, 2, 1,
        };

        for (int i = 0; i < paychecks.length; i++) {
            paychecks[i] = (int) (Math.random() * 2200 + 800);
            sumOfPaychecks += paychecks[i];
            System.out.println("Paycheck employee " + (i + 1) + ": " + paychecks[i] + "€");
        }
        System.out.println("sum of paychecks: " + sumOfPaychecks);

        for (int money : cashierMoney) {
            sumOfCashierMoney += money;
        }
        System.out.println("sum of cashier money: " + sumOfCashierMoney);

        if (sumOfCashierMoney < sumOfPaychecks) {
            int equalPayment = Math.min(sumOfCashierMoney / paychecks.length, paychecks[0]);
            System.out.println("every employee paycheck: " + equalPayment + "€");

            for (int i = 0; i < paychecks.length; i++) {
                System.out.println("employee " + (i + 1) + " paycheck: " + Math.min(equalPayment, paychecks[i]) + "€");
            }
        } else {
            for (int i = 0; i < paychecks.length; i++) {
                System.out.println("employee " + (i + 1) + " paycheck: " + paychecks[i] + "€");
            }
        }
    }
}