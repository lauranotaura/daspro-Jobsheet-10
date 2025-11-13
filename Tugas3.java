import java.util.Scanner;

public class Tugas3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Deklarasi 
        int[][] hasilSurvey = new int[10][6];
        int jumlahResponden = hasilSurvey.length; // 10
        int jumlahPertanyaan = hasilSurvey[0].length; // 6

        System.out.println("=== Sistem Input dan Analisis Data Survei Kepuasan Pelanggan ===");

        // A. Menyimpan Hasil Survei 
        System.out.println("\n[A] Memasukkan Hasil Survei (Jawaban 1-5)");
        
        for (int i = 0; i < jumlahResponden; i++) {
            System.out.println("----------------------------------------------");
            System.out.println("Responden ke-" + (i + 1));
            for (int j = 0; j < jumlahPertanyaan; j++) {
                System.out.print("Jawaban Pertanyaan ke-" + (j + 1) + " (1-5): ");
                // Asumsi input valid (1-5)
                hasilSurvey[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("\n--- Data Survei Berhasil Disimpan ---");

        // B. Menampilkan Nilai Rata-Rata untuk Setiap Responden 
        System.out.println("\n[B] Rata-Rata Nilai Kepuasan Setiap Responden");
        for (int i = 0; i < jumlahResponden; i++) {
            double totalJawaban = 0;
            
            for (int j = 0; j < jumlahPertanyaan; j++) {
                totalJawaban += hasilSurvey[i][j];
            }
            double rataRataResponden = totalJawaban / jumlahPertanyaan;
            System.out.printf("Responden ke-%d: %.2f\n", (i + 1), rataRataResponden);
        }

        // C. Menampilkan Nilai Rata-Rata untuk Setiap Pertanyaan 
        System.out.println("\n[C] Rata-Rata Nilai Kepuasan Setiap Pertanyaan");
        for (int j = 0; j < jumlahPertanyaan; j++) {
            double totalJawaban = 0;
            
            for (int i = 0; i < jumlahResponden; i++) {
                totalJawaban += hasilSurvey[i][j];
            }
            double rataRataPertanyaan = totalJawaban / jumlahResponden;
            System.out.printf("Pertanyaan ke-%d: %.2f\n", (j + 1), rataRataPertanyaan);
        }
        
        // D. Menampilkan Nilai Rata-Rata Secara Keseluruhan 
        System.out.println("\n[D] Rata-Rata Nilai Kepuasan Secara Keseluruhan");
        double totalKeseluruhan = 0;
        int totalElemen = jumlahResponden * jumlahPertanyaan; // 10 * 6 = 60
        
        
        for (int i = 0; i < jumlahResponden; i++) {
            for (int j = 0; j < jumlahPertanyaan; j++) {
                totalKeseluruhan += hasilSurvey[i][j];
            }
        }
        
        double rataRataKeseluruhan = totalKeseluruhan / totalElemen;
        System.out.printf("Rata-Rata Keseluruhan (dari %d data): %.2f\n", totalElemen, rataRataKeseluruhan);

        sc.close();
    }
}