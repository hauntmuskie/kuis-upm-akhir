import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Kuis2_R2Q_Kelompok4 {

    public static void main(String[] args) throws IOException {
        BufferedReader brInput = new BufferedReader(new InputStreamReader(System.in));
        String isContinue = "", exitProgram = "", isReturn = "", loopAgain;
        boolean lanjutkanProgram = true;
        int menuChoice;

        while (lanjutkanProgram) {

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
                    System.out.println("Pilihan tidak diketahui..\nHarap Masukan Pilihan Dengan Benar!");

                }

            } else if (isContinue.equalsIgnoreCase("y")) {
                System.out.println("Loading..");
                lanjutkanProgram = false;

            } else if (!(isContinue.equalsIgnoreCase("y") || isContinue.equalsIgnoreCase("n"))) {
                System.out.println("\nPilihan tidak diketahui..\nHarap Masukan Pilihan Dengan Benar!\n");

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
                    System.out.println("\nInput Tidak Valid..\nHarap Masukan Pilihan Dengan Benar!");
                }

            } while (menuChoice > 4);

            switch (menuChoice) {

                case 1: // Rionggo Rahardi
                    System.out.println("#=========================================#\n" +
                                        "     * Pilih Tarif Sewa Kendaraan *  \n" +
                                        "#=========================================#\n" +
                                        "*Promo IDUL ADHA\n" +
                                        "#Kendaraan >= 3#\n" +
                                        "-Lama Sewa >= 3 Hari Potongan 200.000\n" +
                                        "-Lama Sewa <= 2 Hari Potongan 100.000\n" +
                                        "#Kendaraan <= 2#\n" +
                                        "-Lama Sewa >= 3 Hari Potongan 50.000\n" +
                                        "-Lama Sewa <= 2 Hari Tidak Dapat Potongan\n" +
                                        "#=========================================#\n");

                    System.out.print("Masukan Penyewa Kendaraan      :  ");
                    String userRentFullName = brInput.readLine();
                    System.out.print("Masukan Jumlah Sewa Kendaraan  :  ");
                    int userRentCarCount = Integer.valueOf(brInput.readLine());
                    System.out.print("Masukan Lama Sewa (Hari)       :  ");
                    int userRentDaysLease = Integer.valueOf(brInput.readLine());

                    // Price Calculation
                    final int pricePerDay = 200_000;
                    int finalPriceTotal = 0, discountPrice = 0;

                    if (userRentCarCount >= 3) {

                        if (userRentDaysLease >= 3) {
                            finalPriceTotal = (userRentCarCount * userRentDaysLease) * pricePerDay - 200_000;
                            discountPrice = 200_000;

                        } else if (userRentDaysLease <= 2) {
                            finalPriceTotal = (userRentCarCount * userRentDaysLease) * pricePerDay - 100_000;
                            discountPrice = 100_000;

                        }

                    } else if (userRentCarCount <= 2) {

                        if (userRentDaysLease >= 3) {
                            finalPriceTotal = (userRentCarCount * userRentDaysLease) * pricePerDay - 50_000;
                            discountPrice = 50_000;

                        } else if (userRentDaysLease <= 2) {
                            finalPriceTotal = (userRentCarCount * userRentDaysLease) * pricePerDay;
                            discountPrice = 0;

                        }
                    }

                    if (finalPriceTotal == 0) {
                        System.out.println("\nAnda Tidak Mendapat Potongan..");

                    } else {
                        System.out.println("\nAnda Mendapat Potongan Rp. " + discountPrice + ",-");

                    }

                    // Print output
                    System.out.println("\nNama Penyewa        :   " + userRentFullName);
                    System.out.println("Harga Kendaraan     :   " + (pricePerDay * userRentCarCount));
                    System.out.println("Jumlah Kendaraan    :   " + userRentCarCount);
                    System.out.println("Lama Sewa (Hari)    :   " + userRentDaysLease);
                    System.out.println("Total Harga         :   Rp. " + finalPriceTotal + ".-");
                    System.out.println();

                    break;
                case 2: // Siti Mawaddah
                    int barisSegitiga;
                    System.out.println( "#====================================#\n" +
                                        " * MEMBUAT SEGITIGA SIKU-SIKU KANAN *    \n" +
                                        "#====================================#\n"); 
                    
                    System.out.print("Masukkan Nilai Perulangan : ");
                    barisSegitiga = Integer.valueOf(brInput.readLine());
                    System.out.println();

                    for (int i = barisSegitiga; i >= 1; i--){

                        for (int j = 1; j <= barisSegitiga-i; ++j) {
                            System.out.print(" ");

                        }

                        for (int k = 1; k <= i; ++k) {
                            System.out.print("*");

                        }

                        System.out.print("\n");
                    }

                    System.out.println();

                    break;
                case 3: // Amelia Azra Pakaya
                    int tinggiPiramida;
                    System.out.println( "#====================================#\n" +
                                        "     * MEMBUAT BINTANG PIRAMIDA *    \n" +
                                        "#====================================#\n"); 
                    
                    System.out.print("Masukkan Tinggi Piramida : ");
                    tinggiPiramida = Integer.valueOf(brInput.readLine());
                    System.out.println();

                    for (int a = 1; a <= tinggiPiramida; a++) {

                        for (int b = tinggiPiramida-1; b >= a; b--) {

                            System.out.print(" ");
                        }

                        for (int c = 1; c <= a; c++) {
                            System.out.print("*");

                        }

                        for (int d = 1; d <= a-1; d++) {
                            System.out.print("*");

                        }

                        System.out.println();
                    }

                    System.out.println();

                    break;
                case 4: // Farden Ramzy Muharram
                    System.out.println("----------------------------------------------------");
                    System.out.println("      === Data Pemesanan Gamis/Sarimbit ===        ");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.print("Masukkan Nama Penjaga      : ");
                    String namaPenjaga = brInput.readLine();
                    System.out.print("Masukkan Banyaknya Pesanan : ");
                    
                    int input = Integer.valueOf(brInput.readLine());
                    int[] P = new int[input];
                    String kodeBarang = "";
                    long totalPendapatan = 0, hargaPesanan = 0, totalKeuntungan = 0, pendapatanBersih = 0, index;

                    for (index = 0; index < P.length; totalPendapatan += hargaPesanan) {
                        index++;
                        System.out.print("Pesanan ke   " + index + "             : Rp.  ");
                        hargaPesanan = Long.parseLong(brInput.readLine());
                        System.out.print("Kode Barang                : ");
                        kodeBarang = brInput.readLine();
                    }

                    // Price Calculation
                    totalKeuntungan = totalPendapatan * 10 / 100;
                    pendapatanBersih = totalPendapatan - totalPendapatan * 10 / 100;

                    // Print output
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println(" Hasil Total Pendapatan =          Rp." + totalPendapatan);
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println(" Keuntungan " + index + " Barang =             Rp. " + totalKeuntungan);
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println(" Pendapatan Bersih =               Rp." + pendapatanBersih);
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println();

                    break;
                default:
                    System.out.println("Pilihan Tidak Diketahui..\nHarap Masukan Pilihan Dengan Benar!");                        
                    break;
            } // End Switch

            // Continue Program or Exit Program

            boolean returnToMenu = true;

            while (returnToMenu) {
                System.out.print("Input Pilihan lagi? [y/T] > ");
                loopAgain = brInput.readLine();

                if (!(loopAgain.equalsIgnoreCase("y") || loopAgain.equalsIgnoreCase("t"))) {
                    System.out.println("\nPilihan tidak diketahui..\nHarap Masukan Pilihan Dengan Benar!\n");

                } else if (loopAgain.equalsIgnoreCase("y")) {
                    System.out.println("Kembali ke Menu Utama..");
                    returnToMenu = false;

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
                            System.out.println("\nPilihan tidak diketahui..\nHarap Masukan Pilihan Dengan Benar!");

                        }

                    } while (!(isReturn.equalsIgnoreCase("y") || isReturn.equalsIgnoreCase("t")));

                } // End of if-else if-else

            } // While Loop

        } while (!isReturn.equalsIgnoreCase("y")); // End of do-while loop

        brInput.close();

    }
}