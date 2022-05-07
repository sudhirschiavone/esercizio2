public class Contatore implements Runnable {
    int numero;
    String nome;
    public Contatore(int n,String no){
        numero=n;
        nome=no;
    }

    public void run(){
        for(int i=0; i<numero; i++){
            System.out.println(Thread.currentThread().getName()+" cont :"+i);
        }
    }
}
