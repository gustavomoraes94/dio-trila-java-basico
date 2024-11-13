public class Operadores {
    public static void main(String[] args) {
        System.out.println(" ");


        String nameA = "Gustavo";
        String nameB = new String("Gustavo");

        System.out.println(nameA.equals(nameB));

       int numA,numB;

       numA= 1;
       numB= 2;

       boolean simNao = numA == numB;

        if(numA == 1 && numB ==4){
            System.out.println("A nossa condição é verdadeira");
        }else
            System.out.println("A nossa condição é falsa");


       System.out.println("numA é igual a numB? " + simNao);
       
       simNao = numA != numB;

       System.out.println("numA é diferte a numB? " + simNao);
       
       simNao = numA > numB;

       System.out.println("numA é maior que numB? " + simNao);

    }
}
