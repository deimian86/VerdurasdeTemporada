package com.deimian86.verdurasdetemporada.entities.meses;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import org.apache.commons.lang3.StringUtils;

import java.text.DateFormatSymbols;

@Entity
public class Mes {

    private static int MAX_STR_LENGTH = 3;

    public static int ENERO         = 1;
    public static int FEBRERO       = 2;
    public static int MARZO         = 3;
    public static int ABRIL         = 4;
    public static int MAYO          = 5;
    public static int JUNIO         = 6;
    public static int JULIO         = 7;
    public static int AGOSTO        = 8;
    public static int SEPTIEMBRE    = 9;
    public static int OCTUBRE       = 10;
    public static int NOVIEMBRE     = 11;
    public static int DICIEMBRE     = 12;

    @PrimaryKey
    private int id;

    public Mes(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return new DateFormatSymbols().getMonths()[this.getId() - 1];
    }

    public String getNombreCorto() {
        return new DateFormatSymbols().getShortMonths()[this.getId() - 1];
    }

    public String getNombreCortoFormateado(){
        return StringUtils.substring(getNombreCorto(), 0, MAX_STR_LENGTH).toUpperCase();
    }

    @Override
    public String toString() {
        return "Mes{" +
                "id=" + id +
                " nombre=" + getNombre() +
                " nombreCorto=" + getNombreCorto() +
                " nombreCortoFormateado=" + getNombreCortoFormateado() +
                '}';
    }


}