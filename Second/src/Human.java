import com.max.*;

public class Human {
    void useCar (Toyota toyota) {
        toyota.driving();
        System.out.println(toyota.getNumOfSeats());
    }

    public static void main(String[] args)
    {
        Toyota toyota = new Toyota();
        System.out.println(toyota.getMaxSpeed());
        System.out.println(toyota.getNumOfSeats());
        Human main = new Human ();
        Ford ford = new Ford ();
        main.useCar(ford);
        Plane plane = new Plane ();
        System.out.println(plane.getName());

    }
}



