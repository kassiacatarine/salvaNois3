<<<<<<< HEAD
$(document).ready(() => {
    $('input#input_text, textarea#comments').characterCounter();
=======
function postPublish(publish) {
    $.ajax({
        method: 'POST',
        url: `./SavePublish`,
        data: publish,
        success : function(responseText) {
                if(responseText == "Não cadastrado"){
                    alertMessage('Erro ao salvar publicação.');
                }else{
                    alertMessage('Publicação Ok!');
                }
            }
    }).done(function() {
        //alertMessage('Publicação Ok!');
        clearForm();
    }).fail(function() {
        //alertMessage('Erro ao salvar publicação.');
    });
}


function getValuesForm() {
    publish = new Object();
    publish.title = $("#title").val();
    publish.video = $("#video").val();
    publish.videoName = $("#video-name").val();
    publish.image = $("#image").val();
    publish.imageName = $("#image-name").val();
    publish.comments = $("#comments").val();

    return publish;
}

function saveForm() {
    let user = new Object();
    $('#form-publish').submit(e => {
        e.preventDefault();
        const publish = getValuesForm();
        postPublish(publish);
    });
}

function clearForm() {
    let inputs = $('textarea, input');
    for (let i = 0; i < inputs.length; i++) {
        if (inputs[i].type === 'text' || inputs[i].type === 'textarea')
            inputs[i].value = '';
    }
}

$(document).ready(() => {
    saveForm();
>>>>>>> (Cuidado) Merda?
});