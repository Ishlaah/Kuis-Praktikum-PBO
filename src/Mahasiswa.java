import beasiswa.BeasiswaMahaiswa;

public class Mahasiswa implements BeasiswaMahasiswa {
    private String nama;
    private double usia;
    private double nilaiJurnal,nilaiRelevansi,nilaiProblemSolving;
    
    public Mahasiswa(String nama, double usia, double nilaiJurnal, double nilaiRelevansi, double nilaiProblemSolving) {
        this.nama = nama;
        this.usia = usia;
        this.nilaiJurnal = nilaiJurnal;
        this.nilaiRelevansi = nilaiRelevansi;
        this.nilaiProblemSolving = nilaiProblemSolving;
    }
    
    @overide
    public double hitungNilaiAkhir(){
        return((nilaiJurnal*0.6) + (nilaiRelevansi*0.25) + (nilaiProblemSolving*0.15) );
    }
    
    public void tampilan(){
        System.out.println("\n");
        System.out.println("+-------+");
        System.out.println("| Hasil |");
        System.out.println("+-------+");
        System.out.println("\n");
        
       System.out.println("\tNilai akhir : " + hitungNilaiAkhir());
       
       if(hitungNilaiAkhir() < 87.5) {
           System.out.println("\tKeterangan : Tidak Lolos");
           System.out.println("\tMohon maaf, " +nama +"(" +usia + ") dinyatakan tidak diterima Beasiswa Mahasiswa karena belum mencapai nilai yang diharapkan");
       } else {
           System.out.println("\tKeterangan : Lolos");
           System.out.println("\tSelamat !!! " +nama +"(" +usia + ") dinyatakan diterima Beasiswa Mahasiswa karena telah mencapai nilai yang diharapkan");
       }
    }
}
