package Education;

public class class_ {
    int a,b;
    class_(int i,int j){
        a=i;
       b=j;
    }
    public void change(class_ c){
        c.a= c.a+c.b;
        c.b= -c.b;
    }

}
