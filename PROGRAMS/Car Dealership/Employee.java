package com.syedanique;

public class Employee {


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    private String name;
    private String role;

    public Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public void runCreditHistory(Customer customer, double loanAmt){
        System.out.println("Current bal: " + customer.getCashInHand());
        customer.setCashInHand(loanAmt + customer.getCashInHand());
        System.out.println("Finance Done, Loan amount is " + loanAmt);
        System.out.println("Final bal: " + customer.getCashInHand());

    }


    public void handleCustomer(Customer customer , boolean finance, Vehicle vehicle){
        if (finance && customer.getCashInHand() >= vehicle.getPrice() ){
            System.out.println("You don't need to opt for finance");
        }else if(finance){
            double loanAmt =(vehicle.getPrice()) - customer.getCashInHand();
            runCreditHistory(customer, loanAmt);
            System.out.println("Thank you " +customer.getName() + " for purchasing, your new " + vehicle + " sold by "+ this.getName());
        }else if (customer.getCashInHand() >= vehicle.getPrice()){
            System.out.println("Thank you " +customer.getName() + " for purchasing, your new " + vehicle + " sold by "+ this.getName() + " in cash");
        }else{
            System.out.println(customer.getName() + " , Sorry but you need more money to buy: " + vehicle);
        }
    }




}
