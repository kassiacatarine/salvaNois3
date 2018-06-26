package controllers;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Usuario;
import models.UsuarioDAO;
 

public class LoginServlet extends HttpServlet {
        
    UsuarioDAO dao = null;
     
    public void init(ServletConfig config)throws ServletException{
        dao = new UsuarioDAO();
    }
     
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String login = request.getParameter("login");
        String senha = request.getParameter("senha");
         
        Usuario usuario = dao.login(login, senha);
        System.out.println(usuario.getEmail());
        // response.getWriter().write(message);
    }
}