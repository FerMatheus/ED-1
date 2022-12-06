import estruturas.FilaCircular;

public class AppFilaCircular {
    public static void main(String[] args) {
        FilaCircular filaCircular = new FilaCircular(10);
        System.out.println();
        filaCircular.showQueue();
        for (int i = 0; i < 10; i++) {
            filaCircular.inQueue(i);
        }
        filaCircular.showQueue();

        System.out.println(filaCircular.search(5));

        filaCircular.deQueue();

        filaCircular.showBottom();
        filaCircular.showTop();

        filaCircular.showQueue();
    }
}
