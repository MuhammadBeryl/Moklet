public class SiswaMoklet {
    public static void main(String[] args) {
        System.out.println("Data Siswa moklet");
        SiswaMoklet m = new SiswaMoklet();
        m.tampilNama();
        System.out.println("Usia Siswa: "+m.usia(2007));
    }

    public void tampilNama(){
        String nama="beryl";
        String jurusan="Rekayasa Perangkat Lunak";
        System.out.println("Nama siswa: "+ nama);
        System.out.println("Jurusan: "+ jurusan);
    }

    public int usia(int tahunlahir){
        int usia=2024-tahunlahir;
        return usia;
    }
}
