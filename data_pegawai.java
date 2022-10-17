public class data_pegawai {
    String Nama, Alamat, Gaji, Jabatan, statusPendidikan;
    String TTL;

    data_pegawai(String nama, String ttl, String  alamat, String
            gaji, String jabatan, String statusPendidikan) {
        this.Nama = nama;
        this.Alamat = alamat;
        this.TTL = ttl;
        this.Jabatan = jabatan;
        this.statusPendidikan = statusPendidikan;
        this.Gaji = gaji;
    }
    void cetakdata_pegawai (String Nama) {System.out.println(" Nama = "+Nama +
            " \n Alamat = "+Alamat +
            " \n TTL = "+ TTL +
            " \n Gaji = "+ Gaji +
            " \n Jabatan = "+ Jabatan +
            " \n StatusPendidikan = "+ statusPendidikan);
    }
}
