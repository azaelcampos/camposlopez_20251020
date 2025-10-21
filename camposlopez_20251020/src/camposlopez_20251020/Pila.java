/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package camposlopez_20251020;

/**
 *
 * @author UFG
 */
public class Pila {
    
    private int[] elementos;
    private int cima;
    private int capacidad;
    
    //METODO CONSTRUCTOR DE LA CLASE PILA
    //AL INSTANCIAR UNA NUEVA VARIABLE DE TIPO PILA, ENTONCES
    //SE CREARA EN MEMORIA UN BOJETO CON LOS ATRIBUTOS QUE ESTAN
    //DENTRO DE ESTE CONSTRUCTOR
    public Pila(int tamano){
        
        this.capacidad = tamano;//CANTIDAD DE ELEMENTOS QUE SE VAN A ALMACENAR EN LA PILA
        this.elementos = new int[this.capacidad];//SE CREA UN NUEVO ARREGLO DE TIPO ENTERO
        this.cima = -1;//EL VALO0R POR DEFECTO DE LA CIMA ES-1 (VACIA)
        
        
        
      
    }
    //METODO PARA VERIFICAR SI LA FILA ESTA VACIA, ES DECIR  SI NO HAY ELEMENTOS
    //O VALORES APILADOS
    public boolean estaVacia(){
        
        if (this.cima== -1){
            return true;
        }else{
            return false;
        }
        
    }
    //METODO PARA VERIFICAR SI LA PILA ESTA LLENA, DE ESTA MANERA TOMAR LA DECISION
    //DE NO SEGUIR ALIMENTANDO LA PILA
    public boolean estaLlena(){
        
        if (this.cima == (this.capacidad - 1)){
            //EL VALOR DE LA  CIMA ES IGUAL A LA CANTIDAD DE ELEMENTOS
            return true;
        }else{
            //EL VALOR  DE LA CIMA ES DIFERENTE  A LA CANTIDAD  DE ELEMENTOS
            return false;
            
        }
    }
    
    //DEVUELVE EL VALOR DE LA CIMA, ES DECIR  EL VALOR  DE EL ULTIMO ELEMENTO
    //QUE  FUE INSERTADO  AL ARREGLO
    public int tamano(){
        return this.cima + 1;
    }
    //METODO PARA AGREGAR ELEMENTOS AL ARREGLO, ES DECIR A LA PILA
    //PRIMEROS SE DEBE REALIZAR LA VERIFICACION DEL TAMAÑO DE LA PILA
    //UNA VEZ VERIFICADA SE PUEDE AGREGAR EL ELEMENTO AL ARREGLO
    public void push(int elemento){
        //PRIMERO SE VERIFICA SI LA PILA ESTA LLENA
        if(estaLlena()){
            System.out.println("La pila esta llena, no puede agregar el valor: "+elemento);
            //return;
        }else{
            this.cima++;//SE INCREMENTA  EL VALOR DE LA CIMA
            this.elementos[this.cima] = elemento;//SE AGREGA EL NUEVO ELEMENTO AL ARREGLO (A LA PILA)
            System.out.println("El valor:"+elemento+" fue agregado a la pila");
        }
    }
    
    public int pop(){
        
        if(estaVacia()){
            System.out.println("La pila esta vacia, no puede hacer la extraccion del elemento");
            return -1;
        }else{
            int elementoExtraido = this.elementos[this.cima];// LA NUEVA VARIABLE POSEE EL VALOR DEL ULTIMO ELEMENTO INSERTADO AL ARREGLO
            this.cima--;//SE REDUCE  EL VALOR  DE LA CIMA DEBIDO A QUE YA SE EXTRAJO UN ELEMENTO.
            return elementoExtraido;//SE DEVUELVE  AL USUARIO EL VALOR  QUE FUE EXTRAIDO
        }
    }
    
    //METODO PARA VERIFICAR EL ULTIMO VALOR INSERTADO ES DECIR, EL VALOR QUE SE PUEDE
    //EXTRAER DE LA PILA
    public int  peek(){
        //SE VERIFICA SI ESTA VACIA
        if(estaVacia()){
            //SI ESTA VACIA POR LO TANTO, SE MUESTRA MENSAJE AL USUARIO
            System.out.println("La pila esta vacia");
            return -1;
        }else{
            return this.elementos[this.cima];
        }
    }
    
    public void mostrar(){
        
        if (estaVacia()){
            System.out.println("La pila esta vacia");
            
        }else{
            System.out.print("Contenido de la pila (desde la cima, hasta  la base de la pila)");
            System.out.print("[");
            //SE DEBE RECORRER EL ARREGLO DE LA PILA PARA PODER IMPRIMIR CADA VALOR
            //EN LA ESTRUCTURA ITERATIVA DE INICIO DESDE EL VALOR  DE LA CIMA, ES DECIR
            //DESDE  LA ULTIMA POSICION AGREGADA AL ARREGLO, MIENTRAS EL VALOR DE "i" SEA
            //MAYOR QUE CERO (ES DECIR  QUE AUN NO HA LLEGADO A LA BASE  DE LA PILA), EL VALOR
            //DE "i"  ESTARA EN DECREMENTO  HASTA LLEGAR A CERO
            for (int i = this.cima; i >=0; i--){
                //SE IMPRIME CADA VALOR EN SU POSICION CORRESPONDIENTE DE MANERA CONTINUA (SIN SALTOS DE LINEA)
                System.out.print(this.elementos[i]);
                //SE VERIFICA  SE EL VALOR DE LA "i"ES MAYOR  QUE CERO PARA PODER IMPRIMIR UN CARACTER
                if (i > 0){
                    //"i" NO HA LLEGADO A CERO, POR LO TANTO, SE PUEDE IMPRIMIR UNA COMA
                    System.out.print(",");//SE IMPRIME UNA COMA
                }
            }
            //SE CIERRA LA ESTRUCTURA DE CORCHETE PARA LA SALIDA DEL USUARIO FINAL
            System.out.print("]");
        }
    }
    
    
}
