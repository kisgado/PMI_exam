import java.util.ArrayList;
import java.util.Arrays;

public class Bank {
    protected ArrayList<String[]> accounts = new ArrayList<>();

    public void openNewAccount(String accountNumber) {
        accounts.add(new String[]{accountNumber, "0"});
    }

    public void closeAccount(String accountNumber) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i)[0]==accountNumber) accounts.remove(i);
        }
    }

    public String getBalances() {
        String re = "";
        for (int i = 0; i < accounts.size(); i++) {
            re = re + accounts.get(i)[0]+ " " + accounts.get(i)[1];
            if (i < accounts.size()-1) re = re + "\r\n";
        }
        return re;
    }
}
