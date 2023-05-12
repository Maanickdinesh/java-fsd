
public class sleepdemo {
	 private static Object obj1 = new Object();
     
	public static void main(String[] args)throws InterruptedException    {
		// TODO Auto-generated method stub
		//pause process for two seconds  
        Thread.sleep(2000);   
          
        //print custom statement  
        System.out.println( Thread.currentThread().getName() +   
        " Thread is woken after two second");   
          
        //create synchronizec context from which we call Wait() method  
        synchronized (obj1)
        	{   
            //use wailt() method to set obj in waiting state for two seconds  
            obj1.wait(2000);   
  
            System.out.println(obj1 + " Object is in waiting state and woken after 2 seconds");   
        }    
	}
	}

/*
output 
main Thread is woken after two second 
java.lang.Object@1c4af82c Objectis in waiting state and woken after 2 seconds
*/