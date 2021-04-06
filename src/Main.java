public class Main {
    public static void main(String []args) {
        int balanceRubles = 100;
        int putRubles = 1100;
        int bonusRubles;
        if (putRubles > 1000) {
            bonusRubles = putRubles / 100;
        } else{
            bonusRubles = 0;
        }
        balanceRubles = balanceRubles + putRubles + bonusRubles;
        System.out.println("Бонус от пополнения:" + bonusRubles);
        System.out.println("Итоговая сумма на счету:" + balanceRubles);
    }}
