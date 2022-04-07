/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Pelajar implements BeasiswaPelajar {
    private String nama;
    private double usia;
    private double nilaiEsai,nilaiVisualisasi,nilaiDesign;
    
    public Pelajar(String nama, double usia, double nilaiEsai, double nilaiVisualisasi, double nilaiDesign) {
        this.nama = nama;
        this.usia = usia;
        this.nilaiEsai = nilaiEsai;
        this.nilaiVisualisasi = nilaiVisualisasi;
        this.nilaiDesign = nilaiDesign;
    }
    
    @overide
    public double hitungNilaiAkhir(){
        return((nilaiEsai*0.5) + (nilaiVisualisasi*0.2) + (nilaiDesign*0.3) );
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

