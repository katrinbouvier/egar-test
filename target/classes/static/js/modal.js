$(document).ready(function () {
    $('#open-modal').on('click', function () {
        $('.modal-div').show();
    });

    $('#close-modal').on('click', function() {
        $('.modal-div').hide();
    });
});