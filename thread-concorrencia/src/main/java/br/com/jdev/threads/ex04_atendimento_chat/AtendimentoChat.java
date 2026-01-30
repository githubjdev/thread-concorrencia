package br.com.jdev.threads.ex04_atendimento_chat;

public class AtendimentoChat {

    public static void main(String[] args) {

        Runnable cliente1 = () -> atendimento("Cliente 1");
        Runnable cliente2 = () -> atendimento("Cliente 2");

        new Thread(cliente1).start();
        new Thread(cliente2).start();
    }

    private static void atendimento(String cliente) {
        System.out.println("Atendendo " + cliente);
        dormir();
        System.out.println("Finalizado atendimento de " + cliente);
    }

    private static void dormir() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
