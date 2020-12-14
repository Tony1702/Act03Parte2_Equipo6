package Caso4;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Context {
	
    private Map<String, List<Object>> tablas;
    private String tabla;
    private String columna;
    private String columnaWhere;
    private String condicionWhere;

    public Context(Map<String, List<Object>> tablas) {
        this.tablas = tablas;
    }    

    public void setColumna(String columna) {
        this.columna = columna;
    }

    public void setTabla(String tabla) {
        this.tabla = tabla;
    }

    public void setCondicion(String columna, String condicion) {
        this.columnaWhere = columna;
        this.condicionWhere = condicion;
    }
    
    private void clear() {
        tabla = columna = columnaWhere = condicionWhere = null;
    }

    public List<String> buscar() {        
        if (columna != null && tabla != null){
            try {
                List<String> result = new ArrayList();
                List<Object> tabObjects = tablas.get(tabla);
                if(columna.equals("*") && columnaWhere==null && condicionWhere==null)
                    return result.getClass().cast(tabObjects);
                Class clase = tabObjects.get(0).getClass();
                String getColumna=null, getColumnaWhere=null;
                Method metProyeccion=null,metCondicion=null;
                if(!columna.equals("*")){
                    getColumna = "get"+columna.substring(0,1).toUpperCase()+columna.substring(1);
                    metProyeccion = clase.getMethod(getColumna, (Class[]) null);                    
                }
                if(columnaWhere!=null && condicionWhere!=null){
                    getColumnaWhere = "get"+columnaWhere.substring(0,1).toUpperCase()+columnaWhere.substring(1);
                    metCondicion = clase.getMethod(getColumnaWhere, (Class[])null);
                }                
                for (Object tabObject : tabObjects) {
                    if(!columna.equals("*")){
                        if (condicionWhere!=null && columnaWhere!=null){
                            if (metCondicion.invoke(clase.cast(tabObject), (Object[]) null).toString().equals(condicionWhere))
                                result.add(metProyeccion.invoke(clase.cast(tabObject), (Object[]) null).toString());                                                    
                        }
                        else
                            result.add(metProyeccion.invoke(clase.cast(tabObject), (Object[]) null).toString());                        
                    }
                    else{
                        if (condicionWhere!=null && columnaWhere!=null){
                            if (metCondicion.invoke(clase.cast(tabObject), (Object[]) null).toString().equals(condicionWhere))
                                result.add(tabObject.toString());      
                        }
                    }
                }
                clear();
                return result;
            } 
            catch (Exception ex ) {
                System.out.println("Error al acceder los datos");
            }
        }
        return null;       
    }  
}
