public class Main {
    public static void main(String[] args) {
        //Primera parte
        int res = 0;
        res = suma(56, 23, 34);
        System.out.println(res);

        //Segunda parte
        Coche miCoche = new Coche();
        miCoche.SumarPuertas();
        System.out.println(miCoche.puertas);
    }

    //Primera parte
    public static int suma(int a, int b, int c) {
        return a + b + c;
    }
}
//Segunda parte
class Coche {
    public int puertas = 4;
    public void SumarPuertas() {
        this.puertas++;
    }
}