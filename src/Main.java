import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws LimitExseption {
        BankAmount bankAmount=new BankAmount();
        bankAmount.Deposit(20000);
        Scanner scanner=new Scanner(System.in);
        while (true){
            System.out.println("������� ����� ������: ");
            Double som3=scanner.nextDouble();


            try {
                bankAmount.WithDraw(som3);
                System.out.println(bankAmount.amount);
            }catch (LimitExseption limitExseption){
                System.out.println(limitExseption.getMessage());
                System.out.println(limitExseption.getRemainingAmount());
                break;
            }

        }
    }
}