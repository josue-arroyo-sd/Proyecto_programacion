<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Catálogo Dinámico - Tienda Virtual</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <style>
            body {
                font-family: Arial, sans-serif;
                background-color: #f2f4f3;
                color: #333;
                max-width: 850px;
                margin: 30px auto;
                padding: 20px;
            }
            h1 {
                font-size: 1.6rem;
                color: #2c3e35;
                margin-bottom: 5px;
            }
            .subtitle {
                color: #66706b;
                font-size: 0.9rem;
                margin-bottom: 25px;
            }
            .tabla-catalogo {
                width: 100%;
                border-collapse: collapse;
                background-color: #ffffff;
                box-shadow: 0 2px 5px rgba(0,0,0,0.05);
                border-radius: 6px;
                overflow: hidden;
            }
            .tabla-catalogo th {
                background-color: #2d6a4f;
                color: white;
                text-align: left;
                padding: 12px 15px;
                font-size: 0.95rem;
                text-transform: uppercase;
            }
            .tabla-catalogo td {
                padding: 12px 15px;
                border-bottom: 1px solid #e2e8e5;
                font-size: 0.9rem;
            }
            .tabla-catalogo tr:nth-child(even) {
                background-color: #f8faf9;
            }
            .btn-volver {
                display: inline-block;
                margin-top: 25px;
                background-color: #40916c;
                color: white;
                padding: 10px 20px;
                text-decoration: none;
                font-weight: bold;
                border-radius: 4px;
            }
            .btn-volver:hover {
                background-color: #2d6a4f;
            }
        </style>
    </head>
    <body>

        <h1>Catálogo Dinámico desde la Base de Datos</h1>
        <div class="subtitle">Datos extraídos en tiempo real de la BD: BDproductos</div>

        <table class="tabla-catalogo">
            <thead>
                <tr>
                    <th>Categoría</th>
                    <th>Producto</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="item" items="${listaProductos}">
                    <tr>
                        <td><strong>${item.categoria}</strong></td>
                        <td>${item.producto}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>

        <div>
            <a href="index.html" class="btn-volver">Volver al Inicio</a>
        </div>

    </body>
</html>