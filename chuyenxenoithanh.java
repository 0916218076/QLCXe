import java.util.Scanner;

public class chuyenxenoithanh extends chuyenxe {
    private String sotuyen;
    private double soKmDiDuoc;

    public chuyenxenoithanh() {
        super();
    }

    public chuyenxenoithanh(String sotuyen, double soKmDiDuoc) {
        super();
        this.sotuyen = sotuyen;
        this.soKmDiDuoc = soKmDiDuoc;

    }

    public String getsotuyen() {
        return this.sotuyen;
    }

    public double getsokmdiduoc() {
        return this.soKmDiDuoc;
    }

    public void setsotuyen(String sotuyen) {
        this.sotuyen = sotuyen;
    }

    public void setsokmdiduoc(double soKmDiDuoc) {
        this.soKmDiDuoc = soKmDiDuoc;
    }

    public void nhapchuyenxenoithanh() {
        super.nhapthongtinchuyenxe();
        Scanner sc = new Scanner(System.in);
        System.out.println("so tuyen ");
        this.sotuyen = sc.nextLine();

        System.out.println("so km di duoc");
        this.soKmDiDuoc = sc.nextDouble();

    }

    @Override
    public String toString() {
        return "chuyen xe noi thanh{" + super.toString() + "so tuyen" + this.sotuyen + "so km di duoc: "
                + this.soKmDiDuoc + "}";
    }

}
