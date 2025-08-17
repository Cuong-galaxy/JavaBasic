package Enum;

public class main {
    public static void main(String[] args) {
        PizzaStatus status = PizzaStatus.DAT_HANG;
        if(status == PizzaStatus.DAT_HANG){
            System.out.println("Pizza đã được đặt");
        }
        for(PizzaStatus s: PizzaStatus.values()){
            System.out.println(s);
        }
    }
}
