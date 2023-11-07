package principal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class EjemploInsercion {

	public static void main(String[] args) {
		//datos de conexion
		String cadenaCon="jdbc:mysql://localhost:3306/empresa";
		String user="root";
		String pwd="root";
		try(Connection con=DriverManager.getConnection(cadenaCon, user, pwd);){
		//instruccion sql de insercion
		String sql="insert into empleados (nombre,email,departamento,salario) ";
		sql+="values('paco','qqq 2gmail.com','informatica',1600)";
		Statement st=con.createStatement();
		st.execute(sql);
		System.out.println("Empleado añadido");
		/*cierre de la conexion
		con.close();*/
		
	}
		catch(SQLException ex) {
			ex.printStackTrace();
		}

	}
}