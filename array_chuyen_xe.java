import java.util.ArrayList;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class array_chuyen_xe {
    ArrayList<chuyenxenoithanh> arrchuyenxenoithanh = new ArrayList<>();

    ArrayList<xengoaithanh> arrchuyenxengoaithanh = new ArrayList<>();
    int sochuyennoithanh, sochuyenngoaithanh;
    double doanhthunoithanh = 0;
    double doanhthungoaithanh = 0;
    Scanner sc = new Scanner(System.in);

    /**
     * 
     */
    public void nhapchueynxenoithanh() {
        System.out.println("nhap chuyen xe noi thanh: ");
        this.sochuyenngoaithanh = sc.nextInt();
        System.out.println("nhap chuyen xe noi thanh: ");
        this.sochuyennoithanh = sc.nextInt();

        System.out.println("nhap thong tin chuyen xe noi thanh");
        for (int i = 0; i < sochuyennoithanh; i++) {
            System.out.println("nhap chuyen xe thong tin thu " + (i + 1) + ":");
            chuyenxenoithanh chuyenxenoithanh = new chuyenxenoithanh();
            chuyenxenoithanh.nhapchuyenxenoithanh();
            doanhthunoithanh += chuyenxenoithanh.getdoanhthu();
            arrchuyenxenoithanh.add(chuyenxenoithanh);

        }
        System.out.println("thong tin chuyen xe ngoai thanh: ");
        for (int i = 0; i < sochuyenngoaithanh; i++) {
            System.out.println("nhap thong tin chuyen xe ngoai thanh: " + (i + 1) + ":");
            xengoaithanh chuyenxengoaithanh = new xengoaithanh();
            chuyenxengoaithanh.nhapxengoaithanh();
            doanhthungoaithanh += chuyenxengoaithanh.getdoanhthu();
            arrchuyenxengoaithanh.add(chuyenxengoaithanh);

        }

    }

    public void ouput() {
        System.out.println("thong tin noi thanh: ");
        for (int i = 0; i < arrchuyenxenoithanh.size(); i++) {

            System.out.println(arrchuyenxenoithanh.get(i).toString());
        }
        System.out.println("thong tin chuyen xe ngoai thanh: ");
        for (int i = 0; i < arrchuyenxengoaithanh.size(); i++) {
            System.out.println(arrchuyenxengoaithanh.get(i).toString());
        }
    }

    public void doanhthutungchiecxe() {
        System.out.println("doanh thu noi thanh");
        System.out.println(doanhthunoithanh);
        System.out.println("doanh thu ngoai thanh");
        System.out.println(doanhthungoaithanh);
    }

}
