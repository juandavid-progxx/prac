public class Estudiante {
    private final String id;
    private final String nombre;
    private float notas[];

    public Estudiante(String id, String nombre, int  notas){
        this.id =id;
        this.nombre=nombre;
        this.notas= new float [ notas];

    }
    public String Getid(){
        return id;
    }
    public String Getnombre(){
        return nombre;
    }
    public float[] GetNotas(){
        float []copia = new float [notas.length] ;
        for(int i=0; i<notas.length;i++){
            copia[i]=notas[i];
        }
        return copia;
    }
    public void setNota(int indice,float nota) throws Exception
    {if(indice<0){
        throw new Exception ("el indice no puede ser negativo");
    }
        if(indice>notas.length){
            throw new Exception ("el indice excede el tamaño del arreglo");
        }if(nota<0){
        throw new Exception ("la nota no puede ser menor que cero");
    }
        if(nota>5){
            throw new Exception ("la nota no puede ser mayor a 5");

        }
        notas[indice]=nota;
    }
}
