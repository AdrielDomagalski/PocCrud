package Negocio;

import java.util.Date;

public class rent
{
    Date dataEntrega;
    Date dataDevolucao;
    Date dataPedido;

    public Date getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(Date dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public Date getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(Date dataPedido) {
        this.dataPedido = dataPedido;
    }

    public void calculateRent(double numeroDias)
    {
        double valueRent = 5;

        valueRent = valueRent * numeroDias;
    }
}
