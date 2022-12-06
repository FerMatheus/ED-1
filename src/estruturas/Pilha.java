package estruturas;

public class Pilha {
    private int top;
    private Object[] stack;

    public Pilha(int length) {
        top = -1;
        stack = new Object[length];
    }

    public Boolean isFull() {
        return stack.length - 1 == top;
    }

    public Boolean isEmpty() {
        return top == -1;
    }

    public void showTop() {
        if (!isEmpty()) {
            System.out.println("O top dessa pilha é: " + stack[top]);
        } else {
            System.out.println("Pilha vazia!");
        }
    }

    public void push(Object obj) {
        if (!isFull()) {
            stack[++top] = obj;
        } else {
            System.out.println("Pilha cheia!");
        }
    }

    public Object pop() {
        if (!isEmpty()) {
            var aux = stack[top];
            top--;
            return aux;
        }
        return null;
    }

    public boolean search(Object obj) {
        if (!isEmpty()) {
            for (int i = top; i > -1; i--) {
                if (stack[i] == obj) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public void showStack() {
        if (!isEmpty()) {
            for (int i = top; i > -1; i--) {
                System.out.println(stack[i]);
            }
            System.out.println();
        } else {
            System.out.println("Pilha vazia!");
            System.out.println();
        }
    }
}
