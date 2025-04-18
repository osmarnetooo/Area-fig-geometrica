import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) throws Exception {
        int option;
        GeometricForm geometricForm;
        OUTER:
        while (true) {
            System.out.println("Escolha a forma geometrica para calcular a area.");
            System.out.println("1 - Quadrado");
            System.out.println("2 - Retângulo");
            System.out.println("3 - Círculo");
            System.out.println("4 - Sair do programa");
            option = scanner.nextInt();
            switch (option) {
                case 1 -> geometricForm = createSquare();
                case 2 -> geometricForm = createRectangle();
                case 3 -> geometricForm = createCircle();
                case 4 -> {
                    System.out.println("Programa finalizado!");
                    break OUTER;
                }
                default -> {
                    System.out.println("Opção Inválida");
                    continue;
                }
            }
            System.out.println("O resultado do calculo da área foi de "+ geometricForm.getArea());
        }
    }
    
    private static GeometricForm createSquare(){
        System.out.println("Informe o tamanho dos lados: ");
        var side = scanner.nextDouble();
        return new Square(side);
    }

    private static GeometricForm createRectangle(){
        System.out.println("Informe a altura do retangulo: ");
        var height = scanner.nextDouble();
        System.out.println("Informe a base do retangulo: ");
        var base = scanner.nextDouble();
        return new Rectangle(height, base);
    }

    private static GeometricForm createCircle(){
        System.out.println("Informe o raio: ");
        var radius = scanner.nextDouble();
        return new Circle(radius);
    }
    
}
