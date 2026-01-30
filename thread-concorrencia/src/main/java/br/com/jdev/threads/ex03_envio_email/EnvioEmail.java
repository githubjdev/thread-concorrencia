package br.com.jdev.threads.ex03_envio_email;

public class EnvioEmail {

    public static void main(String[] args) {

        for (int i = 1; i <= 3; i++) {
            int email = i;

            new Thread(() -> {
                System.out.println("Enviando e-mail " + email);
                dormir();
                System.out.println("E-mail " + email + " enviado");
            }).start();
        }
    }

    private static void dormir() {
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
