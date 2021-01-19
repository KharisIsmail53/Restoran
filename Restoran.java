import java.util.Scanner;


public class Coba {

    

    public static void main(String[] args) {
   	public static int makanan,minuman,menu,n1,makan,minum,diskon,TOTAL1,TOTAL,total,total_;
        String Nama;
        Scanner input = new Scanner(System.in);
        System.out.println("Mau pesen kak? (y/n) ");
        char pesen = input.next().charAt(0);   
        if (pesen == 'y' || pesen == 'Y'){
            System.out.println("Selamat Datang");
            System.out.print("Masukan Nama Anda : ");
            Nama = input.next ();
            System.out.println("Hi " + Nama);
            System.out.println("Mau pesan apa");
            System.out.println("1.Makanan");
            System.out.println("2.Minuman");
            System.out.println("3.Ga makasih kak");
            System.out.println("Pilihan Anda : ");
            menu = input.nextInt();
            switch (menu)
            {
                case 1:
                        System.out.println("Mau makan apa kak");
                        break;
                case 2:
                        System.out.println("Mau minum apa kak");
                        System.out.println("Bisa diliat kak menu minuman kami");
                        System.out.println("1.Jus Jeruk");
                        System.out.println("2.Teh Tarik");
                        System.out.println("3.Air Mineral");
                        System.out.println("4.Tidak Jadi pesan");
                        System.out.println("Pilihan Anda : ");
                        int menu1 = input.nextInt();
                        switch(menu1){
                            case 1:
                                System.out.print("Pilihan Anda Jus Jeruk");
                                int Harga1 = 12000;
                                System.out.println(" Dengan Harga IDR 12000");
                                System.out.println("Mau berapa Banyak ?");
                                int banyak = input.nextInt();
                                int Harga1N = banyak * Harga1;
                                System.out.println("Total Harga " + Harga1N);
                                minum = Harga1N;
                                break;
                            case 2:
                                System.out.print("Pilihan Anda Teh Tarik");
                                int Harga2 = 10000;
                                System.out.println(" Dengan Harga IDR 10000");
                                System.out.println("Mau berapa Banyak ?");
                                int banyak2 = input.nextInt();
                                int Harga2N = banyak2 * Harga2;
                                System.out.println("Total Harga " + Harga2N);
                                minum = Harga2N;
                                break;
                            case 3:
                                System.out.print("Pilihan Anda Air Mineral");
                                int Harga3 = 5000;
                                System.out.println(" Dengan Harga IDR 5000");
                                System.out.println("Mau berapa Banyak ?");
                                int banyak3 = input.nextInt();
                                int Harga3N = banyak3 * Harga3;
                                System.out.println("Total Harga " + Harga3N);
                                minum = Harga3N;
                                break;
                            default :
                                System.out.println("Mau nyoba menu Makanan kita kak ?");
                                break;

                        }
                    break;
                default :System.out.println("Ga mau liat-liat dulu kak ?");
                        break;

                        }


            System.out.println("Boleh ka di liat dulu Menu Makanannya kak :");
            System.out.println("1.Nasi Goreng Pete");
            System.out.println("2.Indomie Telur");
            System.out.println("3.Roti Bakar Spesial");
            System.out.println("4.Terima Kasih");
            System.out.println("Pilihan Anda : ");
            makanan = input.nextInt();
            switch (makanan)
            {
                case 1:
                        System.out.print("Pilihan Anda Nasi Goreng");
                        int price = 22000;
                        System.out.println(" Dengan Harga IDR 22000");
                        System.out.println("Mau berapa Banyak ?");
                        int tota10 = input.nextInt();
                        int priceN = tota10 * price;
                        System.out.println("Total Harga " + priceN);
                        makan = priceN;
                        break;
                case 2:
                        System.out.print("Pilihan Anda Indomie Telur");
                        int price2 = 15000;
                        System.out.println(" Dengan Harga IDR 15000");
                        System.out.println("Mau berapa Banyak ?");
                        int total1 = input.nextInt();
                        int price1N = total1 * price2;
                        System.out.println("Total Harga " + price1N);
                        makan = price1N;
                        break;
                case 3:
                        System.out.print("Pilihan Anda Roti Bakar Spesial");
                        int price3 = 10000;
                        System.out.println(" Dengan Harga IDR 10000");
                        System.out.println("Mau berapa Banyak ?");
                        int total2 = input.nextInt();
                        int price2N = total2 * price3;
                        System.out.println("Total Harga " + price2N);
                        makan = price2N;
                        break;

                default:
                        System.out.println("Mau pesen Minum Kak ?");
                        break;
            }
                        System.out.println("Bisa diliat kak menu minuman kami");
                        System.out.println("1.Jus Jeruk");
                        System.out.println("2.Teh Tarik");
                        System.out.println("3.Air Mineral");
                        System.out.println("4.udah terima kasih");
                        System.out.println("Pilihan Anda : ");
                        minuman = input.nextInt();
                        switch (minuman)
                    {
                        case 1:
                                System.out.print("Pilihan Anda Jus Jeruk");
                                int harga1 = 12000;
                                System.out.println(" Dengan Harga IDR 12000");
                                System.out.println("Mau berapa Banyak ?");
                                int Banyak = input.nextInt();
                                int harga1N = Banyak * harga1;
                                System.out.println("Total Harga " + harga1N);
                                minum = harga1N;
                                break;
                            case 2:
                                System.out.print("Pilihan Anda Teh Tarik");
                                int harga2 = 10000;
                                System.out.println(" Dengan Harga IDR 10000");
                                System.out.println("Mau berapa Banyak ?");
                                int Banyak2 = input.nextInt();
                                int harga2N = Banyak2 * harga2;
                                System.out.println("Total Harga " + harga2N);
                                minum = harga2N;
                                break;
                            case 3:
                                System.out.print("Pilihan Anda Air Mineral");
                                int harga3 = 5000;
                                System.out.println(" Dengan Harga IDR 5000");
                                System.out.println("Mau berapa Banyak ?");
                                int Banyak3 = input.nextInt();
                                int harga3N = Banyak3 * harga3;
                                System.out.println("Total Harga " + harga3N);
                                minum = harga3N;
                                break;
                            default :
                                System.out.println("Terima Kasih ");

                        }
            total = makan + minum;
            System.out.println("Mau nambah pesanan kak ? (y/n)");
            char lagi =  input.next().charAt(0);
            if(lagi == 'y' || lagi == 'Y'){
                while (lagi == 'y' || lagi == 'y'){
                    System.out.println("Mau nambah pesanan kak ?");
                    System.out.println("1.Makanan");
                    System.out.println("2.Minuman");
                    System.out.println("3.Udah itu aja");
                    System.out.println("Pilihan Anda : ");
                    menu = input.nextInt();
                    switch (menu)
                    {
                        case 1:
                                System.out.println("Mau makan apa kak");
                                System.out.println("Boleh ka di liat dulu Menu Makanannya kak :");
                                System.out.println("1.Nasi Goreng Pete");
                                System.out.println("2.Indomie Telur");
                                System.out.println("3.Roti Bakar Spesial");
                                System.out.println("4.Terima Kasih");
                                System.out.println("Pilihan Anda : ");
                                makanan = input.nextInt();
                                switch (makanan)
                                {
                                    case 1:
                                            System.out.print("Pilihan Anda Nasi Goreng");
                                            int price = 22000;
                                            System.out.println(" Dengan Harga IDR 22000");
                                            System.out.println("Mau berapa Banyak ?");
                                            int tota1 = input.nextInt();
                                            int priceN = total * price;
                                            System.out.println("Total Harga " + priceN);
                                            makan = priceN;
                                            break;
                                    case 2:
                                            System.out.print("Pilihan Anda Indomie Telur");
                                            int price2 = 15000;
                                            System.out.println(" Dengan Harga IDR 15000");
                                            System.out.println("Mau berapa Banyak ?");
                                            int total1 = input.nextInt();
                                            int price1N = total1 * price2;
                                            System.out.println("Total Harga " + price1N);
                                            makan = price1N;
                                            break;
                                    case 3:
                                            System.out.print("Pilihan Anda Roti Bakar Spesial");
                                            int price3 = 10000;
                                            System.out.println(" Dengan Harga IDR 10000");
                                            System.out.println("Mau berapa Banyak ?");
                                            int total2 = input.nextInt();
                                            int price2N = total2 * price3;
                                            System.out.println("Total Harga " + price2N);
                                            makan = price2N;
                                            break;

                                    default:
                                            System.out.println("Mau pesen Minum Kak ?");
                                            break;
                                }
                                break;
                        case 2:
                                System.out.println("Mau minum apa kak");
                                System.out.println("Bisa diliat kak menu minuman kami");
                                System.out.println("1.Jus Jeruk");
                                System.out.println("2.Teh Tarik");
                                System.out.println("3.Air Mineral");
                                System.out.println("4.Tidak Jadi pesan");
                                System.out.println("Pilihan Anda : ");
                                int menu1 = input.nextInt();
                                switch(menu1){
                                    case 1:
                                        System.out.print("Pilihan Anda Jus Jeruk");
                                        int Harga1 = 12000;
                                        System.out.println(" Dengan Harga IDR 12000");
                                        System.out.println("Mau berapa Banyak ?");
                                        int banyak = input.nextInt();
                                        int Harga1N = banyak * Harga1;
                                        System.out.println("Total Harga " + Harga1N);
                                        minum = Harga1N;
                                        break;
                                    case 2:
                                        System.out.print("Pilihan Anda Teh Tarik");
                                        int Harga2 = 10000;
                                        System.out.println(" Dengan Harga IDR 10000");
                                        System.out.println("Mau berapa Banyak ?");
                                        int banyak2 = input.nextInt();
                                        int Harga2N = banyak2 * Harga2;
                                        System.out.println("Total Harga " + Harga2N);
                                        minum = Harga2N;
                                        break;
                                    case 3:
                                        System.out.print("Pilihan Anda Air Mineral");
                                        int Harga3 = 5000;
                                        System.out.println(" Dengan Harga IDR 5000");
                                        System.out.println("Mau berapa Banyak ?");
                                        int banyak3 = input.nextInt();
                                        int Harga3N = banyak3 * Harga3;
                                        System.out.println("Total Harga " + Harga3N);
                                        minum = Harga3N;
                                        break;
                                    default :
                                        System.out.println("Mau nyoba menu Makanan kita kak ?");
                                        break;

                                }
                            break;
                        default :System.out.println("Mau bayar aja kak ?");
                                 lagi = 'n';
                                 break;
                                  
                                 
                    }
                
                }TOTAL = makan + minum;
                                 total_ = total + TOTAL;
                               
                     
                
        }else if (lagi == 'n' || lagi == 'N');
                    TOTAL = makan + minum;        
                    System.out.println("=============");
                    System.out.println("Ingin Bayar ?");
                    System.out.println("Mau mencoba gopay? (y/n) ");

                    char gopay = input.next().charAt(0);
                        System.out.println("============");
                        if (gopay == 'y' || gopay == 'Y'){
                            System.out.println("selamat anda mendapatkan diskon 30%");
                            System.out.println("total harga sebesar " + TOTAL);
                            diskon =  (TOTAL * 30)/100;
                            System.out.println("Anda mendapatkan diskon sebesar" + diskon);
                            TOTAL1 = TOTAL - diskon;
                            System.out.println("Anda membayar sebesar " + TOTAL1);

                        } else if (gopay == 'n' || gopay == 'N'){
                            System.out.println("Total harga sebesar" + TOTAL);
                            System.out.println("Anda Membayar sebesar = ");
                            int bayar = input.nextInt();
                            System.out.println("kembalian anda sebesar = " + (bayar -TOTAL));
                        }
        
    }else if (pesen == 'n' || pesen == 'N')
    System.out.println("Terima Kasih Kunjungannya kak");
    System.out.println("Kita tunggu kedatangannya");
    }
    }    