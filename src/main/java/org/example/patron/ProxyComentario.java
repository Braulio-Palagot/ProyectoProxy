package org.example.patron;

public class ProxyComentario implements IComentario {
    private Comentario comentario;
    private Usuario usuario;

    public ProxyComentario(String comentario, Usuario usuario) {
        this.comentario = new Comentario(comentario, usuario);
        this.usuario = usuario;
    }

    @Override
    public void insertComentario() {
        if (this.usuario.estaLogueado()) {
            this.comentario.insertComentario();
        } else {
            System.out.println("El usuario no esta logueado");
        }
    }
}