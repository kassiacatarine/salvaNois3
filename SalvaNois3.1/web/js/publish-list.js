let publications = [];

function getAllPublications() {
    $.ajax({
        method: 'GET',
        url: `./PublishList`,
        datatype:'json',
        headers:{
          Accept: "application/json; charset=utf-8",  
          "Content-Type" : "application/json; charset=utf-8"
        },
        success:function(res){
            var data = jQuery.parseJSON(res)
            successMessage(data);
        },
        error: errorMessage,
    });
}

function successMessage(data) {
    alertMessage('Ok');
    console.log('Publicações encontradas com sucesso --> length: ' + data.length);
    if (!data) return;

    publications = data ? data : [];
    atualiza();
    listCardPublications(publications);
}


function errorMessage(err) {
    alertMenssage('Erro ao buscas publicações.');
}

function listCardPublications(publications) {
    $('#collection-list').html('');
    if (publications.length == 0) {
        $('#collection-list').append(noPublications('stop_screen_share', 'Você ainda não possui nenhuma publicação.'));
    } else {
        publications.forEach((publish) => {
            $('#collection-list').append(insertInformationsCard(publish));
        });
    }
}

function noPublications(icon, message) {
    let html = `<div class="center-align blue-grey-text text-darken-2" style="margin: 200px 0;">
                    <i class="large material-icons" id="img-not-found">${icon}</i>
                    <h6>${message}</h6>
                </div>
                `;
    return html;
}

function insertInformationsCard(publish) {
    let html = `
                <li class="collection-item grey lighten-3">
                    <span class="title" id="title" name="title"><h5 class="blue-grey-text text-darken-4">${publish.titulo}</h5></span>
                    <div class="row">
                        <div class="col s4">
                            <img  name="image" id="image" class="materialboxed" width="300" src="${publish.imagem}">
                        </div>
                        <div class="col s4 offset-s2">
                            <video name="video" id="video" class="responsive-video" controls>
                                <source src="${publish.video}" type="video/mp4">
                            </video>
                        </div>
                    </div>
                    <div class="grey lighten-4">
                        <p class="text-bold margin-bottom-2" id="comentarios" name="comentarios">Comentários</p>
                        <p>${publish.texto}</p>
                    </div>
                </li>`;

    return html;
}

$(document).ready(function() {
   // $('.materialboxed').materialbox();
    getAllPublications();
});