package pl.sda.listy;

import java.io.IOException;

public interface Lista {
    void dodajElement(int liczba);
    int znajdz(int liczba);
    String pisz();
    boolean usunPierwszy(int liczba);
    void usunPowtorzenia();
    void zapiszDoPliku(String plik) throws IOException;
}
