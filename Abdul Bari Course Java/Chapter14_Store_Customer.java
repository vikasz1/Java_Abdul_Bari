interface Member {
    void callback();
}

class Store {
    Member member[] = new Member[10];
    int count = 0;

    void register(Member m) {
        member[count] = m;
        count++;
    }

    void inviteSales() {
        for (int i = 0; i < count; i++) {
            member[i].callback();
        }
    }
}

class Customer implements Member {
    String name;

    Customer(String n) {
        name = n;
    }

    public void callback() {
        System.out.println(" You are invited to visit "+name);
    }
}

public class Chapter14_Store_Customer {
    public static void main(String[] args) {
        Store s = new Store();
        Customer c1 = new Customer("Vikas Maury");
        Customer c2 = new Customer("Shivanand Maurya");
        s.register(c2);
        s.inviteSales();
    }
}
