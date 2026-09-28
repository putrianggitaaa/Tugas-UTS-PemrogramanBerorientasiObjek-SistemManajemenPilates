package model;

public class JenisKelasPrivateVip extends JenisKelasPrivate {
    private String fasilitas;

    public JenisKelasPrivateVip(int idJenis, String namaJenis, String level,
                                String durasi, String jenisSesi, String fasilitas) {
        super(idJenis, namaJenis, level, durasi, jenisSesi);
        this.fasilitas = fasilitas;
    }

    public String getFasilitas() {
        return fasilitas;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Fasilitas VIP: " + fasilitas);
    }
}