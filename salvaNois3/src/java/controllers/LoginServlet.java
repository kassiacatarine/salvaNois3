/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Usuario;
import models.UsuarioDAO;

/**
 *
 * @author kassia
 */
@WebServlet(urlPatterns = {"/LoginServlet"}, name="LoginServlet")
public class LoginServlet extends HttpServlet {
        
    UsuarioDAO dao = null;
     
    public void init(ServletConfig config)throws ServletException{
        dao = new UsuarioDAO();
    }
     
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String login = request.getParameter("login");
        String senha = request.getParameter("senha");
        Usuario usuario = dao.login(login, senha);
        
<<<<<<< HEAD
        
=======
        System.out.println("Login: " + login + " Senha: " + senha);
        
        if(dao.encontraUsuarioLoginEsenha(login, senha)){
            request.getSession().setAttribute("logado", new Boolean(true));
            request.getSession().setAttribute("usuario", usuario);
            System.out.println("Deu certo");
        }else{
            response.setContentType("text/plain");
            response.setCharacterEncoding("UTF-8");
            response.getWriter().write("Login/Senha Incorretos.");
        }   
>>>>>>> (Cuidado) Merda?
    }
}