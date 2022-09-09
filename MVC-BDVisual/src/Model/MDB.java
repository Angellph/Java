package Model;

import java.sql.*;
import java.util.*;

public class MDB {
	
	protected String sqlQuery;
	protected String table;
	protected Statement executer;
	protected ResultSet dataSet;
	protected Conexion conexion;

        public MDB() {
           //conexion = new Conexion("com.mysql.jdbc.Driver",  "jdbc:mysql://localhost/bdcostos", "root","administrador");//CAMBIAR BDCOSTOS POR EL NOMBRE DE SU BD
	
        //  conexion = new Conexion("com.mysql.jdbc.Driver",  "jdbc:mysql://localhost:3306/bddatos?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&useTimezone=true&serverTimezone=GMT&useSSL=false", "root","subway5@");//ESTA CADENA LARGA SE USA PARA MAC Y PARA ALGUNAS INSTALACIONES RECIENTES DE MYSQL
	    conexion = new Conexion("com.mysql.jdbc.Driver",  "jdbc:mysql://sql5.freesqldatabase.com:3306/sql5473774?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&useTimezone=true&serverTimezone=GMT&useSSL=false", "sql5473774","wsNmC8RLbG");//ESTA CADENA LARGA SE USA PARA MAC Y PARA ALGUNAS INSTALACIONES RECIENTES DE MYSQL
        }

   
	public String registrarAlta(String nombreTabla, String consultaSQL){
		int i;
		String resultado;
		table = nombreTabla;
		try {
			executer = conexion.ObtenerConexion().createStatement();
			dataSet = executer.executeQuery("SELECT * FROM " + table + " LIMIT 1");
			sqlQuery = "INSERT INTO " + nombreTabla + " (";
			for(i = 1;i<=dataSet.getMetaData().getColumnCount()-1;i++)
			{
			     sqlQuery = sqlQuery + dataSet.getMetaData().getColumnName(i) + ",";
			}
			sqlQuery = sqlQuery + dataSet.getMetaData().getColumnName(i)+ ") VALUES (" + consultaSQL + ")";
			executer.executeUpdate(sqlQuery);
			resultado =  "Datos almacenados exitosamente.";
		}
		catch (SQLException e) {
			resultado = e.toString() + "\n" + sqlQuery;
		}
		finally{
			try {
				dataSet.close();
				executer.close();
			}
			catch (SQLException e) {
				System.out.print(e.toString());
			}
		}
		return resultado;
	}
	
	public String modificarRegistro(String nombreTabla, String campos, String condicion){
		String resultado;
		table = nombreTabla;
		try {
			executer = conexion.ObtenerConexion().createStatement();
			sqlQuery = "UPDATE " + table + " SET " + campos + " WHERE " + condicion + " LIMIT 1";
			executer.executeUpdate(sqlQuery);
			resultado =  "Las modificaciones fueron ejecutadas correctamente.";
		}
		catch (SQLException e) {
			resultado = e.toString() + "\n" + sqlQuery;
		}
		finally{
			try {
				dataSet.close();
				executer.close();
			}
			catch (SQLException e) {
				System.out.print(e.toString());
			}
		}
		return resultado;
	}
	
	public List<ArrayList<String>> consultarDatos(String nombreTabla, String campos, String condicion){
		int i;
		table = nombreTabla;
		ArrayList<ArrayList<String>> datos = new ArrayList<ArrayList<String>>();
		ArrayList<String> temp;
		try {
			executer = conexion.ObtenerConexion().createStatement();
			sqlQuery = "SELECT DISTINCT " + campos + " FROM " + table + " WHERE " + condicion;
			dataSet = executer.executeQuery(sqlQuery);
			dataSet.beforeFirst();
			while(dataSet.next()){
				temp = new ArrayList<String>();
				for(i = 1;i<=dataSet.getMetaData().getColumnCount();i++)
				{
					temp.add(dataSet.getString(i));
				}
				datos.add(temp);
			}
			if(!dataSet.first()){
				temp = new ArrayList<String>();
				temp.add("NO");
				datos.add(temp);
			}
		}
		catch (SQLException e) {
			System.out.print(e.toString() + "\n" + sqlQuery);
		}
		finally{
			try {
				dataSet.close();
				executer.close();
			}
			catch (SQLException e) {
				System.out.print(e.toString());
			}
		}
		return datos;
	}
	
	
	public List<ArrayList<String>> consultaAbierta(String consulta){
		int i;
		ArrayList<ArrayList<String>> datos = new ArrayList<ArrayList<String>>();
		ArrayList<String> temp;
		try {
			executer = conexion.ObtenerConexion().createStatement();
			sqlQuery = consulta;
			dataSet = executer.executeQuery(sqlQuery);
			dataSet.beforeFirst();
			while(dataSet.next()){
				temp = new ArrayList<String>();
				for(i = 1;i<=dataSet.getMetaData().getColumnCount();i++)
				{
					temp.add(dataSet.getString(i));
				}
				datos.add(temp);
			}
			if(!dataSet.first()){
				temp = new ArrayList<String>();
				temp.add("No se encontró ninguna coincidencia. Verifique los datos o intente con otro tipo de búsqueda.");
				datos.add(temp);
			}
		}
		catch (SQLException e) {
			System.out.print(e.toString() + "\n" + sqlQuery);
		}
		finally{
			try {
				dataSet.close();
				executer.close();
			}
			catch (SQLException e) {
				System.out.print(e.toString());
			}
		}
		return datos;
	}
        
        public String borrarRegistro(String nombreTabla, String condicion){
		String resultado;
		table = nombreTabla;
		try {
			executer = conexion.ObtenerConexion().createStatement();
			sqlQuery = "DELETE FROM " + table+ " WHERE " + condicion ;
			executer.executeUpdate(sqlQuery);
			resultado =  "El registro se ha borrado exitosamente.";
		}
		catch (SQLException e) {
			resultado = e.toString() + "\n" + sqlQuery;
		}
		finally{
			try {
				dataSet.close();
				executer.close();
			}
			catch (SQLException e) {
				System.out.print(e.toString());
			}
		}
		return resultado;
	}
}
