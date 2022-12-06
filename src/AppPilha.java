import estruturas.Pilha;

public class AppPilha {
    public static void main(String[] args) {
        Pilha p = new Pilha(10);
        for (int i = 0; i < 10; i++) {
            p.push(i);
        }
        p.showStack();
        p.pop();
        p.showStack();
        if (p.search(6)) {
            System.out.println("Objeto se encontra na pilha!");
        } else {
            System.out.println("Objeto não se encontra na pilha!");
        }
    }
}
