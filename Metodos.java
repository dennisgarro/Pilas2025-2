import java.util.Scanner;
import java.util.Stack;

public class Metodos {
    Scanner sc = new Scanner(System.in);

    public Stack<ObjPila> Llenar_Pila() {
        Stack<ObjPila> p = new Stack<>();
        boolean bandera = true;
        int opt = 0;
        while (bandera) {
            ObjPila o = new ObjPila();
            System.out.println("Ingrese el Nombre");
            o.setNombre(sc.next());
            System.out.println("Ingrese el apellido");
            o.setApellido(sc.next());
            System.out.println("Ingrese la dirección");
            o.setDireccion(sc.next());
            System.out.println("Ingrese el Salario");
            o.setSalario(sc.nextDouble());
            p.push(o);

            System.out.println("Desea ingresar mas registros 1: si, 2: no");
            while (!sc.hasNextInt()) {
                System.out.println("Por favor Ingrese un digito numerico");
            }
            opt = sc.nextInt();
            sc.nextLine();
            if (opt == 2) {
                bandera = false;
            }

        }
        return p;
    }

    public void Mostrar_Pila(Stack<ObjPila> p) {
        for (ObjPila i : p) {
            System.out.println("Nombre: " + i.getNombre());
            System.out.println("Apellido:" + i.getApellido());
            System.out.println("Dirección: " + i.getDireccion());
            System.out.println("Salario: " + i.getSalario());
            System.out.println();
        }
    }

    public void Mandar() {
        Metodos m = new Metodos();
        Stack<ObjPila> p = m.Llenar_Pila();
        m.Mostrar_Pila(p);
        p = m.Calculardescuento(p);
        m.Mostrar_Pila(p);
    }

    public Stack<ObjPila> Calculardescuento(Stack<ObjPila> p) {
        for (ObjPila o : p) {
            if (o.getSalario() > 1400000) {
                o.setSalario(o.getSalario() - (o.getSalario() * 0.05));
            }
        }
        return p;
    }
}
