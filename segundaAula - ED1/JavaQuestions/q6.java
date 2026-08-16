public class q6 {
    public static void main(String[] args){

        // Exemplo de valores para ax² + bx + c = 0
        // Tente usar a=1, b=-5 e c=6 para ver o programa achar as raízes 2 e 3!
        double a = 1;
        double b = -5;
        double c = 6;

        double delta = calcularDelta(a, b, c);
        System.out.printf("O valor do delta é: %.2f\n", delta);
        System.out.printf("As raízes da equação são: %s\n", calcularRaizes(a, b, delta));

    }

    public static String calcularRaizes(double a, double b, double delta){
        if (delta < 0){
            return "Não existem raízes reais.";
        } else if (delta == 0){
            double raiz = -b / (2 * a);
            return "Existe uma raiz real: " + raiz;
        } else {
            double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
            return "Existem duas raízes reais: " + raiz1 + " e " + raiz2;
        }
    }

    public static double calcularDelta(double a, double b, double c){
        return b * b - 4 * a * c;
    }
}