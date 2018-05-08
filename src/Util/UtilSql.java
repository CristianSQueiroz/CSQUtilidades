/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.util.HashMap;

/**
 *
 * @author csqueiroz
 */
public class UtilSql {

    public static String aplicarApostofo(Object o) {
        return "'" + o.toString() + "'";
    }

    public static String prepararLike(Object o, boolean startWith, boolean with, boolean endWith) {
        if (startWith) {
            return "'" + o.toString() + "%'";
        } else if (with) {
            return "'%" + o.toString() + "%'";
        } else if (endWith) {
            return "'%" + o.toString() + "'";
        }
        return "";
    }

    public static String preparaProcedure(String procedure, HashMap atributos) {
        String execute;
        for (Object entrySet : atributos.keySet()) {
            String parametro;
            if (atributos.get(entrySet) instanceof String) {
                parametro = aplicarApostofo(atributos.get(entrySet).toString());
            } else {
                parametro = atributos.get(entrySet).toString();
            }
            procedure = procedure.replaceAll(entrySet.toString(), parametro);
        }
        execute = "CALL " + procedure;
        return execute;
    }

    public static String preparaData(Object o) {
        String data = "";
        String[] dataPartida = o.toString().split("/");
        data += dataPartida[2] + "/" + dataPartida[1] + "/" + dataPartida[0];
        return aplicarApostofo(data);
    }

    public static String preparaDataBetWeen(Object dataInicial, Object dataFinal) {
        return " BETWEEN " + preparaData(dataInicial) + " and " + preparaData(dataFinal);
    }

    public static String montaQuery(HashMap atributos, String tabela, String orderby) {
        String select = "";
        String where = "";
        for (Object entrySet : atributos.keySet()) {
            select += entrySet.toString() + " , ";
        }
        select = "select " + select.substring(0, select.lastIndexOf(",") - 1) + " From " + tabela;
        if (orderby != null) {
            select += " order by " + Utilidades.validaString(orderby);
        }
        return select;
    }

    public static String montaQuery(String tabela, String orderby) {
        String select = "";
        select = "select * From " + tabela;
        if (orderby != null) {
            select += " order by " + Utilidades.validaString(orderby);
        }
        return select;
    }

    public static String montaQuery(HashMap atributos, HashMap restricoes, String tabela, String orderby) {
        String[] temp1 = tabela.split("&");
        String prefix = "";
        if (temp1.length > 1) {
            prefix = temp1[1] + ".";
        }
        String select = "";
        String where = "";
        if (atributos != null) {
            for (Object entrySet : atributos.keySet()) {
                if (entrySet.toString().contains("DT")) {
                    select += "DATE_FORMAT(" + prefix + entrySet.toString() + ",'%d/%m/%y') , ";
                } else {
                    select += prefix + entrySet.toString() + " , ";
                }

            }
        }
        for (Object entrySet : restricoes.entrySet()) {
            if (entrySet.toString().contains("PROCEDURE")) {
                where += restricoes.get("PROCEDURE") + " and ";
            } else if (entrySet.toString().contains("%")) {
                String temp = entrySet.toString();
                where += prefix + temp.replace("=", " like ") + " and ";
            } else if (entrySet.toString().contains("BETWEEN")) {
                String temp = entrySet.toString();
                where += prefix + temp.substring(0, temp.indexOf("=")) + temp.substring(temp.indexOf("=") + 1, temp.length()) + " and ";
            } else {
                where += prefix + entrySet.toString() + " and ";
            }
        }
        if (select.equalsIgnoreCase("")) {
            select = "select * From " + temp1[0];
        } else {
            select = "select " + select.substring(0, select.lastIndexOf(",") - 1) + " From " + temp1[0];
        }
        if (temp1.length > 1) {
            select += " " + temp1[1] + " ";
        }
        select += " where " + where.substring(0, where.lastIndexOf("and") - 1);
        if (orderby != null) {
            select += " order by " + Utilidades.validaString(orderby);
        }
        return select;
    }

    public static String montaQueryRelatorio(String select, HashMap restricoes, String orderby) {
        String from = " from TB_OS os left join TB_EQUIPE equipe on os.NR_EQUIPE = equipe.ID left join TB_LICITACAO licitacao on os.CD_LICITACAO = licitacao.ID ";
        String where = "";
        for (Object entrySet : restricoes.entrySet()) {
            if (entrySet.toString().contains("PROCEDURE")) {
                where += restricoes.get("PROCEDURE") + " and ";
            } else if (entrySet.toString().contains("%")) {
                String temp = entrySet.toString();
                where += temp.replace("=", " like ") + " and ";
            } else if (entrySet.toString().contains("BETWEEN")) {
                String temp = entrySet.toString();
                where += temp.substring(0, temp.indexOf("=")) + temp.substring(temp.indexOf("=") + 1, temp.length()) + " and ";
            } else {
                where += entrySet.toString() + " and ";
            }
        }
        select += from;
        select += " where " + where.substring(0, where.lastIndexOf("and") - 1);

        if (orderby != null) {
            select += " order by " + Utilidades.validaString(orderby);
        }
        return select;
    }

    public static String montaQueryUpdate(HashMap atributos, HashMap restricoes, String tabela) {
        String update = "UPDATE " + tabela + " SET ";
        for (Object entrySet : atributos.entrySet()) {
            int posEquals = entrySet.toString().indexOf("=");
            String atributo = entrySet.toString().substring(0, posEquals + 1);
            String valor = aplicarApostofo(entrySet.toString().substring(posEquals + 1, entrySet.toString().length()));
            update += atributo + valor + ", ";
        }
        update = update.substring(0, update.lastIndexOf(","));

        String where = " WHERE ";
        for (Object entrySet : restricoes.entrySet()) {
            where += entrySet.toString() + ", ";
        }
        where = where.substring(0, where.lastIndexOf(","));

        return (update + where);
    }

}
