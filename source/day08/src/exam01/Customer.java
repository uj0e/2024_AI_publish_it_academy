package exam01;

public class Customer {
    private final int id;
    private final String name;
    private final String email;

    public Customer (int id, String name, String email){
        this.id = id;
        this.name = name;
        this.email = email;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Customer customer){
            if(id == customer.id && name.equals(customer.name) && email.equals(customer.email)){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "id = " + id + ", name = " + name + ", email = " + email;
    }
}
