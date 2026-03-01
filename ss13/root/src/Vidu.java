import java.util.*;

public class Vidu {
    public static void main(String[] args) {
        Random rad = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            int number = rad.nextInt(1000);
            list.add(number);
        }
        System.out.println(list);

        // trung
        Set<Integer> set = new TreeSet<>(list);
        System.out.println("Danh sach khong trung: " + set);
    }
}
