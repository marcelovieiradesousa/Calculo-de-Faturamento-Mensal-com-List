import java.util.ArrayList;
import java.util.List;

public class FatMensal {
    private String estado;
    private Double faturamento;

    public FatMensal(String estado, Double faturamento) {
        this.estado = estado;
        this.faturamento = faturamento;
    }

    public static void main(String[] args) throws Exception {
        List<FatMensal> fatEstadual = new ArrayList<FatMensal>();

        fatEstadual.add(new FatMensal("SP", 67836.43));
        fatEstadual.add(new FatMensal("RJ", 36678.66));
        fatEstadual.add(new FatMensal("MG", 29229.88));
        fatEstadual.add(new FatMensal("ES", 27165.48));
        fatEstadual.add(new FatMensal("Outros", 19849.53));

        Double total = 0.0;
        for (FatMensal estado : fatEstadual) {
            total += estado.faturamento;
        }
        System.out.println(total);

        for (FatMensal estado : fatEstadual) {
            Double percentual = estado.faturamento / total;
            System.out.println(String.format("Faturamento de %s: %.2f", estado.estado, percentual));
        }
    }
}
