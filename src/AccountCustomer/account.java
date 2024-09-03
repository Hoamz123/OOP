package AccountCustomer;

public class account {
    private final int id;//id tai khoan
    private final Customer customer;
    private double balance;//so du vi cua tai khoan

    public account(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }
    public account (int id,Customer customer){
        this.id = id;
        this.customer = customer;
    }
    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return this.id + " " + this.customer.toString() + " " + this.balance;
    }
    //nap tien vao
    public account deposit(double amount) {
        account result  = new account(this.id, this.customer);//du nguyen id va data khach hang
        this.setBalance(this.balance + amount);//dat lai tien cho account
        result.setBalance(this.getBalance());//dat so tien cua result
        return result;//tra ve mot account
    }
    //rut tien
    public account withdraw(double amount) {
        if(this.balance >= amount){
            account result  = new account(this.id, this.customer);
            this.setBalance(this.balance - amount);
            result.setBalance(this.getBalance());
            return result;//tra ve mot account
        }
        else System.out.println("Khong du so du");
        return null;
    }
}
