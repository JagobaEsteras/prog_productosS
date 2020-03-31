package modelo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

import modelo.Conector;
import modelo.bean.Producto;
import modelo.bean.Talla;

public class ModeloProducto extends Conector{

	public ArrayList<Producto> getAll(){
		ArrayList<Producto> productos = new ArrayList<Producto>();
		Statement st;
		try {
			st = conexion.createStatement();
			ResultSet rs = st.executeQuery("select * from productos");

			Producto producto;
			while (rs.next()) {
				
				producto = new Producto();
				producto.setId(rs.getInt("id"));
				producto.setNombre(rs.getString("nombre"));
				producto.setStock(rs.getInt("stock"));
				producto.setFecha_compra(rs.getDate("fecha_compra"));
				producto.setColor(rs.getString("color"));
				producto.setMade_in(rs.getString("made_in"));
				producto.setPrecio(rs.getDouble("precio"));
				producto.setDescuento(rs.getInt("descuento"));
				producto.setTallas(rs.getString("tallas"));
				
				productos.add(producto);
				
			}
			return productos;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return productos;
			}
	
	
	public Producto get(int id) {
		//TODO implementar
		return null;
	}
	
	public void insert(Producto producto) {
		//TODO implementar
	}
	
	public void update(Producto producto) {
		//TODO implementar
	}
	
	public void delete(int id) {
		//TODO implementar
	}
	
	public ArrayList<Producto> deLaTalla(Talla talla){
		//TODO implementar, un poco mas dificil
		return null;
	}
}
