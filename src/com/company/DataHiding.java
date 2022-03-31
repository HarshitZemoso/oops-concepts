package com.company;

import java.util.*;

//class BankDetails{
//    private String ac_holder;
//    private double balance;
//    public BankDetails(String ac_holder,double balance){
//        this.ac_holder = ac_holder;
//        this.balance = balance;
//    }
//    public double displayBalance(String)
//}
public class DataHiding {

    static HashMap<String, Double> map = new HashMap<>();
    static HashMap<String, String> pinmap = new HashMap<>();

    static class BankDetails {
        private String ac_holder;
        private String pin;
        private double balance;

        public BankDetails(String ac_holder, String pin) {
            this.ac_holder = ac_holder;
            this.pin = pin;

        }

        public void displayBalance() {

            double ans = 0;
            if (map.containsKey(ac_holder) && pinmap.get(ac_holder).equals(pin)) {
                System.out.println("Your Total Balance is: " + map.get(ac_holder));

            } else if (map.containsKey(ac_holder) && !pinmap.get(ac_holder).equals(pin)) {
                System.out.println("You Have Entered the wrong pin");
                System.out.println("Try Again");

            } else {
                System.out.println("You Don't have an account");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of entries you need to store");
        int n = sc.nextInt();
        System.out.println("Create New Accounts->");
        System.out.println("Name | Pin | Balance");
        for (int i = 0; i < n; i++) {

            String s = sc.next();
            String p = sc.next();
            double d = sc.nextDouble();
            map.put(s, d);
            pinmap.put(s, p);
        }
        System.out.println("Enter Your Name");
        String name = sc.next();
        System.out.println("Enter your pin");

        String pin = sc.next();
        BankDetails ans = new BankDetails(name, pin);
        ans.displayBalance();

    }
}
