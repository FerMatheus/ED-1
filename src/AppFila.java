import estruturas.Fila;

public class AppFila {
    public static void main(String[] args) {
        Fila fila = new Fila(10);

        fila.showBottom();

        for (int i = 0; i < 10; i++) {
            fila.inQueue(i);
        }
        fila.showQueue();

        if (fila.search(6)) {
            System.out.println("Objeto se encontra na pilha!");
        } else {
            System.out.println("Objeto não se encontra na pilha!");
        }
        fila.deQueue();

        fila.showQueue();
    }
}
