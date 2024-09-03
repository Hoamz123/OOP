package InvoiceAndCustomer;

public class Invoice implements Comparable<Invoice>{
    private final int  IdInvoice;//id hoa don
    private final Customer customer;
    private final double amount;// so luong tien phai tra ban dau

    public Invoice(int IdInvoice, Customer customer, double amount) {
        this.IdInvoice = IdInvoice;
        this.customer = customer;
        this.amount = amount;
    }

    //ham tinh lai so tien phai tra
    public double getAmountAfterDiscount() {
        return amount - amount * (double)customer.getDiscount()/100;
    }

    @Override
    public String toString() {
        return this.IdInvoice + "\n" + this.customer.toString() + "\n" + this.getAmountAfterDiscount();
    }

    @Override
    public int compareTo(Invoice o) {
        if (this.getAmountAfterDiscount() != o.getAmountAfterDiscount()){
            if(this.getAmountAfterDiscount()>o.getAmountAfterDiscount()){
                return -1;
            }
            else{
                return 1;
            }
        }
        else{
            return this.customer.getIdCustomer() - o.customer.getIdCustomer();
        }
    }
}
