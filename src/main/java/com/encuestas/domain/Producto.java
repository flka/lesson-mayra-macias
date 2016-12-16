package com.encuestas.domain;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name="producto")
public class Producto {
	@Id//clave primaria
	@GeneratedValue
	private int IDPRODUCTO;
	private int NOMBRE;
        private int PRECIO;
        private int CANTIDAD;

    public int getIDPRODUCTO() {
        return IDPRODUCTO;
    }

    public void setIDPRODUCTO(int IDPRODUCTO) {
        this.IDPRODUCTO = IDPRODUCTO;
    }

    public int getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(int NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    public int getPRECIO() {
        return PRECIO;
    }

    public void setPRECIO(int PRECIO) {
        this.PRECIO = PRECIO;
    }

    public int getCANTIDAD() {
        return CANTIDAD;
    }

    public void setCANTIDAD(int CANTIDAD) {
        this.CANTIDAD = CANTIDAD;
    }
	
    
	
	
	
	
	
	
	
}
