import java.util.ArrayList;

public class Divisao implements Operador{

    @Override
    public double calcular(ArrayList<Double> lista) {
        double result = lista.get(0);

        for (int i = 1; i < lista.size(); i++) {
            result /= lista.get(i);
        }

        return result;
    }
}
