function login(user) {
    $.ajax({
        method: 'POST',
        url: `./LoginServlet`,
        data: user,
    }).done(() => {
        alertMessage('Login Ok!');
    }).fail(() => {
        alertMessage('Erro ao fazer login.');
        clearForm();
    });
}

function saveForm() {
    let user = new Object();
    $('#form-login').submit(e => {
        e.preventDefault();
        user.login = $('#login').val();
        user.senha = $('#password').val();
        login(user);
    });
}

function clearForm() {
    let inputs = $('input');
    for (let i = 0; i < inputs.length; i++) {
        if (inputs[i].type == 'password')
            inputs[i].value = '';
    }
}

function verifyInputRequire() {
    if ($('#login').val() !== '' && $('#password').val() !== '') {
        $('#btn-submit').removeClass("disabled");
        $('#btn-submit').addClass('modal-close')
    } else {
        $('#btn-submit').addClass("disabled");
        $('#btn-submit').removeClass('modal-close');
    }
}

$(document).ready(function() {
    $('.require').on('keyup select change', () => {
        verifyInputRequire();
    });

    saveForm();
});