package com.hilos;

public class Hilo2 implements Runnable{
    private String mensaje = "me presento";

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        String holaHilos= String.format("Hola, soy %s del segundo hilo %s\n", threadName, mensaje);
        System.out.print(holaHilos);
    }

    public void CambiarMensaje(String mensaje ){
        this.mensaje = mensaje;
    }
}
