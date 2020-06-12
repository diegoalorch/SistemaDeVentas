<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sistema de Ventas</title>
</head>
 <link rel="stylesheet" href="recursos/css/main.css">
 <link rel="stylesheet" href="recursos/css/bootstrap.min.css">
<body>
<div class="wrapper">
    <div class="sidebar">
        <h2>SISFAC</h2>
        <ul>
            <li><a href="hc?action=inicio" target = "mostrar"><i class="fas fa-home"></i>Inicio</a></li>
            <li><a href="hc?action=mantenimiento" target = "mostrar"><i class="fab fa-empire"></i>   Mantenimiento</a></li>
            <li><a href="hc?action=ventas" target = "mostrar"><i class="fas fa-address-card"></i>Ventas</a></li>
            <li><a href="hc?action=compras" target = "mostrar"><i class="fas fa-pencil-ruler"></i>Compras</a></li>
            <li><a href="hc?action=reportes" target = "mostrar"><i class="far fa-chart-bar"></i>   Reportes</a></li>
            <li><a href="hc?action=backup" target = "mostrar"><i class="fas fa-database"></i>Backup</a></li>
            <li><a href="hc?action=configuracion" target = "mostrar"><i class="fas fa-tools"></i>Configuración</a></li>
            <li><a href="#"><i class="fas fa-sign-out-alt"></i>Cerrar Seción</a></li>
        </ul> 
        <div class="social_media">
          <a href="https://www.facebook.com/diego.joel.Alor"><i class="fab fa-facebook-f" ></i></a>
          <a href="#"><i class="fab fa-twitter"></i></a>
          <a href="https://www.instagram.com/diego_joel_alor/"><i class="fab fa-instagram"></i></a>
      </div>
    </div>
    <div class="main_content" style="height: 650px">
        <iframe style="width: 100%; height: 100%; border: none;" name="mostrar"></iframe>
    </div>
</div>
    <script type="recursos/js/main.js"></script>
    <script src="https://kit.fontawesome.com/b99e675b6e.js"></script>
</body>
</html>