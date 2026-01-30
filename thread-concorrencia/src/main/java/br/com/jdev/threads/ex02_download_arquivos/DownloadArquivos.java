package br.com.jdev.threads.ex02_download_arquivos;

public class DownloadArquivos {

    public static void main(String[] args) {

        Runnable download = () -> {
            String nome = Thread.currentThread().getName();
            System.out.println("Iniciando download: " + nome);
            dormir();
            System.out.println("Finalizando download: " + nome);
        };

        new Thread(download, "Arquivo-1.zip").start();
        new Thread(download, "Arquivo-2.zip").start();
        new Thread(download, "Arquivo-3.zip").start();
    }

    private static void dormir() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
