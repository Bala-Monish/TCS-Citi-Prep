class Overriding{  
int getRateOfInterest(){return 0;}  
}    
class SBI extends overriding{  
int getRateOfInterest(){return 8;}  
}  
  
class ICICI extends overriding{  
int getRateOfInterest(){return 7;}  
}  
class AXIS extends overriding{  
int getRateOfInterest(){return 9;}  
}   
class overridingtest{  
public static void main(String args[]){  
SBI s=new SBI();  
ICICI i=new ICICI();  
AXIS a=new AXIS();  
System.out.println("SBI Rate of Interest: "+s.getRateOfInterest());  
System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest());  
System.out.println("AXIS Rate of Interest: "+a.getRateOfInterest());  
}  
} 