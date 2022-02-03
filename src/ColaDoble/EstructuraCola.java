package ColaDoble;

public class EstructuraCola {

    public static void main(String[] args){
        QueueDouble c = new QueueDouble();
        String s1 = "1";
        String s2 = "2";
        String s3 = "3";

        System.out.println(c.front().toString());
        c.Enqueue(s1);
        System.out.println("Añadido "+c.front().toString());
        c.Enqueue(s2);
        System.out.println("Añadido "+c.front().toString());
        c.Enqueue(s3);
        System.out.println("Añadido "+c.front().toString());
        c.Dequeue();
        System.out.println("He borrado 1 número");
        if(c.front() != null){
            System.out.println(c.front().toString());
        }

    }
}
