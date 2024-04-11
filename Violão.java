package Prototype;

public class Violão implements Cloneable {
    public String caracteristicas;
    private String nome;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCaracteristicas() {
        return this.caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public Violão(String nome, String caracteristicas) {
        this.nome = nome;
        this.caracteristicas = caracteristicas;
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Caracteristicas: " + caracteristicas);

    }

    public void separador() {
        System.out.println("-------------------------------------------------------------------------");
    }

    public Violão clone() throws CloneNotSupportedException {
        return (Violão) super.clone();
    }

}