import java.util.*;

public class Bai1 {
    public static void main(String[] args) {
        String[] input = {
                "Nguyễn Văn A – Yên Bái",
                "Trần Thị B – Thái Bình",
                "Nguyễn Văn A – Yên Bái",
                "Lê Văn C – Hưng Yên"
        };

        Set<String> danhSach = new LinkedHashSet<>();

        for (String ten : input) {
            danhSach.add(ten);
        }

        System.out.println("Danh sách gọi khám:");
        for (String ten : danhSach) {
            System.out.println(ten);
        }
    }
}
