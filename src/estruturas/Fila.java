package estruturas;

public class Fila {
    protected int top, bottom, qtde;
    protected Object[] queue;

    public Fila(int length) {
        top = 0;
        bottom = 0;
        qtde = 0;
        queue = new Object[length];
    }

    public boolean isEmpty() {
        return qtde == 0;
    }

    public boolean isFull() {
        return qtde == queue.length;
    }

    public void showTop() {
        if (!isEmpty()) {
            System.out.println("O primeiro da fila é o item" + queue[top]);
        } else {
            System.out.println("Fila vazia!");
        }
    }

    public void showBottom() {
        if (!isEmpty()) {
            System.out.println("O último da fila é o item" + queue[bottom]);
        } else {
            System.out.println("Fila vazia!");
        }
    }

    public boolean inQueue(Object obj) {
        if (!isFull()) {
            queue[bottom] = obj;
            bottom++;
            qtde++;
            return true;
        }
        return false;
    }

    public Object deQueue() {
        if (!isEmpty()) {
            var aux = queue[top];
            top++;
            qtde--;
            return aux;
        }
        return null;
    }

    public boolean search(Object obj) {
        if (!isEmpty()) {
            for (int i = top; i != bottom; i++) {
                if (queue[i] == obj) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public void showQueue() {
        if (!isEmpty()) {
            for (int i = top; i != bottom; i++) {
                System.out.println(queue[i]);
            }
            System.out.println();
        } else {
            System.out.println("A fila está vazia!");
            System.out.println();
        }
    }
}
