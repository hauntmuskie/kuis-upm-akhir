import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * App
 */
public class App {

    public static void main(String[] args) throws IOException {
        BufferedReader brInput = new BufferedReader(new InputStreamReader(System.in));
        String isContinue = "", exitProgram = "", loopAgain, isReturn = "";
        boolean isContinueBool = true;
        int menuChoice;
        
        while (isContinueBool) {

            System.out.print("Silahkan Tentukan Pilihan Menu Yang Mau Anda Kerjakan\nMulai Tentukan [y/T] > ");
            isContinue = brInput.readLine();

            if (isContinue.equalsIgnoreCase("t")) {
                System.out.println("\nApakah anda yakin ingin mengakhiri program?");
                System.out.print("Keluar [y/T] > ");
                exitProgram = brInput.readLine();

                if (exitProgram.equalsIgnoreCase("t")) {
                    System.out.println("\nAnda Membatalkan Keluar Dari Program..");
                    System.out.println("Kembali Ke Menu Utama..\n");

                } else if (exitProgram.equalsIgnoreCase("y")) {
                    System.out.println("Anda Keluar Dari Program..");
                    System.exit(0);

                } else if (!(isContinue.equalsIgnoreCase("y") || isContinue.equalsIgnoreCase("n"))) {
                    System.out.println("Pilihan tidak diketahui..\nHarap Masukkan Pilihan Dengan Benar!");

                }

            } else if (isContinue.equalsIgnoreCase("y")) {
                System.out.println("Loading..");
                isContinueBool = false;

            } else if (!(isContinue.equalsIgnoreCase("y") || isContinue.equalsIgnoreCase("n"))) {
                System.out.println("Pilihan tidak diketahui..\nHarap Masukkan Pilihan Dengan Benar!");

            }
        }

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
                System.out.println("#===================================#\n" + // Rionggo Rahardi
                                    "     * Pilih Tarif Sewa Kendaraan *  \n" +
                                    "#===================================#\n");
                
                System.out.println("*Promo IDUL ADHA");
                System.out.println("#Kendaraan >= 3#\n" + 
                                    "-Lama Sewa >= 3 Hari Potongan 200.000\n" +
                                    "-Lama Sewa <= 2 Hari Potongan 100.000\n" +
                                    "#Kendaraan <= 2#\n" +
                                    "-Lama Sewa >= 3 Hari Potongan 50.000\n" +
                                    "-Lama Sewa <= 2 Hari Tidak Dapat Potongan\n");

                System.out.print("Masukan Penyewa Kendaraan      :  ");
                String rentUserFullName = brInput.readLine();
                System.out.print("Masukan Jumlah Sewa Kendaraan  :  ");
                int userRentCarCount = Integer.valueOf(brInput.readLine());
                System.out.print("Masukan Lama Sewa (Hari)       :  ");
                int rentUserRentDays = Integer.valueOf(brInput.readLine());

                // Price Calculation
                final int pricePerDay = 200_000;
                int finalPriceTotal = 0;

                if (userRentCarCount >= 3) {

                    if (rentUserRentDays >= 3) {
                        finalPriceTotal = (userRentCarCount * rentUserRentDays) * pricePerDay - 200_000;
                        
                    } else {
                        finalPriceTotal = (userRentCarCount * rentUserRentDays) * pricePerDay - 100_000;

                    }

                } else {

                    if (rentUserRentDays >= 3) {    
                        finalPriceTotal = (userRentCarCount * rentUserRentDays) * pricePerDay - 50_000;

                    } else {
                        finalPriceTotal = (userRentCarCount * rentUserRentDays) * pricePerDay;

                    }
                }

                // Print output
                System.out.println("\nNama Penyewa        :   " + rentUserFullName);
                System.out.println("Harga Kendaraan     :   " + (pricePerDay * userRentCarCount));
                System.out.println("Jumlah Kendaraan    :   " + userRentCarCount);
                System.out.println("Lama Sewa (Hari)    :   " + rentUserRentDays);
                System.out.println("Total Harga         :   Rp. " + finalPriceTotal + ".-\n");

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


            // Continue Program or Exit Program

            boolean boolLoopAgain = true;

            while (boolLoopAgain) {
                System.out.print("Input Pilihan lagi? [y/T] > ");
                loopAgain = brInput.readLine();

                if (!(loopAgain.equalsIgnoreCase("y") || loopAgain.equalsIgnoreCase("t"))) {
                    System.out.println("\nPilihan tidak diketahui..\nHarap Masukkan Pilihan Dengan Benar!\n");

                } else if (loopAgain.equalsIgnoreCase("y")) {
                    System.out.println("Looping Kembali");
                    boolLoopAgain = false;
    
                } else if (loopAgain.equalsIgnoreCase("t")) {

                    do {
                        System.out.print("\nApakah Anda Yakin Ingin Keluar? [y/T] > ");
                        isReturn = brInput.readLine();
    
                        if (isReturn.equalsIgnoreCase("y")) {
                            System.out.println("Anda Keluar Dari Program..");
                            System.exit(0);
    
                        } else if (isReturn.equalsIgnoreCase("t")) {
                            System.out.println("Looping Kembali ke User Decision..\n");
    
                        } else {
                            System.out.println("\nPilihan tidak diketahui..\nHarap Masukkan Pilihan Dengan Benar!");
    
                        }

                    } while (!(isReturn.equalsIgnoreCase("y") || isReturn.equalsIgnoreCase("t")));
    
                }

            }

        } while (!isReturn.equalsIgnoreCase("y"));

    brInput.close();

    }
}