/*
 * Created by Gabriel Alexander De León Lizardo
 * Matricula: 100479203
 * Copyright © 2021 Gabriel Alexander De León Lizardo. All rights reserved
 */
package prjcalculadora;

import javax.script.*;

public class PrjCalculadora {

    public static void main(String[] args) throws ScriptException {
        /*FrmCalculadora ObjCal = new FrmCalculadora();
        ObjCal.setVisible(true);
        */
        
        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");
        String foo = "2+2*5-4/9*6+2/8";
        System.out.println(engine.eval(foo));
    
        
        
    }
}
