package quest8;

public class Fila {
    private int top, bottom, qtde;
    private Object[] fila;

    public Fila(int tamanho) {
        fila = new Object[tamanho+1];
        top = 0;
        bottom = 0;
        qtde = 0;
    }
    public Boolean isEmpyt(){
        return qtde == 0;
    }
    public Boolean isFull(){
        return qtde == fila.length-1;
    }
    public void adicionar(Object item){
        if(!isFull()){
            fila[bottom] = item;
            bottom = (bottom+1) % fila.length;
            qtde++; 
        }
    }
    public Object remover(){
        if (!isEmpyt()) {
            var item = fila[top];
            top = (top+1) % fila.length;
            qtde--;
            return item;
        }
        return null;
    }
    public void mostrarFila(){
        if (!isEmpyt()) {
            for (int i = top; i != bottom; i = (i+1) % fila.length) {
                System.out.println(fila[i].toString());
            }
        }else{
            System.out.println("Fila vazia!");
        }
        System.out.println();
    }
}
