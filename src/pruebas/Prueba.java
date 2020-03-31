package pruebas;

import java.util.ArrayList;

import modelo.bean.Producto;
import modelo.dao.ModeloProducto;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ModeloProducto mp = new ModeloProducto();
		ArrayList<Producto> productos = mp.getAll();
		System.out.println(productos);
	}

}
