package org.example;

import org.example.patron.Comentario;
import org.example.patron.IComentario;
import org.example.patron.ProxyComentario;
import org.example.patron.Usuario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Usuario usuario;
        IComentario objComentario;
        String nombre;
        String contrasenha;
        String comentario;
        // Declarar el scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al sistema de Comentarios.\n");
        System.out.println("Ingresa tu nombre de usuario: ");
        // Leer nombre de usuario
        nombre = scanner.nextLine();
        System.out.println("Ingresa tu contraseña: ");
        // Leer contraseña
        contrasenha = scanner.nextLine();
        // Crear usuario
        usuario = new Usuario(nombre);
        // Loguear usuario
        if (contrasenha.equals("123450")) {
            usuario.loguear();
        }
        System.out.println("Ingresa tu comentario: ");
        // Leer comentario
        comentario = scanner.nextLine();
        // Crear comentario
        objComentario = new ProxyComentario(comentario, usuario);
        // Insertar comentario
        objComentario.insertComentario();
    }
}