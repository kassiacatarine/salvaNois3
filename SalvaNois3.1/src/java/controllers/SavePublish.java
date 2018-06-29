/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Blob;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import models.*;

/**
 *
 * @author César
 */
public class SavePublish extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String titulo = request.getParameter("title");
        String video = request.getParameter("video");
        String image = request.getParameter("image");
        String comments = request.getParameter("comments");
        HttpSession session = request.getSession();
        Usuario usuario = new Usuario();
        usuario = (Usuario) session.getAttribute("usuario");
        Publicacao pub = new Publicacao(titulo,image,video,comments,usuario);
        PublicacaoDAO pubDao = new PublicacaoDAO();        
        System.out.println("Imagem"+ image);
        
        
        if(session.getAttribute("logado") != null){
            System.out.println("Logado: "+session.getAttribute("logado") + " Usuario: " + usuario.getNome()+"Id: " +usuario.getId());
            try {
                pubDao.cadastrar(pub);
                System.out.println("Entrei cadastro");
            } catch (Exception e) {
                System.out.println("Erro ao cadastrar pub"+ e);
            }
        }else{
            response.setContentType("text/plain");
            response.setCharacterEncoding("UTF-8");
            response.getWriter().write("Não cadastrado");
        }
        
    }
}
