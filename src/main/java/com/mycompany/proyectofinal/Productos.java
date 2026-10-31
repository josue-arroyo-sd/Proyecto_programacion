package com.mycompany.proyectofinal;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "Productos", urlPatterns = {"/listarProductos"})
public class Productos extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        List<ItemCatalogo> listaProductos = new ArrayList<>();
        ConexionBD conexionBD = new ConexionBD();
        
        String sql = "SELECT p.nombre AS producto, c.nombre AS categoria " +
                     "FROM productos p INNER JOIN categorias c ON p.categoria_id = c.id";

        try (Connection con = conexionBD.Conectar();
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            
            while (rs.next()) {
                String cat = rs.getString("categoria");
                String prod = rs.getString("producto");
                listaProductos.add(new ItemCatalogo(cat, prod));
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }

        request.setAttribute("/listaProductos", listaProductos);
        request.getRequestDispatcher("/catalogo.jsp").forward(request, response);
    }
}