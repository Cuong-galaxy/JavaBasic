package Exception;
import java.awt.image.ImagingOpException;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
try{
    Code có thể ném Exception
} catch(Exception){
    Code muốn chạy sau khi chụp được exception
}
 */




public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten");
        String name = sc.nextLine();
        System.out.println("Nhap tuoi");
        int age;
    //Chỉ bắt exeption 1 lần
//        try {
//            age = sc.nextInt();
//        } catch (InputMismatchException ime){
//            System.out.println("Vui lòng nhập tuổi bằng số");
//            sc.nextLine(); // <<< Xóa dữ liệu sai còn trong buffer
//            age = sc.nextInt(); // Cho nhập lại
//            // Nhập sai vẫn báo lỗi bình thường
//        }
        //Bắt exception tới khi nhập đúng 1 làn
        while(true){
            try {
                age = sc.nextInt();
                break;
            } catch (InputMismatchException ime){
                System.out.println("Vui lòng nhập tuổi bằng số");
                sc.nextLine(); // <<< Xóa dữ liệu sai còn trong buffer
                // Nhập sai vẫn báo lỗi bình thường
            }finally {
                System.out.println("code nay luon chay");
            }
        }
        System.out.println(name + age);
        System.out.println("Kết thúc trương trình");
    }

}


