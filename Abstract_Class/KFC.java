package AbstractClass;

abstract public class KFC {
    KFC(){
        // this is a constructor
        System.out.println("KFC server connected to KFC server");
    }
    void MakeItem(){
        System.out.println("How to make an item is provided by KFC!");
    }
    abstract void Billing();
    abstract void Offer();
}

class MyKFC extends KFC{
    public static void main(String[] args) {
        KFC kfc = new MyKFC();
        kfc.Offer();
        kfc.Billing();
        kfc.MakeItem();
    }

    @Override
    void Billing() {
        System.out.println("Billing is not provided by KFC");
    }

    @Override
    void Offer() {
        System.out.println("Offer is not provided by KFC");
    }
}
