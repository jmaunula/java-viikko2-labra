/**
 * Tehtävä 3 – BankAccount (kapselointi, konstruktorit, toString, equals)
 *
 * MITÄ TEET TÄHÄN TIEDOSTOON:
 *  1. Kentät: accountNumber (String), balance (double).
 *  2. Konstruktori: jos initialBalance < 0 -> nollaa.
 *  3. `deposit(amount)` ja `withdraw(amount)` säännöillä.
 *  4. `toString()` ja `equals(Object)` (tilinumero).
 *
 * VINKIT:
 *  - equals: pelkkä tilinumero riittää; vältä double-vertailua.
 *
 * HUOM:
 *  - Älä käytä ArrayListiä tai muita kokoelmia.
 *  - Ei käyttäjän syötteitä metodeissa; testaa `main()`ista.
 */

package fi.viikko2.task03;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = (initialBalance < 0) ? 0 : initialBalance;
    }

    public String deposit(double amount) {
        if (amount <= 0)
            return "The amount cannot be zero nor negative";
        this.balance += amount;
        return "Deposit: " + amount + " Balance now: " + this.balance;
    }

    public String withdraw(double amount) {
        if (amount <= 0)
            return "The amount cannot be zero nor negative";

        if ((this.balance - amount) < 0)
            return "There is not enough money on the account";

        this.balance -= amount;
        return "Withdraw: " + amount + " Balance now: " + this.balance;
    }

    public String getBalance() {
        return "Balance: " + this.balance;

    }

    @Override
    public String toString() {
        // Toteuta ja palauta merkkijono. Kun olet valmis, POISTA alla oleva rivi.
        return "BankAccount{accountNumber = " + accountNumber + " balance = " + balance + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof BankAccount))
            return false;
        BankAccount other = (BankAccount) o;
        return this.accountNumber == other.accountNumber && java.util.Objects.equals(this.balance, other.balance);
    }
}