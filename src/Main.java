import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Dada uma lista com sete notas de um Aluno (7, 8.5, 9.3, 5, 7, 0, 3.6) faça:


        //  list notas = new ArrayList(); // antes do java 5
        //  ArrayList<Double> notas = new ArrayList<>();
        /*  list <Double> notas = Array.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
            notas.add(10d);
            System.out.println(notas);
         */
        //  list <Double> notas = new ArrayList<>(Array.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        /* List<Double> notas = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
           notas.add(1d);
           notas.remove(5d);
           System.out.println(notas);
         */
        System.out.println("Crie uma lista e adicione as 7 notas: ");
        List<Double> notas =new ArrayList<>(); //Generics(jdk 5) - Diamont Operator (jdk 7)
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println(notas.toString());


         System.out.println("Exiba a posição da Nota 5: " + notas.indexOf(5d) );

         System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
         notas.add(4,8d);
         System.out.println(notas);

         System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
         notas.set(notas.indexOf(5d), 6.0);
         System.out.println(notas);

        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d));

        /*System.out.println("Exiba todas as notas na ordem em que foram informados: ");
        for (Double nota: notas) System.out.println(nota);*/

        System.out.println("Exiba a terceira nota adicionada: " + notas.get(4));
        System.out.println(notas.toString());

        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();
        double soma = 0d;

        while(iterator.hasNext()) {
            double next = iterator.next();
            soma+=next;
        }

        System.out.println("Exiba a soma dos valores: " + soma);

        System.out.println("Exiba a média das notas: " + (soma/notas.size()));

        System.out.println("Remova a nota zero: ");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("Remova a nota de posição 0: ");
        notas.remove(0);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            double next = iterator1.next();
            if(next < 7) iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("Apague a lista ");
        notas.clear();
        System.out.println(notas);

        System.out.println("Confira se a lista esta vazia: " + notas.isEmpty());



    }

}