/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

/**
 *
 * @author Cristian
 */
public class Encryptador {

    public static void main(String[] args) {
        String senha = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String senhaAlterada = new Encryptador().getEncrypted(senha);
        System.out.println(senhaAlterada);
        System.out.println(new Encryptador().getDecrypted(senhaAlterada));
        
        System.out.println(senha.equals(new Encryptador().getDecrypted(senhaAlterada)));
    }

    public String getEncrypted(String password) {
        return getWordEncrypted(getWordEncrypted(getWordEncrypted(password)));
    }

    public String getDecrypted(String password) {
        return getWordDecrypted(getWordDecrypted(getWordDecrypted(password)));
    }

    public String getWordEncrypted(String message) {
        String encrypted = "";
        for (int x = 0; x < message.length(); x++) {
            switch (String.valueOf(message.toCharArray()[x])) {
                case "A": {
                    encrypted += "W";
                    break;
                }
                case "B": {
                    encrypted += "w";
                    break;
                }
                case "C": {
                    encrypted += "a";
                    break;
                }
                case "D": {
                    encrypted += "y";
                    break;
                }
                case "E": {
                    encrypted += "t";
                    break;
                }
                case "F": {
                    encrypted += "b";
                    break;
                }
                case "G": {
                    encrypted += "m";
                    break;
                }
                case "H": {
                    encrypted += "q";
                    break;
                }
                case "I": {
                    encrypted += "A";
                    break;
                }
                case "J": {
                    encrypted += "C";
                    break;
                }
                case "K": {
                    encrypted += "x";
                    break;
                }
                case "L": {
                    encrypted += "N";
                    break;
                }
                case "M": {
                    encrypted += "R";
                    break;
                }
                case "N": {
                    encrypted += "e";
                    break;
                }
                case "O": {
                    encrypted += "V";
                    break;
                }
                case "P": {
                    encrypted += "D";
                    break;
                }
                case "Q": {
                    encrypted += "h";
                    break;
                }
                case "R": {
                    encrypted += "I";
                    break;
                }
                case "S": {
                    encrypted += "f";
                    break;
                }
                case "T": {
                    encrypted += "L";
                    break;
                }
                case "U": {
                    encrypted += "j";
                    break;
                }
                case "V": {
                    encrypted += "F";
                    break;
                }
                case "W": {
                    encrypted += "o";
                    break;
                }
                case "X": {
                    encrypted += "Z";
                    break;
                }
                case "Y": {
                    encrypted += "n";
                    break;
                }
                case "Z": {
                    encrypted += "P";
                    break;
                }
                //Minusculo
                case "a": {
                    encrypted += "J";
                    break;
                }
                case "b": {
                    encrypted += "z";
                    break;
                }
                case "c": {
                    encrypted += "O";
                    break;
                }
                case "d": {
                    encrypted += "T";
                    break;
                }
                case "e": {
                    encrypted += "v";
                    break;
                }
                case "f": {
                    encrypted += "E";
                    break;
                }
                case "g": {
                    encrypted += "d";
                    break;
                }
                case "h": {
                    encrypted += "K";
                    break;
                }
                case "i": {
                    encrypted += "u";
                    break;
                }
                case "j": {
                    encrypted += "g";
                    break;
                }
                case "k": {
                    encrypted += "G";
                    break;
                }
                case "l": {
                    encrypted += "p";
                    break;
                }
                case "m": {
                    encrypted += "Q";
                    break;
                }
                case "n": {
                    encrypted += "S";
                    break;
                }
                case "o": {
                    encrypted += "i";
                    break;
                }
                case "p": {
                    encrypted += "B";
                    break;
                }
                case "q": {
                    encrypted += "U";
                    break;
                }
                case "r": {
                    encrypted += "r";
                    break;
                }
                case "s": {
                    encrypted += "H";
                    break;
                }
                case "t": {
                    encrypted += "k";
                    break;
                }
                case "u": {
                    encrypted += "M";
                    break;
                }
                case "v": {
                    encrypted += "X";
                    break;
                }
                case "w": {
                    encrypted += "Y";
                    break;
                }
                case "x": {
                    encrypted += "s";
                    break;
                }
                case "y": {
                    encrypted += "c";
                    break;
                }
                case "z": {
                    encrypted += "l";
                    break;
                }
                case "0": {
                    encrypted += "P";
                    break;
                }
                case "1": {
                    encrypted += "P";
                    break;
                }
                case "2": {
                    encrypted += "P";
                    break;
                }
                case "3": {
                    encrypted += "P";
                    break;
                }
                case "4": {
                    encrypted += "P";
                    break;
                }
                case "5": {
                    encrypted += "P";
                    break;
                }
                case "6": {
                    encrypted += "P";
                    break;
                }
                case "7": {
                    encrypted += "P";
                    break;
                }
                case "8": {
                    encrypted += "P";
                    break;
                }
                case "9": {
                    encrypted += "P";
                    break;
                }
                

            }

        }
        return encrypted;
    }

