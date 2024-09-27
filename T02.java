// 12S24020 - Joice Anastasya Napitupulu
// 12S24014 - Arion Dippos Pandapotan Manurung
import java.util.*;
import java.lang.Math;

public class T02 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String isbn, judul, penulis, penerbit, formatbuku, kualitas;
        int tahunterbit, stok;
        double hargapembelian, minimummargin, rating;

        isbn = input.nextLine();
        judul = input.nextLine();
        penulis = input.nextLine();
        tahunterbit = Integer.parseInt(input.nextLine());
        penerbit = input.nextLine();
        formatbuku = input.nextLine();
        hargapembelian = Double.parseDouble(input.nextLine());
        minimummargin = Double.parseDouble(input.nextLine());
        stok = Integer.parseInt(input.nextLine());
        rating = Double.parseDouble(input.nextLine());
        kualitas = "";
        if (rating >= 4.7) {
            kualitas = "Best Pick";
        } else {
            if (rating >= 4.5 && rating < 4.7) {
                kualitas = "Must Read";
            } else {
                if (rating >= 4.0 && rating < 4.5) {
                    kualitas = "Recommend";
                } else {
                    if (rating >= 3.0 && rating < 4.0) {
                        kualitas = "Average";
                    } else {
                        if (rating < 3.0) {
                            kualitas = "Low";
                        }
                    }
                }
            }
        }
        System.out.println(isbn + "|" + judul + "|" + penulis + "|" + tahunterbit + "|" + penerbit + "|" + formatbuku + "|" + hargapembelian + "|" + minimummargin + "|" + stok + "|" + toFixed(rating,1) + "|" + kualitas);
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
