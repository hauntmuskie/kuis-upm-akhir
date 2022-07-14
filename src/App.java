import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * App
 */
public class App {

    public static void main(String[] args) throws IOException, NumberFormatException {
        BufferedReader brInput = new BufferedReader(new InputStreamReader(System.in));
        String isContinue, exitProgram = "", loopAgain;
        int menuChoice;
        
        do {
            System.out.print("Silahkan Tentukan Pilihan Menu Yang Mau Anda Kerjakan\nMulai Tentukan [y/T] > ");
            isContinue = brInput.readLine();

            if (isContinue.equalsIgnoreCase("t")) {
                System.out.println("Apakah anda yakin ingin mengakhiri program?");
                System.out.print("Keluar [y/T] > ");
                exitProgram = brInput.readLine();

                if (exitProgram.equalsIgnoreCase("t")) {
                    System.out.println("Anda Membatalkan Keluar Dari Program..");
                    System.out.println("Kembali Ke Menu Utama..");

                } else if (exitProgram.equalsIgnoreCase("y")) {
                    System.out.println("Anda Keluar Dari Program..");
                    System.exit(0);

                } else if (!(isContinue.equalsIgnoreCase("y") || isContinue.equalsIgnoreCase("n"))) {
                    System.out.println("Pilihan tidak diketahui..\nHarap Masukkan Pilihan Dengan Benar!");

                }
            }

        } while (!(isContinue.equalsIgnoreCase("y") || isContinue.equalsIgnoreCase("n")) || exitProgram.equalsIgnoreCase("t"));

        do {
            do {
                System.out.println();
                System.out.println("#===================================#");
                System.out.println("|           Pilihan Menu            |");
                System.out.println("#===================================#");
                System.out.println("| 1. : Pilih Tarif Sewa Kendaraan   |");
                System.out.println("#===================================#");
                System.out.println("| 2. : Pilih Bintang Besar Ke Kecil |");
                System.out.println("#===================================#");
                System.out.println("| 3. : Pilih Bintang Piramida       |");
                System.out.println("#===================================#");
                System.out.println("| 4. : Pilih Data Penjualan Gamis   |");
                System.out.println("#===================================#");
                System.out.println();
                System.out.print("Masukan Pilihan Anda : ");
                menuChoice = Integer.valueOf(brInput.readLine());

                if (menuChoice > 4) {
                    System.out.println("\nInput Tidak Valid..\nHarap Masukkan Pilihan Dengan Benar!");
                }

            } while (menuChoice > 4);
    
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
                    System.err.println("LMFAO"); // Turu

                    break;
            }

            do {
                System.out.print("Ingin Mengulangi lagi? [y/T] > ");
                loopAgain = brInput.readLine();

                if (!(loopAgain.equalsIgnoreCase("y") || loopAgain.equalsIgnoreCase("n"))) {
                    System.out.println("\nPilihan tidak diketahui..\nHarap Masukkan Pilihan Dengan Benar!\n");

                }

            } while (!(loopAgain.equalsIgnoreCase("y") || loopAgain.equalsIgnoreCase("n")));

            if (loopAgain.equalsIgnoreCase("y")) {
                System.out.println("Looping Kembali");

            } else if (loopAgain.equalsIgnoreCase("t")) {
                System.out.println("Terima Kasih");
                System.exit(0);

            }

        } while (menuChoice > 4 || loopAgain.equalsIgnoreCase("y"));

    brInput.close();

    }
}