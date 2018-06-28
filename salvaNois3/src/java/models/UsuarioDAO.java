/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import banco.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author kassia
 */
public class UsuarioDAO {
    
    Connection con;

    public UsuarioDAO() {
        this.con = ConnectionFactory.getConnection();
    }
    
    public boolean checkMatchFields(String type, String value) {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM usuarios WHERE " + type + " = " + value;
        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            if(rs.next()){
                return true;
            }
        } catch(SQLException ex) {
            System.err.println("Erro ao Encontrar "+ type +" igual a "+ value + ": "+ ex);
        }
        return false;
    }
    
    public boolean checkIsAdmin(int id) {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql = "SELECT isAdmin FROM usuarios WHERE id = ?";
        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, id);
            rs = stmt.executeQuery();
            if(rs.next()){
                return rs.getBoolean(1);
            }
        } catch(SQLException ex) {
            System.err.println("Erro ao encontrar usuario: "+ ex);
        }
        return false;
    }
    
    public boolean cadastrar (Usuario usuario){
        PreparedStatement stmt = null;
        try{
            if(!checkMatchFields("login", usuario.getLogin()) && !checkMatchFields("email", usuario.getEmail())){
                stmt = con.prepareStatement("INSERT INTO usuarios (login, senha, email, endereco, nome) values( ?, ?, ?, ?, ?)");
                stmt.setString(1, usuario.getLogin());
                stmt.setString(2, usuario.getSenha());
                stmt.setString(3, usuario.getEmail());
                stmt.setString(4, usuario.getEndereco());
                stmt.setString(5, usuario.getNome());
                stmt.executeUpdate();
                return true;
            }
        } catch (SQLException ex) {
            System.err.println("Erro ao Cadastrar: "+ ex);
        }finally{
<<<<<<< HEAD
            ConnectionFactory.closeConnection(con, stmt);
=======
          //  ConnectionFactory.closeConnection(con, stmt);
>>>>>>> (Cuidado) Merda?
        }
        return false;
    }
    
    public Usuario login (String login, String senha){
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Usuario usuario = new Usuario();
        try{
            stmt = con.prepareStatement("SELECT id, nome, login, senha, email, endereco FROM usuarios WHERE login = ? and senha = ?");
            stmt.setString(1, login);
            stmt.setString(2, senha);
            rs = stmt.executeQuery();
            while(rs.next()){
                usuario.setId(rs.getInt(1));
                usuario.setNome(rs.getString(2));
                usuario.setLogin(rs.getString(3));
                usuario.setSenha(rs.getString(4));
                usuario.setEmail(rs.getString(5));
                usuario.setEndereco(rs.getString(6));
                return usuario;
            }
            return null;
        }catch(SQLException ex){
            System.err.println("Erro ao fazer login: "+ ex);
        }finally{
<<<<<<< HEAD
            ConnectionFactory.closeConnection(con, stmt, rs);
=======
            //ConnectionFactory.closeConnection(con, stmt, rs);
>>>>>>> (Cuidado) Merda?
        }
        return null;
    }
    
    public Usuario encontraUsuario(int id) {
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM usuarios id = ?";
        Usuario usuario = new Usuario();
        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, id);
            rs = stmt.executeQuery();
            if(rs.next()){
                usuario.setId(rs.getInt(1));
                usuario.setNome(rs.getString(2));
                usuario.setLogin(rs.getString(3));
                usuario.setSenha(rs.getString(4));
                usuario.setEmail(rs.getString(5));
                usuario.setEndereco(rs.getString(6));
            }
            return usuario;
        } catch (SQLException ex) {
            System.err.println("Erro ao pesquisar empresas: "+ ex);
            return null;
        } finally{
<<<<<<< HEAD
            ConnectionFactory.closeConnection(con, stmt, rs);
=======
            //ConnectionFactory.closeConnection(con, stmt, rs);
>>>>>>> (Cuidado) Merda?
        }
    }
    public boolean encontraUsuarioLoginEsenha(String Login,String Senha) {
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql = "SELECT login,senha,id FROM usuarios where login = ? and senha = ?";
   
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, Login);
            stmt.setString(2, Senha);
            rs = stmt.executeQuery();
            while(rs.next()){
                if(rs.getString("login").equals(Login) && rs.getString("senha").equals(Senha)){
                    return true;
                }
            }
            
        } catch (SQLException ex) {
            System.err.println("Erro ao pesquisar Login: "+ ex);
            return false;
        } 
        return false;
    }
}