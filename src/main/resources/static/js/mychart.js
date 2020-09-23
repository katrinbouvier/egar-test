$(document).ready(function() {

    var dates = [];
    var costs = [];
    var x_d = '';
    var x_c = '';

    $("#select-company").on('change', function () {
        console.log($(this).val());
        console.log($("#select-company option:selected").val());

        $.ajax({
            url: '/get-chart-data',
            type: 'POST',
            data: JSON.stringify({company: $(this).val()}),
            contentType: 'application/json; charset=utf-8',
            dataType: 'json',
            async: false
        });

        $.getJSON("/get-chart-data", function(data) {

            var datas = Object.values(data);
            dates = datas[1];
            costs = datas[2];

            x_d = dates.toString();
            x_c = costs.toString();

            new Chartist.Line('.ct-chart', {
                labels: x_d.split(','),
                series: [x_c.split(',')]
            }, {
                fullWidth: true,
                chartPadding: {
                    right: 40
                }
            });
        });


    });
});


//TODO: сортировка дат по возрастанию
