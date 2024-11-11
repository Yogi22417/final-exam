import java.util.Scanner;
abstract class Validator extends ParkingValidatorService{

}
class Main{
    public static void main(String[] args) {
        Scanner types = new Scanner(System.in);
        Scanner hours = new Scanner(System.in);
        
        ParkingValidatorService parkir = new ParkingValidatorService();

        System.out.println("Masukkan Type Kendaraan");
        String type = types.next();
        System.out.println("Masukkan Jam Parkir");
        int hour = hours.nextInt();

        // type = null;

        parkir.vechicleType(type);
        parkir.hoursParked(hour);
    }
}