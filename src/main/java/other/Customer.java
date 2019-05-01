package other;

public class Customer {
    private String name;
    private double dueForRent;


    public double getDueForRent() {
        return dueForRent;
    }

    public void setDueForRent(double dueForRent) {
        this.dueForRent = dueForRent;
    }

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
