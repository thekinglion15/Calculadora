/*
 * Created by Gabriel Alexander De León Lizardo
 * Matricula: 100479203
 * Copyright © 2021 Gabriel Alexander De León Lizardo. All rights reserved
 */
package prjcalculadora;

import javax.script.*;

public class ClassCalculadora {
    private boolean estaLimpio;
    private double numero1, numero2, unico, resultado;
    private String operacion;
    private String formula;

    ScriptEngineManager libreria = new ScriptEngineManager();
    ScriptEngine evaluador = libreria.getEngineByName("JavaScript");

    public void PCalculaOperaciones()
    {
        switch(operacion)
        {
            //Aritmetica
            case "suma":
            case "resta":
            case "multiplicacion":
            case "division":
                try
                {
                    resultado = Double.parseDouble(evaluador.eval(formula).toString());
                }
                catch(Exception ex)
                {
                    System.out.println("Error: " + ex);
                }
                System.out.println("Llegue");
            break;
            
            case "potencia":
                resultado = Math.pow(numero1, numero2);
            break;
            
            case "cuadrado":
                resultado = Math.pow(unico, 2);
            break;
            
            case "cubo":
                resultado = Math.pow(unico, 3);
            break;
            
            case "raiz":
                resultado = Math.sqrt(unico);
            break;
            
            case "factorial":
                resultado = 1;
                
                for(int contador = 1; contador <= unico; contador++)
                    resultado *= contador;
            break;
            
            case "modulo":
                resultado = numero1 % numero2;
            break;
            
            //Trigonometria
            case "seno":
                resultado = Math.sin(unico);
            break;
            
            case "coseno":
                resultado = Math.cos(unico);
            break;
            
            case "tangente":
                resultado = Math.tan(unico);
            break;
            
            case "cotangente":
                resultado = 1.0 / Math.tan(unico);
            break;
            
            case "secante":
                resultado = 1.0 / Math.cos(unico);
            break;
            
            case "cosecante":
                resultado = 1.0 / Math.sin(unico);
            break;
            
            //Demas
            case "pi":
                resultado = Math.PI;
            break;
            
            case "e":
                resultado = Math.E;
            break;
            
            case "absoluto":
                if(unico < 0)
                {
                    resultado = 0 - unico;
                }
            break;
            
            case "reciproco":
                resultado = 1 / unico;
            break;
            
            case "diezpotenciax":
                resultado = Math.pow(10, unico);
            break;
            
            case "dospotenciax":
                resultado = Math.pow(2, unico);
            break;
            
            case "epotenciax":
                resultado = Math.pow(Math.E, unico);
            break;
            
            case "raizy":
                resultado = Math.pow(numero1, (1 / numero2));
            break;
            
            case "raizcubica":
                resultado = Math.pow(unico, 0.33333333333333333333333333333333);
            break;
            
            case "exp":
                resultado = Math.exp(unico);
            break;
            
            case "log":
                resultado = Math.log10(unico);
            break;
            
            case "ln":
                resultado = Math.log(unico);
            break;
            
            case "logbasey":
                resultado = Math.log10(numero1) / Math.log10(numero2);
            break;
            
            case "negativo":
                resultado = 0 - unico;
            break;
        }
    }
    
    public boolean PEstaLimpioGet() {
        return estaLimpio;
    }

    public void PEstaLimpioSet(boolean estaLimpio) {
        this.estaLimpio = estaLimpio;
    }

    public double PNumero1Get() {
        return numero1;
    }

    public void PNumero1Set(double numero1) {
        this.numero1 = numero1;
    }
    
    public double PNumero2Get() {
        return numero2;
    }

    public void PNumero2Set(double numero2) {
        this.numero2 = numero2;
    }
    
    public double PUnicoGet() {
        return unico;
    }

    public void PUnicoSet(double unico) {
        this.unico = unico;
    }

    public double PResultadoGet() {
        return resultado;
    }

    public void PResultadoSet(double resultado) {
        this.resultado = resultado;
    }

    public String POperacionGet() {
        return operacion;
    }

    public void POperacionSet(String operacion) {
        this.operacion = operacion;
    }
    
    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }
}

/* CODIGO DE LA FUNCION EVAL DE LA LIBRERIA DE JAVASCRIPT
public static double eval(final String str) {
    return new Object() {
        int pos = -1, ch;

        void nextChar() {
            ch = (++pos < str.length()) ? str.charAt(pos) : -1;
        }

        boolean eat(int charToEat) {
            while (ch == ' ') nextChar();
            if (ch == charToEat) {
                nextChar();
                return true;
            }
            return false;
        }

        double parse() {
            nextChar();
            double x = parseExpression();
            if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char)ch);
            return x;
        }

        // Grammar:
        // expression = term | expression + term | expression - term
        // term = factor | term * factor | term / factor
        // factor = + factor | - factor | ( expression )
        //        | number | functionName factor | factor ^ factor

        double parseExpression() {
            double x = parseTerm();
            for (;;) {
                if      (eat('+')) x += parseTerm(); // addition
                else if (eat('-')) x -= parseTerm(); // subtraction
                else return x;
            }
        }

        double parseTerm() {
            double x = parseFactor();
            for (;;) {
                if      (eat('*')) x *= parseFactor(); // multiplication
                else if (eat('/')) x /= parseFactor(); // division
                else return x;
            }
        }

        double parseFactor() {
            if (eat('+')) return parseFactor(); // unary plus
            if (eat('-')) return -parseFactor(); // unary minus

            double x;
            int startPos = this.pos;
            if (eat('(')) { // parentheses
                x = parseExpression();
                eat(')');
            } else if ((ch >= '0' && ch <= '9') || ch == '.') { // numbers
                while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                x = Double.parseDouble(str.substring(startPos, this.pos));
            } else if (ch >= 'a' && ch <= 'z') { // functions
                while (ch >= 'a' && ch <= 'z') nextChar();
                String func = str.substring(startPos, this.pos);
                x = parseFactor();
                if (func.equals("sqrt")) x = Math.sqrt(x);
                else if (func.equals("sin")) x = Math.sin(Math.toRadians(x));
                else if (func.equals("cos")) x = Math.cos(Math.toRadians(x));
                else if (func.equals("tan")) x = Math.tan(Math.toRadians(x));
                else throw new RuntimeException("Unknown function: " + func);
            } else {
                throw new RuntimeException("Unexpected: " + (char)ch);
            }

            if (eat('^')) x = Math.pow(x, parseFactor()); // exponentiation

            return x;
        }
    }.parse();
}
*/