package pl.sda.listy;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

public class ListaImplementacja implements Lista {
    private int[] liczby;// z main nie ma dostępu do danych private
    private int pojemnosc = 10;
    private int rozmiar = 0;
    //private int dlugosc = pojemnosc;

    ListaImplementacja() {
        this.liczby = new int[pojemnosc];
    }


    public void dodajElement(int liczba) {

//        this.liczby[rozmiar] = liczba;//moje rozwiązanie
//        if (rozmiar < (dlugosc - 1)) {
//            ++rozmiar;
//            System.out.println("Rozmiar = " + rozmiar);
//        } else {
//            dlugosc *= 2;
//            liczby = Arrays.copyOf(liczby, dlugosc);
//            ++rozmiar;
//            System.out.println("Rozmiar = " + rozmiar);
//        }
        if(this.rozmiar == this.pojemnosc){
            System.out.println("Tablica jest pełna");
            this.liczby = Arrays.copyOf(this.liczby, this.liczby.length*2);
            this.pojemnosc = this.liczby.length;
        }
        else{
            this.liczby[this.rozmiar] = liczba;
            this.rozmiar++;

        }

    }
        public int znajdz ( int liczba){
            for (int i = 0; i < pojemnosc; i++)
                if (liczby[i] == liczba)
                    return i;
            return -1;
        }

        public String pisz () {
        String tekst = "Pojemność: "+pojemnosc+"\nRozmiar: "+rozmiar+"\nElementy: ";
        for(int i = 0; i < rozmiar; i++)
            if(i != rozmiar-1)
            tekst += liczby[i]+", ";
            else tekst += liczby[i];
        tekst += ".";
            return tekst;
        }

    @Override
    public String toString() {
        return "ListaImplementacja{" +
                "liczby=" + Arrays.toString(liczby) +
                ", pojemnosc=" + pojemnosc +
                ", rozmiar=" + rozmiar +
                '}';
    }

//    @Override
//        public String toString(){
//
//        return Arrays.toString(this.liczby);
//        }

        public boolean usunPierwszy (int liczba){
        for(int i = 0; i < rozmiar;)
            if (liczby[i] != liczba)
                ++i;
            else {
                for (int j = 0; j < rozmiar - i-1; j++)
                    liczby[i + j] = liczby[i + j + 1];
                liczby[rozmiar] = 0;
                --rozmiar;
                liczby = Arrays.copyOf(this.liczby,pojemnosc-1);

                return true;
            }
            return false;
        }

        public void usunPowtorzenia () {
        for(int k =1; k <rozmiar; k++)
        for(int i = 0; i <= rozmiar; i++ )
            for(int j = 1; j<rozmiar-i; j++)
                if (liczby[i] == liczby[i+j])
            usunPierwszy(liczby[i]);

        }

        public void zapiszDoPliku (String plik) throws IOException {
            File file = new File("C:\\Users\\jacek\\Desktop\\Lista\\plik.txt");
            try (PrintWriter zapis = new PrintWriter("C:\\Users\\jacek\\Desktop\\Lista\\plik.txt")) {
                zapis.println(plik);
            }


        }
    }



