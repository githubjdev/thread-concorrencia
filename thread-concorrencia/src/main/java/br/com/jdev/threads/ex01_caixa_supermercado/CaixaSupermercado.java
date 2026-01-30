package br.com.jdev.threads.ex01_caixa_supermercado;

public class CaixaSupermercado {

    public static void main(String[] args) {

        Runnable caixa1 = () -> {
            for (int i = 1; i <= 3; i++) {
                System.out.println("Caixa 1 atendendo cliente " + i);
                dormir();
            }
        };
        
        Runnable caixa2 = () -> {
            for (int i = 1; i <= 8; i++) {
                System.out.println("Caixa 2 atendendo cliente " + i);
                dormir();
            }
        };

        new Thread(caixa1).start();
        new Thread(caixa2).start();
    }

    private static void dormir() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
