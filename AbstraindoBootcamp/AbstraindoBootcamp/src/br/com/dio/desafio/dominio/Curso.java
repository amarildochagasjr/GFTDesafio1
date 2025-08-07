package br.com.dio.desafio.dominio;

public non-sealed class Curso extends Conteudo {
    private int cargaHoraria;


    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String toString() {
        return super.toString() + "cargaHoraria= "+ cargaHoraria + "h}";
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }
}
