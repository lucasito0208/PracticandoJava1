package Pila;

public class EstructuraPila {

    public static void main(String[] args){
        Pila p = new Pila();
        String s1 = "1";
        String s2 = "2";
        String s3 = "3";

        p.Push(s1);
        String resultado = (String) p.Top();
        System.out.println(resultado);
        p.Push(s2);
        resultado = (String) p.Top();
        System.out.println(resultado);
        p.Push(s3);
        resultado = (String) p.Top();
        System.out.println(resultado);
        p.Pop();
        resultado = (String) p.Top();
        System.out.println(resultado);
        p.Pop();
        resultado = (String) p.Top();
        System.out.println(resultado);
        p.Pop();
        resultado = (String) p.Top();
        System.out.println(resultado);



    }




}
