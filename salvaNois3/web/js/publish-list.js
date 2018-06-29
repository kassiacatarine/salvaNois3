let publications = [];

function getAllPublications() {
    $.ajax({
        method: 'GET',
        url: `PublicationsServlet`,
        success: successMessage,
        error: errorMessage,
    });
}

function successMessage(data) {
    alertMessage('Ok');
    console.log('Publicações encontradas com sucesso --> length: ' + data.length);
    if (!data) return;

    publications = data;
    atualiza();
}


function errorMessage(err) {
    alertMenssage('Erro ao buscas publicações.');
}

function listCardPublications(publications) {
    $('#list-cards').html('');
    ordernize(publications);
    if (contacts.length == 0) {
        $('#list-cards').append(noContacts('import_contacts', 'Você ainda não possui nenhum contato.'));
    } else {
        contacts.forEach((contact) => {
            $('#list-cards').append(insertInformationsCard(contact));
            let index = insertIndex(contact);
            if (!!index) {
                $('#list-cards>li[data-id= ' + contact._id + ']').before(index);
            }
        });
    }
}

$(document).ready(function() {
    $('.materialboxed').materialbox();
    getAllPublications();
});