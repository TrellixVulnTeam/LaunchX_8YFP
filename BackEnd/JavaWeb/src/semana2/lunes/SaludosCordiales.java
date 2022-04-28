package semana2.lunes;

abstract class Hola {
    void saludar() {
        //¿Cómo lo hace?
        System.out.println("Hola. ¿Cómo te va?");
    }

    abstract void saludo();
}

interface Mostrar {
    // ¿Qué hace?
    // Por default es abstract
    void show();
    abstract void despide();
}

public class SaludosCordiales implements Mostrar {
    public void show() {
        System.out.println("Hola. ¿Cómo estás?, espero no del todo mal");
    }

    public static void main(String[] args) {
        SaludosCordiales saludo1 = new SaludosCordiales();
        saludo1.show();
    }

    public void despide() {
        System.out.println("Gracias, no");
    }
}
