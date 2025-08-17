package WrapperClass;

/*
Wrapper class là lớp bao cung cấp một cách để chúng ta sử dụng kiểu
 dữ liệu nguyên thủy như kiểu dữ liệu tham chiếu (object)
=> Vì object chứa nhiều phương thức giúp chúng ta có thể xử lý dữ liệu một cách linh hoạt hơn,
tuy nhiên nó chạy  chậm hơn kiểu nguyên thủy

Khi làm việc với các đối tượng trong Wrapper class giá trị của chúng có thể bằng nhau, nhưng địa chỉ
trên bộ nhớ của chúng khác nhau, vì vậy nếu so sánh thì sẽ sử dụng  equals

Khi nào sử dụng Warpper class
1. Khi muốn sử dụng Java colection như List hay Array list, vì chúng chỉ chấp nhận kiểu tham chiếu
2. Khi cần giá trị null, vì các kiểu dữ liệu nguyên thủy không chứa được giá trị null
3. Khi cần sử dụng các phương thức của lớp Object
    1. equal() => Dùng để so sánh giá trị bên trong 2 object
    2. compareTo() => Dùng để so sánh thứ tự của 2 giá trị
    3. toString() => Dùng để trả về chuôi đại diện cho giá trị bên trong Warpper


 */

public class main {
    public static void main(String[] args) {

        // Boxing => đóng hộp
        // Có 2 cách khởi tạo
        //Cách 1
        Integer bien1 = 150;
        Integer bien2 = 150;

        //Cách 2
        Integer bien3 = Integer.valueOf("150");
        Integer bien4 = Integer.valueOf(150);
        System.out.println(bien3 + bien4);

        // Toán tử == kiểm tra xem chúng có cùng tham chiếu chung với 1 bộ nhớ hay không
        if(bien1 == bien2){
            System.out.println("cùng tham chiếu chung tới 1 bộ nhớ");
        }else
            System.out.println("Không cùng tham chiếu chung tới 1 bộ nhớ");
        // equals so sánh giá trị của 2 object
        if (bien1.equals(bien2)) {
            System.out.println("giá trị bằng nhau");
        }else {
            System.out.println("Giá trị khác nhau");
        }

        // Unboxing => Mở hộp
        int bien5 = bien1.intValue();
        int bien6 = bien1;
        System.out.println(bien5 + "-" + bien6);

    }

}
