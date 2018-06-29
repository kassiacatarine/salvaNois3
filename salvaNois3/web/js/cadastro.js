function cadastro(user) {
    $.ajax({
        method: 'POST',
        url: `./LoginServlet`,
        data: user,
        success : function(responseText) {
                if(responseText == "Login/Senha Incorretos."){
                    $('#ajaxServletResponse').text(responseText);
                } else {
                    clearForm()
                    window.location.href = "./publish.jsp"
                }
            }
    });
}

function saveForm() {
    let user = new Object();
    $('#form-cadastro').submit(e => {
        e.preventDefault();
        user.nome = $('#name').val();
        user.login = $('#login').val();
        user.senha = $('#password').val();
        user.email = $('#email').val();
        user.endereco = $('#endereco').val();
        user.admin = $('#admin').prop('checked');
        cadastro(user);
    });
}

function clearForm() {
    let inputs = $('input');
    for (let i = 0; i < inputs.length; i++) {
        if (inputs[i].type == 'password' || inputs[i].type == 'text')
            inputs[i].value = '';
        else if (inputs[i].type == 'checke')
            $('#' + inputs[i].id).prop('checked', false);
    }
}

function verifyInputRequire() {
    if ($('#login').val() !== '' && $('#password').val() !== '' && $('#name').val() !== '' && $('#email').val() !== '') {
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