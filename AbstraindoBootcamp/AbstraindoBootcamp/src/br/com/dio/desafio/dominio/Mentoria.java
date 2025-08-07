package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public non-sealed class Mentoria extends Conteudo {
    private LocalDate data;

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return super.toString() + "data =" + data +
                '}';
    }

    @Override
    public double calcularXp() {

        return XP_PADRAO;
    }
}