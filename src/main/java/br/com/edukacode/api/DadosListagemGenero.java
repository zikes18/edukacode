package br.com.edukacode.api;

public record DadosListagemGenero(String nome) {
    public DadosListagemGenero(Genero genero) {
        this(genero.getNome());
    }
}
