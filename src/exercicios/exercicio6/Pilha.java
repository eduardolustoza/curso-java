package exercicios.exercicio6;

public class Pilha<T> {
	private T[] elementos;
    private int topo;

    // Construtor que recebe o tamanho do array elementos como parâmetro
    @SuppressWarnings("unchecked")
	public Pilha(int capacidade) {
        elementos = (T[]) new Object[capacidade];
        topo = -1;
    }

    // Recebe um elemento e adiciona na pilha
    public void push(T elemento) {
        if (isFull()) {
            throw new IllegalStateException("A pilha está cheia.");
        }
        elementos[++topo] = elemento;
    }

    // Retira um elemento do topo da pilha
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("A pilha está vazia.");
        }
        T elemento = elementos[topo];
        elementos[topo--] = null;
        return elemento;
    }

    // Retorna o elemento do topo sem remover do array
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("A pilha está vazia.");
        }
        return elementos[topo];
    }

    // Método que checa se a pilha está vazia
    public boolean isEmpty() {
        return topo == -1;
    }

    // Método que checa se a pilha está cheia
    public boolean isFull() {
        return topo == elementos.length - 1;
    }

    // Retorna quantos elementos estão na pilha
    public int size() {
        return topo + 1;
    }

    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<>(5);

        pilha.push(10);
        pilha.push(20);
        pilha.push(30);

        System.out.println("Elemento no topo: " + pilha.peek());

        System.out.println("Elementos na pilha: " + pilha.size());

        while (!pilha.isEmpty()) {
            System.out.println("Removendo elemento: " + pilha.pop());
        }
    }
}
