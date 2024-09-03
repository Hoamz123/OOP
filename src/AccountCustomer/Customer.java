package AccountCustomer;

public class Customer {
    private final int ID;//ID khach hang
    private final String Name;
    private final Character Gender; //'m' : nu va 'f' : nam

    public Customer(int ID, String Name, char Gender) {
        this.ID = ID;
        this.Name = Name;
        this.Gender = Gender;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public char getGender() {
        return Gender;
    }

    @Override
    public String toString() {
        return this.ID + " " + this.Name + " " + this.Gender;
    }
}
