package application;

import entities.Iphone;

public class Program {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.exibirPagina();
        iphone.ligar();
        iphone.tocar();
    }
}
