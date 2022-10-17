public class jabatan {
    String devloper;
    String bendahara;

    jabatan(String devloper, String bendahara){
        this.devloper = devloper;

        this.bendahara = bendahara;

    }
    void cetakjabatan(String bendahara){
        System.out.println("Devloper = "+ devloper +
                " \n Bendahara = "+ bendahara);
    }
}
