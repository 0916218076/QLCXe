import java.util.Scanner;

public class xengoaithanh extends chuyenxe {
    private String noiden;
    private int songaydiduoc;

    public xengoaithanh() {
        super();
    }

    public xengoaithanh(String noiden, int songaydiduoc) {
        super();
        this.noiden = noiden;
        this.songaydiduoc = songaydiduoc;
    }

    public String getnoiden() {
        return this.noiden;
    }

    public int getsongaydiduoc() {
        return this.songaydiduoc;
    }

    public void setnoiden(String noiden) {
        this.noiden = noiden;
    }

    public void setsongaydiduoc(int songaydiduoc) {
        this.songaydiduoc = songaydiduoc;
    }

    public void nhapxengoaithanh() {
        Scanner sc = new Scanner(System.in);
        super.nhapthongtinchuyenxe();
        System.out.println("input noi den");
        this.noiden = sc.nextLine();

        System.out.println("input so ngay di duoc: ");
        this.songaydiduoc = sc.nextInt();
    }

    @Override
    public String toString() {
        return "xe ngoai thanh{" + super.toString() + "noi den: " + this.noiden + "so ngay di duoc" + this.songaydiduoc
                + "}";
    }

}
