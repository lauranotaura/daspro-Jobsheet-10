import java.util.Scanner;

public class SIAKAD21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       //MODIFIKASI 
        System.out.print("Masukkan Jumlah Siswa: ");
        int jumlahSiswa = sc.nextInt();
        
        System.out.print("Masukkan Jumlah Mata Kuliah: ");
        int jumlahMatkul = sc.nextInt();
        
        int[][] nilai = new int[jumlahSiswa][jumlahMatkul];
        
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Input nilai mahasiswa ke-" + (i + 1));
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai mata kuliah ke-" + (j + 1) + ": ");
                nilai[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("\n========= NILAI RATA-RATA SISWA ==========");
        for (int i = 0; i < nilai.length; i++) {
            double totalPerSiswa = 0;
            for (int j = 0; j < nilai[i].length; j++) {
                totalPerSiswa += nilai[i][j];
            }
            
            double rataRataSiswa = totalPerSiswa / nilai[i].length; 
            System.out.println("Rata-rata Mahasiswa ke-" + (i + 1) + ": " + rataRataSiswa); 
            
            
        } 
        System.out.println("\n==== Rata-rata Nilai setiap Mata Kuliah ====");
        
        for (int j = 0; j < nilai[0].length; j++) { 
            double totalPerMatkul = 0;
            
            
            for (int i = 0; i < nilai.length; i++) { 
                totalPerMatkul += nilai[i][j];
            }
            
            double rataRataMatkul = totalPerMatkul / nilai.length;
            System.out.println("Mata Kuliah ke-" + (j + 1) + ": " + rataRataMatkul);
        }
        
        sc.close();
    }
}