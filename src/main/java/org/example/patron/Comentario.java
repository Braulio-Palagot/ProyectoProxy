package org.example.patron;

public class Comentario implements IComentario {
    private String comentario;
    private Usuario usuario;

    public Comentario(String comentario, Usuario usuario) {
        this.comentario = comentario;
        this.usuario = usuario;
    }

    @Override
    public void insertComentario() {
        System.out.println("Usuario: " + this.usuario.getNombre() + " ha comentado: " + this.comentario);
    }
}
