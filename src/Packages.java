import java.util.*;

class Packages{
    private static final int NULL = 0;
    private String namapaket;
    private String jeniskendaraan;
    private String destinasi;
    private Integer price;
    private Integer jumlahtiket;
    
    Packages(String pakett,String jenisken,String dest,int harga,int jumlah){
        this.namapaket = pakett;
        this.jeniskendaraan = jenisken;
        this.destinasi = dest;
        this.price = harga;
        this.jumlahtiket = jumlah;
    }
    
    void set_data(String pakett,String jenisken,String dest,int harga,int jumlah){
        this.namapaket = pakett;
        this.jeniskendaraan = jenisken;
        this.destinasi = dest;
        this.price = harga;
        this.jumlahtiket = jumlah;
    }

    void set_namapaket(String pakett){
        this.namapaket = pakett;
    }

    void set_jenisken(String jenisken){
        this.jeniskendaraan = jenisken;
    }

    void set_dest(String dest){
        this.destinasi = dest;
    }

    void set_price(int harga){
        this.price = harga;
    }

    void set_jumlahtiket(int jumlah){
        this.jumlahtiket = jumlah;
    }
    
    void get_data(){
        System.out.println(" Package Name: " + this.namapaket);
        System.out.println(" Transportation: " + this.jeniskendaraan);
        System.out.println(" Destination: " + this.destinasi);
        System.out.println(" Price: " + this.price);
        System.out.println(" Ticket Amount: " + this.jumlahtiket);
    }
    void print_data(){
            System.out.println(this.namapaket + "\t || " + this.jeniskendaraan +  "\t || " +
            this.destinasi +  "\t || " + this.price +  "\t || " + this.jumlahtiket + "\t |");
    }
}
