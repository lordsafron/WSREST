<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <script src="js/jquery-1.12.3.js" type="text/javascript"></script>
        <script src="js/bootstrap.min.js" type="text/javascript"></script>
        <script src="js/controlador.js" type="text/javascript"></script>
        <title>JSP Page</title>
    </head>
    <body>
        
        <div id="row1" class="row">
            <form action="#" method="POST" class="form-horizontal">

                <div class="form-group">
                    <label for="pais">Pais</label>
                    <div class="col-sm-4">
                        <input id="pais" type="text" class="form-control"/>
                    </div>
                </div>

                <div class="form-group">
                    <div class="col-sm-4">
                        <button type="button" id="consultaBtnForm" class="btn btn-danger">
                            <span class="glyphicon glyphicon-search"></span> Consultar
                        </button>   
                    </div>
                </div>


            </form>
        </div>

        <div id="row2" class="row">
            <form action="#" method="POST" class="form-horizontal" id="vistaForm">


                <div class="form-group">
                    <label for="paisForm">Pais</label>
                    <div class="col-sm-4">
                        <input id="paisForm" type="text" class="form-control"/>
                    </div>
                </div>



                <div class="form-group">
                    <label for="pais">Pais de Origen</label>
                    <div class="col-sm-4">
                        <select id="listaPaisForm" name="paisForm" class="form-control">

                        </select>
                    </div>
                </div>

                <div class="form-group">

                    <button type="button" id="btnModificarForm" class="btn btn-danger">
                        <span class="glyphicon glyphicon-pencil"></span> Modificar
                    </button>   
                    <button type="button" id="btnCancelarForm" class="btn btn-danger">
                        <span class="glyphicon glyphicon-remove"></span> Cancelar
                    </button> 

                </div>
            </form>
        </div>
    </body>
</html>
