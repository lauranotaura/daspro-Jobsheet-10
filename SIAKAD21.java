import java.util.Scanner;
public class SIAKAD21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] [] nilai= new int [4] [3];
        
        

      
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
           
            System.out.println("Rata-rata Mahasiswa ke-" + (i + 1) + ": " + totalPerSiswa / 3); 
        }

        
        System.out.println("\n==== Rata-rata Nilai setiap Mata Kuliah ====");

        for (int j = 0; j < 3; j++) { 
            double totalPerMatkul = 0;
          
            for (int i = 0; i < 4; i++) { 
                totalPerMatkul += nilai[i][j];
            }
            System.out.println("Mata Kuliah ke-" + (j + 1) + ": " + totalPerMatkul / 4);
        }

        sc.close();
    }
    
}
