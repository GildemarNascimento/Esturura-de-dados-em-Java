package com.projeto.atribuicaocomreferencia;

public class Variavel {
    public static void main(String[] args) {
        //intB faz um cópia do valor contido em intA.
        int intA = 1;
        int intB = intA;

        System.out.println("intA= " + intA + " intB= " + intB);
        intA = 2;
        System.out.println("intA= " + intA + " intB= " + intB);

        //Objeto aponta para referencia, os dois objeto que referencia sao alterado.
        Objeto objA = new Objeto(1);
        Objeto objB = objA;
        System.out.println("objA= " + objA + " objB= " + objB);
        objA.setNum(2);
        System.out.println("objA= " + objA + " objB= " + objB);

    }
}
