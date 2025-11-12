import java.util.Scanner;

public class BioskopWithScanner21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] penonton = new String[4][2]; 
        int pilihan = 0;
        String nama, next;
        int baris = 0, kolom = 0;

        do {
            // Tampilan Menu
            System.out.println("\n===== MENU BIOSKOP =====");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1/2/3): ");

            // Penanganan Input Menu yang Robust
            if (sc.hasNextInt()) {
                pilihan = sc.nextInt();
                sc.nextLine(); 
            } else {
                System.out.println(">>> ERROR: Input menu harus berupa ANGKA (1, 2, atau 3).");
                sc.nextLine(); 
                pilihan = 0; 
                continue;
            }

            switch (pilihan) {
                case 1:
                    System.out.println("\n--- INPUT DATA PENONTON ---");
                    
                    while (true) {
                        System.out.print("Masukkan nama: ");
                        nama = sc.nextLine();
                        
                        boolean inputValid = false;
                        while (!inputValid) {
                            
                           
                            System.out.print("Masukkan baris (1-" + penonton.length + "): ");
                            if (!sc.hasNextInt()) {
                                System.out.println(">>> ERROR: Input baris harus berupa ANGKA.");
                                sc.nextLine(); 
                                continue;
                            }
                            baris = sc.nextInt();

                            
                            System.out.print("Masukkan kolom (1-" + penonton[0].length + "): ");
                            if (!sc.hasNextInt()) {
                                System.out.println(">>> ERROR: Input kolom harus berupa ANGKA.");
                                sc.nextLine();
                                continue;
                            }
                            kolom = sc.nextInt();
                            sc.nextLine(); 

                        
                            if (baris >= 1 && baris <= penonton.length && 
                                kolom >= 1 && kolom <= penonton[0].length) {
                                
                                
                                if (penonton[baris - 1][kolom - 1] != null) {
                                    System.out.println(">>> PERINGATAN: Kursi sudah terisi oleh " + penonton[baris - 1][kolom - 1] + ". Masukkan baris dan kolom KEMBALI.");
                                } else {
                                    inputValid = true; 
                                }
                            } else {
                                System.out.println("Kursi tidak tersedia. Baris harus 1-" + penonton.length + 
                                                   " dan Kolom harus 1-" + penonton[0].length + ".");
                            }
                        }
                        
                  
                        penonton[baris - 1][kolom - 1] = nama; 
                        
                        System.out.print("Input penonton lainnya? (y/n): ");
                        next = sc.nextLine();
                        if (next.equalsIgnoreCase("n")) {
                            break;
                        }
                    }
                    break;
                
                case 2:
                    // IMPLEMENTASI SOAL 5: Tampilkan daftar penonton (ganti null dengan ***)
                    System.out.println("\n--- DAFTAR PENONTON ---");
                    for (int i = 0; i < penonton.length; i++) {
                        System.out.print("Baris " + (i + 1) + ": ");
                        for (int j = 0; j < penonton[i].length; j++) {
                            String namaPenonton = penonton[i][j];
                            
                           
                            if (namaPenonton == null) {
                                System.out.print("***\t"); 
                            } else {
                                System.out.print(namaPenonton + "\t");
                            }
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("Terima kasih. Program dihentikan.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih 1, 2, atau 3.");
            }
        } while (pilihan != 3);
        
        sc.close();
    }
}