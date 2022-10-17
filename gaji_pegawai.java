public class gaji_pegawai {
    String gaji;
    String gaji_tunjangan;
    String gaji_lembur;

    gaji_pegawai(String gaji, String gaji_tunjangan, String gaji_lembur) {
        this.gaji = gaji ;
        this.gaji_tunjangan = gaji_tunjangan;
        this.gaji_lembur = gaji_lembur;
    }

    void cetakpenggajian(String gaji) {
        {
            System.out.println("Gaji = " + gaji +
                    "\n Gaji_Tunjangan = "+ gaji_tunjangan +
                    "\n Gaji_Lembur = " + gaji_lembur);
        }
    }
}
