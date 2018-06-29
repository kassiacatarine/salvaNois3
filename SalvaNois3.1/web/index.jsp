<%-- 
    Document   : index
    Created on : 25/06/2018, 21:06:00
    Author     : kassia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Login</title>
        <meta charset="UTF-8">
        <!-- Compiled and minified CSS -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0-rc.2/css/materialize.min.css">
        <!--Import Google Icon Font-->
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">

        <!--Let browser know website is optimized for mobile-->
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    </head>
    <body>
        <nav class="red darken-2">
            <div class="nav-wrapper">
                <a href="#" class="brand-logo">Logo</a>
                <ul id="nav-mobile" class="right hide-on-med-and-down">
                    <li><a href="#">Home</a></li>
                </ul>
            </div>
        </nav>

        <div class="container">
            <div class="row">
                <div class="col s12 m4 offset-m4">
                    <form method="POST" id="form-login">
                        <div class="card">
                            <div class="card-content">
                                <span class="card-title">Acesso ao Sistema</span>
                                <div id="ajaxServletResponse"></div>
                                <div class="row">
                                    <div class="input-field col s12">
                                        <input id="login" name="login" type="text" class="validate require" required>
                                        <label for="login">Login</label>
                                        <span class="helper-text" data-error="Login inválido"></span>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="input-field col s12">
                                        <input id="password" name="password" type="password" class="validate require" required>
                                        <label for="password">Senha</label>
                                        <span class="helper-text" data-error="Senha inválida"></span>
                                    </div>
                                </div>
                            </div>
                            <div class="card-action">
                                <a class="waves-effect waves-teal btn-flat">Cadastro</a>
                                <button class="btn waves-effect waves-light btn-login" type="submit" id="btn-submit">Login</button>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
        
        
        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0-rc.2/js/materialize.min.js"></script>
        <script src="https://code.jquery.com/jquery-3.3.1.min.js" integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8=" crossorigin="anonymous"></script>
        <script src="js/main.js"></script>
        <script src="js/login.js"></script>
        <!-- Compiled and minified JavaScript -->
        
    </body>
</html>
