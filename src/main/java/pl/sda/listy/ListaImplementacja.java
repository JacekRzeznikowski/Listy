package pl.sda.listy;

public class ListaImplementacja implements Lista{
    private int[] liczby;// z main nie ma dostępu do danych private
    private int pojemnosc = 10;
    private  int rozmiar;

    ListaImplementacja(){
        this.liczby = new int[this.pojemnosc];
    }
    ListaImplementacja(int pojemnosc){
        this.liczby = new int[this.pojemnosc];

    }


    public void dodajElement(int liczba) {

    }

    public int znajdz(int liczba) {
        return 0;
    }

    public String pisz() {
        return null;
    }

    public boolean usunPierwszy(int liczba) {
        return false;
    }

    public void usunPowtorzenia() {

    }

    public void zapiszDoPliku(String plik) {

    }
}
