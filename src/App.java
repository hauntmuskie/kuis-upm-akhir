import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * App
 */
public class App {

    public static void main(String[] args) throws IOException {
        BufferedReader brInput = new BufferedReader(new InputStreamReader(System.in));
        String isContinue, isCancel = "";
        int menuChoice;
        
        do {
            System.out.println("Silahkan Tentukan Pilihan Menu Yang Mau Anda Kerjakan");
            System.out.print("Mulai Tentukan [y/T] ");
            isContinue = brInput.readLine();

            if (isContinue.equalsIgnoreCase("t")) {
                System.out.println("Apakah anda yakin ingin mengakhiri program?");
                System.out.print("Keluar [y/T] ");
                isCancel = brInput.readLine();

                if (isCancel.equalsIgnoreCase("t")) {
                    System.out.println("Looping Kembali");

                } else if (isCancel.equalsIgnoreCase("y")) {
                    System.out.println("Terima Kasih");
                    System.exit(0);

                } else {
                    System.out.println("Pilihan tidak diketahui");
                    System.out.println("Looping Kembali");
                }
            } 

            if (!(isContinue.equalsIgnoreCase("y") || isContinue.equalsIgnoreCase("n")) || isCancel.equalsIgnoreCase("t")) {
                System.out.println("Pilihan tidak diketahui..\nHarap Masukkan Pilihan Dengan Benar!]");
            }

        } while (!(isContinue.equalsIgnoreCase("y") || isContinue.equalsIgnoreCase("n")) || isCancel.equalsIgnoreCase("t"));

        do {
            System.out.println();
            System.out.println("1. : Pilih Tarif Sewa Kendaraan");
            System.out.println("2. : Pilih Bintang Besar Ke Kecil");
            System.out.println("3. : Pilih Bintang Piramida");
            System.out.println("4. : Pilih Data Penjualan Gamis");
            System.out.println();
            System.out.print("Masukan Pilihan Anda : ");
            menuChoice = Integer.valueOf(brInput.readLine());
    
            switch (menuChoice) {
    
                case 1:
                    System.out.println("1"); // Rionggo Rahardi
                    break;
                
                case 2:
                    System.out.println("2"); //
    
                    break;
                case 3: 
                    System.out.println("3"); //
    
                    break;
                case 4:
                    System.out.println("4"); // 
    
                    break;
                default:
                    System.out.println("LMFAO"); // Turu
                    break;
            }
        } while (!(menuChoice == 1 || menuChoice == 2 || menuChoice == 3 || menuChoice == 4));
        brInput.close();
    }
}