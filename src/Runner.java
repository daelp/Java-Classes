public class Runner {
    public static void main(String[] args){
        Car Loht = new Car(2003, "Toyota",200,"Corolla");
        System.out.println(Loht.toString());
        Loht.drive(100);
        Rectangle Boht = new Rectangle(40, 90);
        System.out.println(Loht.toString());

        System.out.println(Boht.area());
        System.out.println(Boht.diagonal());
        System.out.println(Boht.isSquare());
    }
}