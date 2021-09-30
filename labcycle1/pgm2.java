class rectangle{
    double length;
    double breadth;
    void setdata(double a,double b){
length=a;
breadth=b;
    }
    double getarea(){
        double area;

        area= length*breadth;
        return area;
    }
}


public class pgm2 {
    public static void main(String args[]){
        
        rectangle r1=new rectangle();
        rectangle r2=new rectangle();
        rectangle r3=new rectangle();
        r1.setdata(12.4,13);
        r2.setdata(10.5,9);
        r3.setdata(13.0,14);
        
       System.out.println("area1="+ r1.getarea());
       System.out.println("area2="+r2.getarea());
       System.out.println("area3="+r3.getarea());
    }
    
}
