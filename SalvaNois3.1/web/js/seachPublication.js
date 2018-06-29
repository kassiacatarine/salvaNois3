let input = $('#input-search'),
    saida = $('#loading');

let DURACAO_DIGITACAO = 400,
    digitando = false,
    tempoUltimaDigitacao;

function atualiza() {

    if (!digitando) {
        digitando = true;
        saida.html(`<div class="progress">
                    <div class="indeterminate"></div>
                    </div>`);
    }

    tempoUltimaDigitacao = (new Date()).getTime();

    setTimeout(function() {

        var digitacaoTempo = (new Date()).getTime();
        var diferencaTempo = digitacaoTempo - tempoUltimaDigitacao;

        if (diferencaTempo >= DURACAO_DIGITACAO && digitando) {
            digitando = false;
            let publicationsSearch = searchPublications(input.val());
            if (input.val() === '') {
                saida.html('');
            } else {
                listAllSearch(publicationsSearch);
            }
        }
    }, DURACAO_DIGITACAO);
}


function searchPublications(word) {
    if (word !== '') {
        return publications.filter(function(item) {
            return item.titulo.indexOf(word) !== -1;
        });
    }
}


$(document).ready(() => {
    input.on('input', function() {
        atualiza();
    });
});