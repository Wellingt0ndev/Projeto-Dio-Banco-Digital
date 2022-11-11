import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Cliente {

    private String nome;
    private String CPF;
    private LocalDate dataNascimento;

    public Cliente(String nome, String CPF, LocalDate dataNascimento) {
        this.nome = nome;
        this.CPF = CPF;
        this.dataNascimento = dataNascimento;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade(){
        return (int) ChronoUnit.YEARS.between(dataNascimento, LocalDate.now());
    }

}