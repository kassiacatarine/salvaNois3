<%-- 
    Document   : publish
    Created on : 27/06/2018, 22:57:16
    Author     : kassia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Publicação</title>
        <meta charset="UTF-8">
        <!-- Compiled and minified CSS -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0-rc.2/css/materialize.min.css">
        <!--Import Google Icon Font-->
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <link rel="stylesheet" href="css/style.css">
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
                <div class="col s12 m8 offset-m2">
                    <form method="POST" id="form-publish">
                        <div class="card">
                            <div class="card-content">
                                <span class="card-title">Publicação</span>
                                <div class="row">
                                    <div class="input-field col s12">
                                        <input id="title" name="titulo" type="text" class="validate require" required>
                                        <label for="titulo">Título</label>
                                        <span class="helper-text" data-error="Título inválido"></span>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="file-field input-field col s12">
                                        <div class="btn">
                                            <span>Vídeo</span>
                                            <input id="video" type="file" name="video" accept="video/*">
                                        </div>
                                        <div class="file-path-wrapper">
                                            <input id="video-name" class="file-path validate" type="text">
                                        </div>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="file-field input-field col s12">
                                        <div class="btn">
                                            <span>Imagem</span>
                                            <input id="image" type="file" name="imagem" accept="image/*">
                                        </div>
                                        <div class="file-path-wrapper">
                                            <input id="image-name" class="file-path validate" type="text">
                                        </div>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="input-field col s12">
                                        <textarea id="comments" class="materialize-textarea" maxlength="120" data-length="120"></textarea>
                                        <label for="comments">Comentários</label>
                                    </div>
                                </div>
                            </div>
                            <div class="card-action">
                                <a class="waves-effect waves-teal btn-flat">Cancelar</a>
                                <button class="btn waves-effect waves-light btn-submit" type="submit" id="btn-submit">Salvar</button>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
        
        
        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0-rc.2/js/materialize.min.js"></script>
        <script src="https://code.jquery.com/jquery-3.3.1.min.js" integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8=" crossorigin="anonymous"></script>
        <script src="js/publish.js"></script>
        <script src="js/main.js"></script>
    </body>
</html>