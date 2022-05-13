public abstract class Brownie implements Comparable<Brownie> {

    String nome;
    double preco;


    @Override
    public int compareTo(Brownie o) {
        return Double.compare(this.preco,o.preco);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}