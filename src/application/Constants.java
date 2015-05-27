/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author Jesús
 */
public abstract class Constants {
    public static String REGISTRAR_USUARIO =
            SQLTools.buildProcedureCall("tupet", "registrarUsuario", 9);

    public static String PROCEDIMIENTO2 =
            SQLTools.buildProcedureCall("tupet", "otroProcedimiento", 6);

    public static String PROCEDIMIENTO3 =
            SQLTools.buildProcedureCall("tupet", "yOtroMasProcedimiento", 2);
}