    public String getWordDecrypted(String message) {
        String encrypted = "";
        for (int x = 0; x < message.length(); x++) {
            switch (String.valueOf(message.toCharArray()[x])) {
                case "A": {
                    encrypted += "I";
                    break;
                }
                case "B": {
                    encrypted += "p";
                    break;
                }
                case "C": {
                    encrypted += "J";
                    break;
                }
                case "D": {
                    encrypted += "P";
                    break;
                }
                case "E": {
                    encrypted += "f";
                    break;
                }
                case "F": {
                    encrypted += "V";
                    break;
                }
                case "G": {
                    encrypted += "k";
                    break;
                }
                case "H": {
                    encrypted += "s";
                    break;
                }
                case "I": {
                    encrypted += "R";
                    break;
                }
                case "J": {
                    encrypted += "a";
                    break;
                }
                case "K": {
                    encrypted += "h";
                    break;
                }
                case "L": {
                    encrypted += "T";
                    break;
                }
                case "M": {
                    encrypted += "u";
                    break;
                }
                case "N": {
                    encrypted += "L";
                    break;
                }
                case "O": {
                    encrypted += "c";
                    break;
                }
                case "P": {
                    encrypted += "Z";
                    break;
                }
                case "Q": {
                    encrypted += "m";
                    break;
                }
                case "R": {
                    encrypted += "M";
                    break;
                }
                case "S": {
                    encrypted += "n";
                    break;
                }
                case "T": {
                    encrypted += "d";
                    break;
                }
                case "U": {
                    encrypted += "q";
                    break;
                }
                case "V": {
                    encrypted += "O";
                    break;
                }
                case "W": {
                    encrypted += "A";
                    break;
                }
                case "X": {
                    encrypted += "v";
                    break;
                }
                case "Y": {
                    encrypted += "w";
                    break;
                }
                case "Z": {
                    encrypted += "X";
                    break;
                }
                //Minusculo
                case "a": {
                    encrypted += "C";
                    break;
                }
                case "b": {
                    encrypted += "F";
                    break;
                }
                case "c": {
                    encrypted += "y";
                    break;
                }
                case "d": {
                    encrypted += "g";
                    break;
                }
                case "e": {
                    encrypted += "N";
                    break;
                }
                case "f": {
                    encrypted += "S";
                    break;
                }
                case "g": {
                    encrypted += "j";
                    break;
                }
                case "h": {
                    encrypted += "Q";
                    break;
                }
                case "i": {
                    encrypted += "o";
                    break;
                }
                case "j": {
                    encrypted += "U";
                    break;
                }
                case "k": {
                    encrypted += "t";
                    break;
                }
                case "l": {
                    encrypted += "z";
                    break;
                }
                case "m": {
                    encrypted += "G";
                    break;
                }
                case "n": {
                    encrypted += "Y";
                    break;
                }
                case "o": {
                    encrypted += "W";
                    break;
                }
                case "p": {
                    encrypted += "l";
                    break;
                }
                case "q": {
                    encrypted += "H";
                    break;
                }
                case "r": {
                    encrypted += "r";
                    break;
                }
                case "s": {
                    encrypted += "x";
                    break;
                }
                case "t": {
                    encrypted += "E";
                    break;
                }
                case "u": {
                    encrypted += "i";
                    break;
                }
                case "v": {
                    encrypted += "e";
                    break;
                }
                case "w": {
                    encrypted += "B";
                    break;
                }
                case "x": {
                    encrypted += "K";
                    break;
                }
                case "y": {
                    encrypted += "D";
                    break;
                }
                case "z": {
                    encrypted += "b";
                    break;
                }

            }

        }
        return encrypted;
    }
}
