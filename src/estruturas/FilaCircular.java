package estruturas;

public class FilaCircular {
    private int top, bottom, qtde;
    private Object[] queue;

    public FilaCircular(int length) {
        top = 0;
        bottom = 0;
        qtde = 0;
        queue = new Object[length + 1];
    }

    public boolean isEmpty() {
        return qtde == 0;
    }

    public boolean isFull() {
        return qtde == queue.length - 1;
    }

    public boolean inQueue(Object obj) {
        if (!isFull()) {
            queue[bottom] = obj;
            bottom = (bottom + 1) % queue.length;
            qtde++;
            return true;
        }
        return false;
    }

    public Object deQueue() {
        if (!isEmpty()) {
            var aux = queue[top];
            top = (top + 1) % queue.length;
            qtde--;
            return aux;
        }
        return null;
    }

    public boolean search(Object obj) {
        if (!isEmpty()) {
            for (int i = top; i != bottom; i = (i + 1) % queue.length) {
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
            for (int i = top; i != bottom; i = (i + 1) % queue.length) {
                System.out.println(queue[i]);
            }
            System.out.println();
        } else {
            System.out.println("Fila circular se encontra vazia!");
        }
    }

    public void showTop() {
        if (!isEmpty()) {
            System.out.println("O primeiro da fila é o item " + queue[top]);
        } else {
            System.out.println("Fila vazia!");
        }
    }

    public void showBottom() {
        if (!isEmpty()) {
            System.out.println("O último da fila é o item " + queue[bottom - 1]);
        } else {
            System.out.println("Fila vazia!");
        }
    }
}
