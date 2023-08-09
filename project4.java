import java.util.Scanner;

class bank{
Scanner sc=new Scanner(System.in);
     double amount=10000.00;

     void withDrawAmt(){
        System.out.println("Enter Amonut :");
        double wd=sc.nextDouble();
        if(wd>amount){
            System.out.println("Insufficient funds ");
        }
        else{
            amount=amount-wd;
            System.out.println("Transaction Successfully Completed "+wd+" Amount withdraw");
            System.out.println("\nWant to check Balance Yes/No");
            String ch=sc.next();
            if(ch.contains("yes")){
                System.out.println("Rs "+amount);
            }
            else{
                System.out.println("\nThank you for the Transaction");
            }
        }

     }
     void depositeAmt(){
            System.out.println("Enter Amount to be deposited : ");
            double dm=sc.nextDouble();
            amount=amount+dm;
            System.out.println("\nAmount deposited Successfully ");
            System.out.println("\nBalance is Rs "+amount);
     }
     void checkBal(){
        System.out.println("\nYour Balance is Rs "+amount);
        System.out.println();
     }
}
class project4{
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        bank b=new bank();
        boolean r=true;
        do{
        System.out.println("\n1:WithDraw Amount \n2:Deposite Amount \n3:checkBalance \n4:Exit");
        int choice=sc1.nextInt();
        if(choice==1){
            b.withDrawAmt();
        }
        else if(choice==2){
            b.depositeAmt();
        }
        else if(choice==3){
            b.checkBal();
        }
        else{
            r=false;
        }
    }while(r!=false);
}
}