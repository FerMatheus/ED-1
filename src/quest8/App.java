package quest8;

public class App {
    public static void main(String[] args) {
        Fila fila = new Fila(10);
        for (int i = 0; i < 10; i++) {
            fila.adicionar(i);
        }
        System.out.println("Primeira olhada na fila:");
        fila.mostrarFila();
        fila.remover();
        fila.remover();
        fila.adicionar(20);
        fila.adicionar(20);
        System.out.println("Segunda olhada na fila:");
        fila.mostrarFila();
    }
}
