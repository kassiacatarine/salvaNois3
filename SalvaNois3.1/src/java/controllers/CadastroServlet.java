/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.*;

/**
 *
 * @author César
 */
@WebServlet(urlPatterns = {"/CadastroServlet"}, name="CadastroServlet")
public class CadastroServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nome = request.getParameter("nome");
        String login = request.getParameter("login");
        String senha = request.getParameter("senha");
        String email = request.getParameter("email");
        String endereco = request.getParameter("endereco");
        String admin =request.getParameter("admin");
        
        Boolean isAdmin = false;
        if(admin.equals("true")){
            isAdmin = true;
        }
        Usuario usu = new Usuario(login,senha,email,endereco,nome,isAdmin);
        UsuarioDAO usuDao = new UsuarioDAO();
        

        if(usuDao.cadastrar(usu)){
            response.setContentType("text/plain");
            response.setCharacterEncoding("UTF-8");
            response.getWriter().write("Usuario cadastrado");
        }else{
            response.setContentType("text/plain");
            response.setCharacterEncoding("UTF-8");
            response.getWriter().write("Não usuario cadastrado");
        }        
    }
}
