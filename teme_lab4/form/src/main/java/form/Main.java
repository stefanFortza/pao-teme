package form;

// g. Adăugați clasei Triangle metoda printTriangleDimensions() și clasei Circle metoda printCircleDimensions(). Implementarea metodelor constă în afișarea bazei si inaltimii, respectiv razei.
// Parcurgeți vectorul de la exercițiul anterior și, folosind downcasting la clasa corespunzătoare, apelați metodele specifice fiecărei clase (printTriangleDimensions pentru Triangle și printCircleDimensions pentru Circle).
// Pentru a stabili tipul obiectului curent folosiți operatorul instanceof.

// h.Adaugati o implementare la programul anterior astfel încât să nu mai folositi operatorul"instanceof".

public class Main {
    public static void main(String[] args) {
        Form[] forms = new Form[5];
        forms[0] = new Circle("red", 5);
        forms[1] = new Circle("blue", 10);
        forms[2] = new Triangle("green", 3, 4);
        forms[3] = new Triangle("yellow", 6, 8);
        forms[4] = new Triangle("purple", 9, 12);
        for (Form form : forms) {
            System.out.println(form.toString());
        }

        for (Form form : forms) {
            if (form instanceof Circle) {
                System.out.println("Dimensiunile cercului:");
                ((Circle) form).printCircleDimensions();
            } else if (form instanceof Triangle) {
                System.out.println("Dimensiunile triunghiului:");
                ((Triangle) form).printTriangleDimensions();
            }
        }

        for (Form form : forms) {
            if (form.getClass() == Circle.class) {
                System.out.println("Dimensiunile cercului:");
                ((Circle) form).printCircleDimensions();
            } else if (form.getClass() == Triangle.class) {
                System.out.println("Dimensiunile triunghiului:");
                ((Triangle) form).printTriangleDimensions();
            }
        }

    }
}