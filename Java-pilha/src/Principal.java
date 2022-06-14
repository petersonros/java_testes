
public class Principal {

    public static void main(String[] args) {
        System.out.println("primeiro passo");
        m1();
        System.out.println("ultimo passo");
    }

    public static void m1() {
        System.out.println("segundo passo");
        m2();
        System.out.println("sexto passo");
    }

    public static void m2() {
        System.out.println("terceiro passo");
        System.out.println("quarto passo");
       m3();
    }
    
    public static void m3() {
    	System.out.println("quinto passo");
    }
}
