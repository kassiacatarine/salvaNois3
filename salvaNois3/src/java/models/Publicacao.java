/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author César
 */
public class Publicacao {
    private int id;
    private String titulo;
    private String imagem;
    private String video;
    private String texto;
    private Usuario usuario;

    public Publicacao(int id,String titulo, String imagem, String video, String texto, Usuario usuario) {
        this.id = id;
        this.titulo = titulo;
        this.imagem = imagem;
        this.video = video;
        this.texto = texto;
        this.usuario = usuario;
    }

    public Publicacao(String titulo,String imagem, String video, String texto, Usuario usuario) {
        this.titulo = titulo;
        this.imagem = imagem;
        this.video = video;
        this.texto = texto;
        this.usuario = usuario;
    }

    public Publicacao() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }


    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
}
