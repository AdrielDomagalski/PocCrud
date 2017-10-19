package Pojo;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Rent
{
    private String dataEntrega;
    private String dataDevolucao;

    public String getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(String dataEntrega) throws ParseException {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date dt = df.parse(dataEntrega);
        this.dataEntrega = dt.toString();
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(String dataDevolucao) throws ParseException {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date dt = df.parse(dataDevolucao);
        this.dataDevolucao = dt.toString();
    }
}
