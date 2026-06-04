package questão1;

public class pessoa {
    private String nome;
    private String pais;
    private int idade;

    public String getNome() {
        return nome;
    }
    public void setNome(String umNome) {
        nome = umNome;
        System.out.println(nome);
    }
    public String getPais() {
        return pais;
    }
    public void setPais(String umPais) {
        pais = umPais;
        System.out.println(pais);
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int umaIdade){
        idade = umaIdade;
        System.out.println(idade);
    }
}