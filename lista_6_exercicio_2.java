public class Main {
    public void main(String[] args) {
        FormaGeometrica quadrado = new Quadrado();
        double areaQuadrado = quadrado.calcularArea(4, 4);
        System.out.println("Área do quadrado: " + areaQuadrado);

        FormaGeometrica triangulo = new Triangulo();
        double areaTriangulo = triangulo.calcularArea(4, 2);
        System.out.println("Área do triângulo: " + areaTriangulo);
    }
    interface FormaGeometrica {
        double calcularArea(double base, double altura);
    }

    class Quadrado implements FormaGeometrica {
        @Override
        public double calcularArea(double base, double altura) {
            return base * altura;
        }
    }

    class Triangulo implements FormaGeometrica {
        @Override
        public double calcularArea(double base, double altura) {
            return (base * altura) / 2;
        }
    }
}
