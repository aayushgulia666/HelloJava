package AbstractClass;

abstract public class Hospital {
    /*
    Abstract classes are used for imposing standards.
     */
    abstract void Name();
    abstract void Appointment();
    abstract void FireSafety();
    abstract void Emergency();
    abstract void OPD();
    abstract void Physiotherapy();
    abstract void Pharmacy();
    abstract void Canteen();
    abstract void Parking();
    abstract void Staff();
    abstract void Transport();
}

class MyHospital extends Hospital{
    public static void main(String[] args) {
        Hospital hospital= new MyHospital();
        hospital.Parking();
        hospital.Appointment();
        hospital.Staff();
        hospital.OPD();
        hospital.FireSafety();
        hospital.Pharmacy();
        hospital.Parking();
    }

    @Override
    void Name() {
        System.out.println("My Hospital");
    }

    @Override
    void Appointment() {
        System.out.println("Go to room 69");
    }

    @Override
    void FireSafety() {
        System.out.println("Fire safety equipment purchased");
    }

    @Override
    void Emergency() {
        System.out.println("Emergency Ward constructed");
    }

    @Override
    void OPD() {
        System.out.println("OPD ward constructed");
    }

    @Override
    void Physiotherapy() {
        System.out.println("Physiotherapy faculty assigned");
    }

    @Override
    void Pharmacy() {
        System.out.println("Pharmacy opened");
    }

    @Override
    void Canteen() {
        System.out.println("Canteen open");
    }

    @Override
    void Parking() {
        System.out.println("Parking space available");
    }

    @Override
    void Staff() {
        System.out.println("Staff working with no issues");
    }

    @Override
    void Transport() {
        System.out.println("All ambulances and other vehicles ready");
    }
}
