package com.multiplatform;

public class Main {

    public static void main(String[] args) {
	Account jhonAccount = new Account("11111",200.0,"Jhon", "jhon@email.com","01985789213");
        System.out.println("Customer Name = " + jhonAccount.getCustomerName());
        System.out.println("Balance = "+jhonAccount.getBalance());
        jhonAccount.deposit(50.0);
        System.out.println();
        jhonAccount.withdrawal(155.0);

        Account josAcc = new Account();
        System.out.println("Customer Name = "+josAcc.getCustomerName());
        System.out.println("Balance : "+josAcc.getBalance());

        Account j1 = new Account("J1","jon@email.com","019283019824");
        System.out.println("Customer Name = "+j1.getCustomerName());
        System.out.println("Balance : "+j1.getBalance());

    }
}
