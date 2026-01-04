package Answers.Code;

interface Vehicle {
    String getType();
}

class Car implements Vehicle {
    public String getType() {
        return "Car";
    }
}

class ParkingSlot {
    boolean occupied = false;

    void park() {
        occupied = true;
    }

    void leave() {
        occupied = false;
    }
}

class ParkingLot {
    ParkingSlot slot = new ParkingSlot();

    void parkVehicle(Vehicle v) {
        if (!slot.occupied) {
            slot.park();
            System.out.println(v.getType() + " parked");
        }
    }
}

public class ParkingLotLLD {
    public static void main(String[] args) {
        ParkingLot lot = new ParkingLot();
        lot.parkVehicle(new Car());
    }
}
