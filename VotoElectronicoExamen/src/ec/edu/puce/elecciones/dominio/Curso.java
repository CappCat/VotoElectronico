package ec.edu.puce.elecciones.dominio;

import java.util.ArrayList;
import java.util.List;

public class Curso
{
    // instance variables - replace the example below with your own
    private String nombreCurso;
    private List<Estudiante> estudiantes;
    private Mesa mesa;
    private int votosCiudad;

    /**
     * Constructor for objects of class Ciudad
     */
    public Curso(String ciudad, Mesa mesa)
    {
        this.nombreCurso = ciudad;
        this.votosCiudad = 0;
        this.mesa = mesa;
        
    }
    

    
    public int getVotos(String nombre){
        /*for (VotosCiudad voto : votosCandidatos){
            if(nombre == voto.getNombreCandidato()){
                return voto.votosCandidatoCiudad();
            }
        }*/
        return 0;
    }
    
    public int votosTotales(){
        votosCiudad = 0;
        /*for (VotosCiudad voto : votosCandidatos){
            this.votosCiudad+= voto.votosCandidatoCiudad();
        }*/
        return votosCiudad;
    }

	public String getCiudad() {
		return nombreCurso;
	}

	public void setCiudad(String ciudad) {
		this.nombreCurso = ciudad;
	}

	

	public String getNombreCurso() {
		return nombreCurso;
	}

	public void setNombreCurso(String nombreCurso) {
		this.nombreCurso = nombreCurso;
	}

	public List<Estudiante> getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(List<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}

	public Mesa getMesa() {
		return mesa;
	}

	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}

	public int getVotosCiudad() {
		return votosCiudad;
	}

	public void setVotosCiudad(int votosCiudad) {
		this.votosCiudad = votosCiudad;
	}


    
	
    
}
