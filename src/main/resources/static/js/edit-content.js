
$(document).ready(function () {
    var newContent = '';
    var index = '';
    var colID = '';

    $('td.edit-td').each(function () {
        $(this).on('click', function () {
            $(this).attr('contenteditable', 'true');
            index = $(this).parent().index();
            colID = $(this).attr('id');
        });

        $(this).on('blur', function () {
            $(this).removeAttr('contenteditable');
            newContent = $(this).text();

            var arr = {Content: newContent, Index: index, ID: colID};
            console.log(newContent);
            console.log(index);
            console.log(colID);

            $.ajax({
                url: '/all/add-new',
                type: 'POST',
                data: JSON.stringify(arr),
                contentType: 'application/json; charset=utf-8',
                dataType: 'json',
                async: false,
                success: function (data) {
                    if(data.status == 'OK') alert ('You are okay');
                    else alert('Failed');
                }
            })
        });
    });
});