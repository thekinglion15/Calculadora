/*
 * Created by Gabriel Alexander De León Lizardo
 * Matricula: 100479203
 * Copyright © 2021 Gabriel Alexander De León Lizardo. All rights reserved
 */
package prjcalculadora;

public class ClassCalculadora {
    private boolean estaLimpio;
    private double numero1, numero2, unico, resultado;
    private String operacion;

    public void PCalculaOperaciones()
    {
        switch(operacion)
        {
            //Aritmetica
            case "suma":
                resultado = numero1 + numero2;
            break;
            
            case "resta":
                resultado = numero1 - numero2;
            break;
            
            case "multiplicacion":
                resultado = numero1 * numero2;
            break;
            
            case "division":
                resultado = numero1 / numero2;
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
}
