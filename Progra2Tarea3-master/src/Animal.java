public class Animal {
	
	//Declaracion de variables.
	String nombre;	
	String ladrar;
	String maullar;
	String hablar;
	int edad;
	
	//Funcion animal, le damos las caracteristicas
	Animal(String nombre, int edad)
	{
		this.nombre = nombre;
		this.edad = edad;
	}
	
	
	//establecemos el nombre y lo retornamos
	String getNombre()
	{
		return nombre;
	}
	
	//establecemos la edad y la retornamos
	int getEdad()
	{
		return edad;
	}
	
    
	//Obtenemos el nombre
	void setNombre(String nombre)
	{
		this.nombre =nombre;
	}
	
	//obtenemos la edad
	void setEdad(int edad)
	{
		this.edad = edad;
	}
	
	
}