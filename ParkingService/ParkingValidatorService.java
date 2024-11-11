enum VehicleType {
  CAR,
  MOTORCYCLE,
  TRUCK
}

class ParkingValidatorService implements ParkingValidator{

    public void vechicleType(String type){

        VehicleType car = VehicleType.CAR;
        VehicleType motorcycle = VehicleType.MOTORCYCLE;
        VehicleType truck = VehicleType.TRUCK;

        try {
            if("Car".equals(type)||"Motorcycle".equals(type)||"Truck".equals(type)){
                System.out.println("Type O.K");
            } else if(car.toString().equals(type) || motorcycle.toString().equals(type) || truck.toString().equals(type)){
                System.out.println("Type O.K");
            } else if (type == null || type == "") {
                System.out.println("3");
                throw new InvalidVechileTypeException("Incorrect vehicle type");
            } else {
                throw new InvalidVechileTypeException("Invalid Vechile type");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }

    public void hoursParked(int jam){
        // System.out.println(jam);

        // if(jam < 0){
        //     System.out.println("Enter < 0");
        // }
        // if(jam > 24){
        //     System.out.println("Enter > 24");
        // }

        try {
            if(jam < 0 || jam > 24){
                throw new ParkingFullException("Parking Hours Must Be Between 0 and 24");
            } else {
                System.out.println("Hours Time O.K");
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}