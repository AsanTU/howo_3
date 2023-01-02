public class BankAmount {
    double amount;

    public double getAmount() {
        return amount;
    }
    public void Deposit(double som){
        amount=amount+som;
    }
    public void WithDraw(double som2) throws LimitExseption {
        if (som2 > amount) {
            throw new LimitExseption("�� �� ������ ����� ������ ��� ���� � ��� �� ����� ."+
                    "A������������ ��������� ���������� �� ����� ����� ������ � �������: "+ amount,som2=amount-amount);
        }
        amount = amount - som2;
    }
}
