package br.com.jdev.threads.ex05_processamento_pedidos;

public class ProcessamentoPedidos {

    public static void main(String[] args) {

        for (int pedido = 1; pedido <= 4; pedido++) {
            int numeroPedido = pedido;

            new Thread(() -> {
                System.out.println("Processando pedido " + numeroPedido);
                dormir();
                System.out.println("Pedido " + numeroPedido + " finalizado");
            }).start();
        }
    }

    private static void dormir() {
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
