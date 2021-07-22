import java.io.*;

class multi{  
  void m(){  
    p();//checked exception  
  }  
  void n(){  
    m();  
  }  
  void p(){  
   try{  
    n();  
   }catch(Exception e){System.out.println("exception handeled");}  
  }  
  public static void main(String args[]){  
   multiexce obj=new multiexce();  
   obj.p();  
   System.out.println("normal flow");  
  }  
}  