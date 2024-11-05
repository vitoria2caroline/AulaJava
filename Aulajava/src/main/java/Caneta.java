public class Caneta {

    String modelo;
    String cor;
    float ponta; /* número quebrado */
    int carga; /* numero inteiro */
    boolean tampada;

    void rabiscar() {
        if (tampada == true) {
            System.out.println("erro!! A caneta esta tampada");

        }else {
            System.out.println("pode rabiscar À vontade");
        }
    }
        void tampar() {
            tampada =false;
        }

        void destampar() {
            tampada = false;
        }

        void estado() {
            System.out.println("esta caneta é do modelo" + modelo);
            System.out.println("esta caneta é a cor " + cor);
            System.out.println("esta caneta tem a ponta" + ponta);
            System.out.println("esta caneta esta com a carga em" + carga + "%");
            System.out.println("esta caneta esta tampada" + tampada);
        }

    }

