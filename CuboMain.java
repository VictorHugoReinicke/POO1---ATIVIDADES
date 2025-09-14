public class CuboMain {
    public static void main(String[] args) {
        
        Cubo c1 = new Cubo(4, 2, 1); // completo
        Cubo c2 = new Cubo();        // vazio + setters
        c2.setLado(5);
        c2.setRendimento(3);
        c2.setTipo(2);

        Cubo c3 = new Cubo(3);       // só tipo

        System.out.println("=== C1 ===");
        System.out.println(c1);
        
        System.out.println("\n=== C2 ===");
        System.out.println(c2);

        System.out.println("\n=== C3 ===");
        System.out.println(c3);
    }
}
