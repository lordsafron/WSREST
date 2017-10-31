var funcionConsultar = function () {
    return {
        init: function () {
            $("#consultaBtnForm").click(function () {
                var pais = $("#pais").val();
                var datos = {"pais": pais};
                //var myJSON = JSON.stringify(datos);
                var myJSON = "";
                var tbcmPaisOrigen = "";
                $.ajax({
                    url: "http://localhost:8180/ServicioGlassfish/rest/paises/find",
                    data: {"tbcmPaisOrigen": pais},
                    type: "GET",
                    dataType: "jsonp",
                    //jsonpCallback: "tbcmPaisOrigen",
                    jsonpCallback: "tbcmPaisOrigen",
                    success: function(data){
                        myJSON = JSON.stringify(data);
                        tbcmPaisOrigen = jQuery.parseJSON(myJSON);
                        //console.log("Bien: " + tbcmPaisOrigen.pais);
                        //console.log("Bien: " + data);
                        console.log("Bien: " + tbcmPaisOrigen.pais);
                        
                        $( "#paisForm" ).val(tbcmPaisOrigen.pais);
                    },
                    error: function(XHR, textStatus, errorThrown){
                        alert(textStatus + ":" + errorThrown);
                    }
                });
            });
        }
    };
}();

var listaPaises = function () {

    return {
        init: function () {
            var myJSON = "";
                var lista = "";
            console.log("lista paises si inicia!");
            $.ajax({
                url: "http://localhost:8180/ServicioGlassfish/rest/paises/all",
                method: "GET",
                dataType: "jsonp",
                //jsonp: "callback",
                jsonpCallback: "lista",
                success: function (data)
                {
                    myJSON = JSON.stringify(data);
                        lista = jQuery.parseJSON(myJSON);
                    //console.log("Bien: " + lista.tbcmPaisOrigen);
                    
                    //console.log(response.tbcmPaisOrigen);
                    var opcion = '';
                    for (var i = 0; i < lista.tbcmPaisOrigen.length; i++) {
                        //console.log(response.tbcmPaisOrigen[i].pais);
                        opcion += '<option value="' + lista.tbcmPaisOrigen[i].pais + '"> ' + lista.tbcmPaisOrigen[i].pais + '</option>';
                        //console.log("pais: " + lista.tbcmPaisOrigen[i].pais);
                        console.log("pais: " + lista.tbcmPaisOrigen[i].pais);
                    }
                    $("#listaPaisForm").append(opcion);
                    
                },
                error: function(XHR, textStatus, errorThrown){
                        alert(textStatus + ":" + errorThrown);
                    }
            });
        }
    };

}();












var app = function () {
    return {
        init: function () {
            funcionConsultar.init();
            listaPaises.init();
        }
    };
}();


$(document).ready(function () {
    console.log("Ready!");
    app.init();


});

