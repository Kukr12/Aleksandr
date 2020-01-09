package lesson6;

public class Phone {
    String namber;
    double weight;
    String model;

    public Phone(String namber, double weight, String model) {
        this.namber = namber;
        this.weight = weight;
        this.model = model;
    }

    public Phone(String namber, double weight) {
        this.namber = namber;
        this.weight = weight;
    }

    public Phone() {
    }

    void receiveColl(String name) {
        System.out.println(name + " Is calling on my phone number " + namber);

    }

    void receiveColl(String name, String namber) {
        System.out.println(name + "with number" + namber + "is callin on my phon");
    }

    String getNamber() {
        return namber;
    }

    void sendMessage(String... nambers, String... messege) {
        System.out.println("Send messeg " + messege + "to phone ");
        for (String number : nambers) {
            System.out.println(number);
        }
    }
}

