$(document).ready(function () {

    $("#submit").click(function(event){

        event.preventDefault();
        let formJson = JSON.stringify(serializeObject($('#employeeForm')));

        $.ajax({
            url: 'http://localhost:8080/Employee',
            type: 'POST',
            contentType: 'application/json; charset=utf-8',
            data: formJson,
            success: function (emp) {
                $('#formInput').html("");
                $("#formInput").append('<H3 align="center"> New Employee Information <H3>');
                $('#formInput').append("<H4 align='center'>First Name:  "+ emp.firstName +"</h4>");
                $('#formInput').append("<H4 align='center'>Last Name: "+ emp.lastName +"</h4>");
                $('#formInput').append("<H4 align='center'>Email: "+ emp.email +"</h4>");
                $("#formInput").append('<h4 align="center"> <a href="#" onclick="toggle_visibility(\'formInput\');resetForm(\'employeeForm\');"><b>EXIT</b> </a> </h4>');
                $('#formInput').show();
            },
            error: function (xhr) {
                let errors = JSON.parse(xhr.responseText);
                if(errors.errorType === 'ValidationError'){
                    $('#errorItems').html('');
                    $.each(errors.errorFields, function(i, err){
                        $('#errorItems').append('<li>' + err.message +'</li>');
                    });
                }
                $('#errors').show();
            }
        })
    });

    toggle_visibility = function (id) {
        var element = document.getElementById(id);
        if (element.style.display == 'block')
            element.style.display = 'none';
        else
            element.style.display = 'block';
    }

    make_hidden = function (id) {
        var element = document.getElementById(id);
        element.style.display = 'none';
    }

    make_visible = function (id) {
        var element = document.getElementById(id);
        element.style.display = 'block';
    }

    resetForm = function (id) {
        var element = document.getElementById(id);
        $(element)[0].reset();

    }

// Translate form to array
// Then put in JSON format
    function serializeObject(form) {
        var jsonObject = {};
        var array = form.serializeArray();
        $.each(array, function () {
            jsonObject[this.name] = this.value;
        });
        return jsonObject;

    };

});