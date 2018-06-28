<%-- 
    Document   : publish-list
    Created on : 28/06/2018, 00:06:17
    Author     : kassia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Publicações</title>
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

        <div class="container column">
            <div class="card col s12 m8 offset-m2">
                <div class="row">
                    <div class="col s12 m8 offset-m2">
                        <nav>
                            <div class="nav-wrapper">
                                <form>
                                    <div class="input-field">
                                        <input id="input-search" type="search" required>
                                        <label class="label-icon" for="search"><i class="material-icons">search</i></label>
                                        <i class="material-icons">close</i>
                                    </div>
                                    <div id="loading"></div>
                                </form>
                            </div>
                        </nav>
                    </div>
                </div>
                <div class="row">
                    <div class="col s12 m8 offset-m2">
                        <ul class="collection with-header">
                            <li class="collection-header"><h4>Publicações</h4></li>
                            <li class="collection-item grey lighten-3">
                                <span class="title" id="title" name="title"><h5 class="blue-grey-text text-darken-4">Title</h5></span>
                                <div class="row">
                                    <div class="col s4">
                                        <img  name="image" id="image" class="materialboxed" width="300" src="https://www.52onriflemotel.co.nz/wp-content/uploads/2014/09/placeholder-300x300.jpg">
                                    </div>
                                    <div class="col s4 offset-s2">
                                        <video name="video" id="video" class="responsive-video" controls>
                                            <source src="movie.mp4" type="video/mp4">
                                        </video>
                                    </div>
                                </div>
                                <div class="grey lighten-4">
                                    <p class="text-bold margin-bottom-2" id="comentarios" name="comentarios">Comentários</p>
                                    <p>Texto Texto Texto</p>
                                </div>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
        
        
        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0-rc.2/js/materialize.min.js"></script>
        <script src="https://code.jquery.com/jquery-3.3.1.min.js" integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8=" crossorigin="anonymous"></script>
        <script src="js/publish.js"></script>
        <script src="js/main.js"></script>
    </body>
</html>