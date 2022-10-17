public class mainApp {
    public static void main(String[] args) {
        data_pegawai data_pegawai= new data_pegawai(
                "Siska",
                "17 Juni 2001",
                "Junge",
                "2.000.000",
                "Manajer",
                "S1 Ekonomi");

        data_pegawai.cetakdata_pegawai(data_pegawai.Nama);



        jabatan jabatan= new jabatan(
                " frontend",

                " UMUM ");
        jabatan.cetakjabatan(jabatan.bendahara);



        gaji_pegawai gaji_pegawai= new gaji_pegawai(
                "1.500.000",
                "800.000",
                "2.000.000");
        gaji_pegawai.cetakpenggajian(gaji_pegawai.gaji);



        status_pendidikan status_pendidikan= new status_pendidikan(
                "Sarjana Komputer","Magister Akuntasi");
        status_pendidikan.cetakstatusPendidikan(status_pendidikan.S1 );


    }
}
