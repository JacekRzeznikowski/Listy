package pl.sda.listy;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Lista lista = new ListaImplementacja();//po lewej jest typ interfejsu, tak robimy w przypadku interfejsów

        for(int i =0; i<20; i++) {
            int number = (2+i)%7;
            lista.dodajElement(number);
        }
        System.out.println("Lista gotowa");
        int wynik = lista.znajdz(37);
        System.out.println("Poszukiwana liczba znajduje sie na pozycji "+wynik);
        System.out.println(lista.pisz());
        System.out.println("toString: "+lista.toString());
        System.out.println(lista.usunPierwszy(6));
        System.out.println(lista.pisz());
        lista.usunPowtorzenia();
        System.out.println(lista.pisz());
        lista.zapiszDoPliku(lista.pisz());
        System.out.println(lista.toString());
//        int[] tab = new int[5];//tu mamy sposób na powiększanie tablicy
//        tab = Arrays.copyOf(tab, tab.length-1);
//        System.out.println(tab.length);

        StringBuilder b = new StringBuilder();
        b.append("ABC");
        b.append("BCD");
        b.append("EFG");
        System.out.println(b);

//dodaje komentarz
    }
}
