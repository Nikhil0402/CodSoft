package CodSoft;

import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Rs" + amount + " deposited successfully");
        } else {
            System.out.println("Invalid amount for deposit");
        }
    }

    public boolean withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount for withdrawal");
            return false;
        }
        if (amount > balance) {
            System.out.println("Insufficient funds");
            return false;
        }
        balance -= amount;
        System.out.println("Rs" + amount + " withdrawn successfully");
        return true;
    }
}

class ATM {
    private BankAccount account;

    public ATM(BankAccount account) {
        this.account = account;
    }

    public void display() {
        System.out.println("Welcome to the ATM");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
    }

    public static double getUserInputAmount(String prompt) {
        Scanner scanner = new Scanner(System.in);
        double amount;
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextDouble()) {
                amount = scanner.nextDouble();
                if (amount >= 0) {
                    break;
                } else {
                    System.out.println("Invalid amount. Please enter a non-negative value.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next();
            }
        }

        return amount;
    }

    public void Choice(int choice) {
        switch (choice) {
            case 1:
                System.out.println("Your balance is: Rs" + account.getBalance());
                break;
            case 2:
                double depositAmount = getUserInputAmount("Enter the amount to deposit: Rs");
                account.deposit(depositAmount);
                break;
            case 3:
                double withdrawAmount = getUserInputAmount("Enter the amount to withdraw: Rs");
                if (account.withdraw(withdrawAmount)) {
                    System.out.println("Please take your cash.");
                }
                break;
            case 4:
                System.out.println("Thank you for using the ATM. Goodbye!");
                System.exit(0);
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    public static void main(String[] args) {
        BankAccount userAccount = new BankAccount(1000.0);
        ATM atm = new ATM(userAccount);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            atm.display();
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            atm.Choice(choice);
        }
    }
}
