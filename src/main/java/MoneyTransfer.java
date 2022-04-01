public class MoneyTransfer extends Bank {
    public void transfer(String accountNumber, int amount) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i)[0]==accountNumber) {
                Integer money = Integer.parseInt(accounts.get(i)[1]);
                money += amount;
                accounts.set(i, new String[]{accountNumber, money.toString()});
            }
        }
    }
}
