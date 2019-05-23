package khoapham.ptp.phamtanphat.sqlite1903;

public class Monan {
    private int id;
    private String tenmonan;
    private int giamonan;
    private String diachi;

    public Monan(int id, String tenmonan, int giamonan, String diachi) {
        this.id = id;
        this.tenmonan = tenmonan;
        this.giamonan = giamonan;
        this.diachi = diachi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenmonan() {
        return tenmonan;
    }

    public void setTenmonan(String tenmonan) {
        this.tenmonan = tenmonan;
    }

    public int getGiamonan() {
        return giamonan;
    }

    public void setGiamonan(int giamonan) {
        this.giamonan = giamonan;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }
}
