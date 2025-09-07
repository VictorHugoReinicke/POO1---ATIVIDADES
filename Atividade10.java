
public class Atividade10 {

	private String tipoCombustivel;
    private double valorLitro;
    private double quantidadeCombustivel;

    // Métodos "setter" para definir os atributos
    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public void setValorLitro(double valorLitro) {
        if (valorLitro > 0) {
            this.valorLitro = valorLitro;
        } else {
            System.out.println("Valor do litro inválido. Não pode ser zero ou negativo.");
        }
    }

    public void setQuantidadeCombustivel(double quantidadeCombustivel) {
        if (quantidadeCombustivel >= 0) {
            this.quantidadeCombustivel = quantidadeCombustivel;
        } else {
            System.out.println("Quantidade de combustível inválida. Não pode ser negativa.");
        }
    }

    // Métodos "getter" para obter os atributos
    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public double getValorLitro() {
        return valorLitro;
    }

    public double getQuantidadeCombustivel() {
        return quantidadeCombustivel;
    }

    // Métodos de Abastecimento e Alteração
    public void abastecerPorValor(double valor) {
        if (valor > 0 && valorLitro > 0 && quantidadeCombustivel > 0) {
            double litrosAbastecidos = valor / valorLitro;
            if (litrosAbastecidos <= quantidadeCombustivel) {
                quantidadeCombustivel -= litrosAbastecidos;
                System.out.printf("Foram abastecidos %.2f litros.\n", litrosAbastecidos);
            } else {
                System.out.println("Quantidade de combustível na bomba insuficiente.");
            }
        } else {
            System.out.println("Valor para abastecimento inválido ou bomba vazia.");
        }
    }

    public void abastecerPorLitro(double litros) {
        if (litros > 0 && litros <= quantidadeCombustivel) {
            double valorPago = litros * valorLitro;
            quantidadeCombustivel -= litros;
            System.out.printf("Valor a ser pago: R$ %.2f\n", valorPago);
        } else {
            System.out.println("Quantidade de litros inválida ou insuficiente.");
        }
    }

    public void alterarValor(double novoValor) {
        if (novoValor > 0) {
            this.valorLitro = novoValor;
            System.out.println("Valor do litro alterado para: R$ " + novoValor);
        } else {
            System.out.println("Valor inválido. Não foi possível alterar.");
        }
    }

    public void alterarCombustivel(String novoCombustivel) {
        this.tipoCombustivel = novoCombustivel;
        System.out.println("Tipo de combustível alterado para: " + novoCombustivel);
    }

    public void alterarQuantidadeCombustivel(double novaQuantidade) {
        if (novaQuantidade >= 0) {
            this.quantidadeCombustivel = novaQuantidade;
            System.out.println("Quantidade de combustível na bomba alterada para: " + novaQuantidade + " litros");
        } else {
            System.out.println("Quantidade inválida. Não foi possível alterar.");
        }
    }
}

