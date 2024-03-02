class Std{
    String name,id,nid;
    double cgpa;
    public Std(String n,String i,double r ){
        name = n;
        id = i;
        cgpa = r;
    }
   public Std(){

   }
}
public class Stud {
    public static void main(String[] args) {
        Std S1 = new Std("Samin","23100712",3.96);
      Std S2 = new Std();
        System.out.println(S1.name+" " + S1.id+ " " +S1.cgpa +" "+S2 );

    }
}
