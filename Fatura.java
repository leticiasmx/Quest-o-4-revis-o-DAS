public class Fatura {
    private String numero;
    private String descricao;
    private int quantidade;
    private double precoPorItem;

    public Fatura(String numero, String descricao, int quantidade, double precoPorItem) {
        this.numero = numero;
        this.descricao = descricao;
        setQuantidade(quantidade);
        setPrecoPorItem(precoPorItem);
    }

    // Getters
    public String getNumero() { return numero; }
    public String getDescricao() { return descricao; }
    public int getQuantidade() { return quantidade; }
    public double getPrecoPorItem() { return precoPorItem; }

    // Setters com validação
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade < 0 ? 0 : quantidade;
    }

    public void setPrecoPorItem(double precoPorItem) {
        this.precoPorItem = precoPorItem < 0 ? 0.0 : precoPorItem;
    }

    public double getTotalFatura() {
        return quantidade * precoPorItem;
    }
}