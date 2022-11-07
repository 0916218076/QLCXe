import java.util.Scanner;

import javax.naming.spi.DirObjectFactory;

public class chuyenxe {
    private long MSchuyen;
    private String HTtaixe;
    private String soxe;
    private double doanhthu;

    public chuyenxe() {

    }

    public chuyenxe(long MSchuyen, String HTtaixe, String soxe, double doanhthu) {
        this.MSchuyen = MSchuyen;
        this.HTtaixe = HTtaixe;
        this.soxe = soxe;
        this.doanhthu = doanhthu;
    }

    public long getMSchuyen() {
        return this.MSchuyen;
    }

    public String getHTtaixe() {
        return this.HTtaixe;
    }

    public String getsoxe() {
        return this.soxe;
    }

    public double getdoanhthu() {
        return this.doanhthu;
    }

    public void setMSchuyen(long MSchuyen) {
        this.MSchuyen = MSchuyen;
    }

    public void setHTtaixe(String HTtaixe) {
        this.HTtaixe = HTtaixe;
    }

    public void setsoxe(String soxe) {
        this.soxe = soxe;
    }

    public void setdoanhthu(double doanhthu) {
        this.doanhthu = doanhthu;
    }

    @Override
    public String toString() {
        return "{" + "ho ten tai xe" + this.HTtaixe + "MS chuyen xe: " + this.MSchuyen + "so xe: " + this.soxe
                + "doanh thu: " + this.doanhthu + "}";
    }

    public void nhapthongtinchuyenxe() {
        Scanner sc = new Scanner(System.in);
        System.out.println("input fullname driver of car: ");
        this.HTtaixe = sc.nextLine();
        System.out.println("input code buses: ");
        this.MSchuyen = sc.nextLong();
        System.out.println("input number car: ");
        this.soxe = sc.nextLine();
        sc.nextLine();
        System.out.println("input turnover: ");
        this.doanhthu = sc.nextDouble();
    }

}
