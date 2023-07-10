package exercicios.exercicio3;

public class ExercicioPassagemParametros2 {
	public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        System.out.println("Antes da chamada do método: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        modificarArray(array);
        System.out.println("\nApós a chamada do método: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void modificarArray(int[] arr) {
        arr = new int[]{10, 20, 30, 40, 50};
        System.out.println("\nDentro do método: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
//    	Antes da chamada do método: 
//    	1 2 3 4 5 
//    	Dentro do método: 
//    	10 20 30 40 50 
//    	Após a chamada do método: 
//    	1 2 3 4 5 
    
}
