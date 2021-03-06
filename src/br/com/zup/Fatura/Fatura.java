package br.com.zup.Fatura;

public class Fatura {
    private Consumidor consumidor;
    private double valor;
    private String dataDeVencimento;

    public Fatura(Consumidor consumidor, double valor, String dataDeVencimento) {
        this.consumidor = consumidor;
        this.valor = valor;
        this.dataDeVencimento = dataDeVencimento;
    }

    public Consumidor getConsumidor() {
        return consumidor;
    }

    public void setConsumidor(Consumidor consumidor) {
        this.consumidor = consumidor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDataDeVencimento() {
        return dataDeVencimento;
    }

    public void setDataDeVencimento(String dataDeVencimento) {
        this.dataDeVencimento = dataDeVencimento;
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("Extrato da Fatura: ");
        retorno.append("\n Consumidor: " + consumidor);
        retorno.append("\n Valor da Fatura: R$ "  + valor);
        retorno.append("\n Data de vencimento: " + dataDeVencimento);
        return retorno.toString();
    }
}
