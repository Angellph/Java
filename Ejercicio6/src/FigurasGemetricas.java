
public class FigurasGemetricas {
    public float dato1;
    public float dato2;
    public float dato3;
    
    
    public float CalcularArea(float radio){
        //Perimetro del circulo
        float area = (float) (Math.pow(radio, 2)*Math.PI);
        return area;
        
        
    }
    public float CalcularPerimetro(float radio){
        //perimetro del circulo
        float perimetro = (float) (2*Math.PI*radio);
        return perimetro;
        
    }
    public float CalcularArea(float base, float altura){
        //Area del rectangulo
        float area = base * altura;
        return area; 
        
    }
    public float CalcularPerimetro(float base, float altura){
        //perimetro del rectangulo
        float perimetro = 2 * base + 2 * altura;
        return perimetro;
    }
    public float CalcularArea(double lado){
        //area del cuadrado 
        double area = lado * lado;
        return (float) (double) area;
        
        
    }
    public float CalcularPerimetro(double lado){
        //perimetro del cuadrado
        double  perimetro = lado * 4;
        return (float) perimetro;
        
        
    }
    public float CalcularArea(float Bmayor, float bMenor, float Altura){
        //area del trapecio
        return 0;
        
        
    }
    public float CalcularPerimetro(float Bmayor, float bMenor, float Altura){
        
        return 0;
    }
            
            
            
    
       
}
