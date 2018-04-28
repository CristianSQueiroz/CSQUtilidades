/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author csqueiroz
 */
public class Utilidades {

    public static String validaString(Object o) {
        if (o instanceof String) {
            return o.toString();
        } else {
            return "";
        }
    }
    
    public static String converteInt(Object o){
        int numero = validaInt(o);
        return String.valueOf(numero);
    }

    public static Float validaFloat(Object o) {
        try {
            return Float.parseFloat(o.toString());
        } catch (Exception e) {
            return 0f;
        }

    }

    public static int validaInt(Object o) {
        try {
            return Integer.parseInt(o.toString());
        } catch (Exception e) {
            return 0;
        }
    }

    public static long validaLong(Object o) {
        try {
            return Long.parseLong(o.toString());
        } catch (Exception e) {
            return 0;
        }
    }

    public static double validaDouble(Object o) {
        try {
            return Double.valueOf(o.toString());
        } catch (Exception e) {

        }
        return 0;
    }

    public static boolean inEqualsIgnoreCase(String palava, String... contextos) {
        return palava.toUpperCase().contains(contextos.toString().toUpperCase());
    }

    public static Date getData(String d) {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date data = null;
        try {
            data = format.parse(d);
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(null, "Data em formato inválido.");
        }
        return data;
    }
        
}
