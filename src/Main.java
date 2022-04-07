
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Main {
    public static Scanner userInput = new Scanner(System.in);
    public static void main(String[] args) {
        int pilih,usia;
        
        System.out.println("+----------------------------+");
        System.out.println("| Pogram Beasiswa PT. Benang |");
        System.out.println("+----------------------------+");
        System.out.println("Terdapat 2 program beasiswa yang dibuka : ");
        System.out.println("1. Beasiswa Pelajar");
        System.out.println("2. Beasiswa Mahasiswa");
        System.out.print("Pilih beasiswa yang didaftar : ");
        pilih = userInput.nextInt();
        if(pilih==1) {
            
            
            System.out.println("+++ Menu +++");
            System.out.println("1. Tampilkan hasil");
            System.out.println("2. Ubah nilai");
            System.out.println("3. Keluar");
            System.out.print("Pilih : ");
            int pilih2 = userInput.nextInt();
            
            if (pilih==1) {
                if(usia>=16 && usia<=24) {
                    
                }
                
                System.out.println("Nilai Akhir : ");
                System.out.println("Keterangan : ");
                
                System.out.println("");
                
            } else if(pilih==2) {
                
            } else if(pilih==3) {
                
            } else {
                
            }
            
        } else if(pilih==2){
                
        }
        
       
    }
     public static void mahasiswa() {
           System.out.println("=== FORM PENDAFTARAN ====");
            System.out.print("Nama Lengkap : ");
            nama = userInput.nextString();
            System.out.print("Usia : ");
            usia = userInput.nextInt();

            System.out.println("--- Form Penilaian ---");
            System.out.println("Keterangan : Nilai yang valid berada di antara 0 - 100");
            System.out.println("\n");
            System.out.print("Nilai Struktur dan Konten Esai : ");
            double nilaiEsai = userInput.nextDouble();
            System.out.print("Nilai Teknik Visualisasi : ");
            double nilaiVisualisasi = userInput.nextDouble();
            System.out.print("Nilai Kemampuan Design Thinking : ");
            double nilaiDesign = userInput.nextDouble();
            System.out.println("\n");
       }
     
     
}
