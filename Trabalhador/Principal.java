package HTML.Trabalhador;

public class Principal {
    public static void main(String args[]) {
        Trabalhador severino = new Trabalhador("sapato", 100);
        Trabalhador raimundo = new Trabalhador("bota", 100);
        Trabalhador arnaldo = new Trabalhador("camisas", 100);
        severino.start();
        raimundo.start();
        }
}
