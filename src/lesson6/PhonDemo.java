package lesson6;

public class PhonDemo {
    public static void mail(String[] args) {
        Phone myPhone1 = new Phone();
        myPhone1.model = "Apple";
        myPhone1.weight = 4.5;
        myPhone1.namber = "56456454";
        System.out.println(myPhone1.namber);
        System.out.println(myPhone1.model);
        System.out.println(myPhone1.weight);
        myPhone1.receiveColl("Mather");
        myPhone1.receiveColl("Father");
    }
}
