<%-- 
    Document   : inicio
    Created on : 20/02/2017, 11:08:36 PM
    Author     : jonathan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicio</title>
          <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
         <style type="text/css">
             #lol{
  width: 30%;}
            
            </style>
    </head>
    <body>
        <h1>Ejemplo Spring</h1>
        <hr>
        <center>
            <form  id="lol"  method="GET" action="clase1/usuario">
                 
               <h2>usuario</h2>
                <input id="nombre2" name="nombre1" id="usuario" class="form-control"  type="text" placeholder="Nombre">
                
                 <h2>contraseña</h2>
                 <input id="contrasenia" id="contra" name="contrasenia" class="form-control" type="text" placeholder="contraseñia">
                
                
                <br>
                
                <button  onclick="myFunction()" class="btn btn-Warning" >Aceptar</button>
            </form>
            
            <br><hr>
        </center>
    <script>
        var usuario=document.getElementById('usuario');
        var contrasenia=document.getElementById('contra');
        if(usuario=="" &&  contrasenia==""){
            function myFunction{
                alert("campos vacios");
                
            }
        }
        </script>
    </body>
</html>
