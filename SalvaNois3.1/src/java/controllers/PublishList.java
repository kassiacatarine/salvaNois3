/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import models.*;

/**
 *
 * @author César
 */
@WebServlet(urlPatterns = {"/PublishList"}, name="PublishList")
public class PublishList extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("To na servlet");
        ArrayList<Publicacao> arrayPubAll = new ArrayList<>();
        PublicacaoDAO pubDao = new PublicacaoDAO();
        
        arrayPubAll = pubDao.pesquisarAll();
        Gson gson = new Gson();
        PrintWriter out = response.getWriter();
        
        out.print(gson.toJson(arrayPubAll));
                
    }

}
