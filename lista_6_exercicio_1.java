public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro(1, 200, 70);
        Moto moto = new Moto(2, 180, 80);

        carro.utilizarHabilidadeEspecial(); // Saída esperada: Carro fechou o adversário de trás
        moto.utilizarHabilidadeEspecial(); // Saída esperada: Moto ultrapassou o adversário à frente
    }
}
    abstract class Veiculo {
        private int id;
        private int velocidadeAtual;
        private int velocidadeMaxima;
        private int precisaoEmCurvas;
        private boolean estaComFarolLigado;

        public Veiculo() {
        }

        public Veiculo(int id, int velocidadeMaxima, int precisaoEmCurvas) {
            this.id = id;
            this.velocidadeMaxima = velocidadeMaxima;
            this.precisaoEmCurvas = precisaoEmCurvas;
        }

        public void acelerar() {
            velocidadeAtual++;
            if (velocidadeAtual > velocidadeMaxima) {
                velocidadeAtual = velocidadeMaxima;
            }
        }

        public void desacelerar() {
            velocidadeAtual--;
            if (velocidadeAtual < 0) {
                velocidadeAtual = 0;
            }
        }

        public void ligarFarol() {
            estaComFarolLigado = true;
        }

        public abstract void utilizarHabilidadeEspecial();
    }

    class Moto extends Veiculo {

        public Moto() {
        }

        public Moto(int id, int velocidadeMaxima, int precisaoEmCurvas) {
            super(id, velocidadeMaxima, precisaoEmCurvas);
        }

        @Override
        public void utilizarHabilidadeEspecial() {
            System.out.println("Moto ultrapassou o adversário à frente");
        }
    }

    class Carro extends Veiculo {

        public Carro() {
        }

        public Carro(int id, int velocidadeMaxima, int precisaoEmCurvas) {
            super(id, velocidadeMaxima, precisaoEmCurvas);
        }

        @Override
        public void utilizarHabilidadeEspecial() {
            System.out.println("Carro fechou o adversário de trás");
        }
    }
}