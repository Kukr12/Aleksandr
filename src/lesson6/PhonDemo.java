package lesson6;

public class PhonDemo {
    public static void main(String[] args) {
        Phone myPhone1 = new Phone();
        Phone myPhone2 = new Phone(454545, 7.6, "nokia");
        Phone myPhone3 = new Phone(6654, 9.5);

       /* myPhone1.model = "Apple";
        myPhone1.weight = 4.5;
        myPhone1.namber = "56456454";

        System.out.println(myPhone1.namber);
        System.out.println(myPhone1.model);
        System.out.println(myPhone1.weight);
*/
        myPhone1.receiveColl("Mather");
        myPhone1.receiveColl("Father");

        System.out.println(myPhone1.getNamber());
        myPhone1.sendMessage("Message "34, 32, 12);
        myPhone1.sendMessage("Massage ", 36, 45, 43, 76);
    }
}

