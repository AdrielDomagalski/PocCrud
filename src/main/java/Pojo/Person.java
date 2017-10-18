package Pojo;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Person {
    protected String nome;
    protected String dataNascimento;
    protected String cpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) throws ParseException {
        this.dataNascimento = dataNascimento;
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date dt = df.parse(dataNascimento);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
