package Fatura;

public class Fatura {
    private int quantidade;
    private float valor;
    private String codigo;
    private String descricao;

    public Fatura(int quantidade, float valor, String codigo, String descricao) {
        this.setQuantidade(quantidade);
        this.setValor(valor);
        this.setCodigo(codigo);
        this.setDescricao(descricao);
    }

    public float calculaValorTotal(){
        int qt = this.getQuantidade();
        float preco = this.getValor();
        return qt * preco;
    }

    public void imprime(){
        System.out.println("CODIGO: " + this.getCodigo());
        System.out.println("DESCRICAO: " + this.getDescricao());
        System.out.println("TOTAL: " + this.calculaValorTotal());
    }

    private void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    private String getCodigo() {
        return this.codigo;
    }

    private void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    private String getDescricao() {
        return this.descricao;
    }

    private void setValor(float valor) {
        this.valor = valor;
    }
    private float getValor() {
        return this.valor;
    }

    private void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    private int getQuantidade() {
        return this.quantidade;
    }
}
