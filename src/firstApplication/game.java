package firstApplication;

//public class game {
//	public static void main(intargs[]) {
//		score obj = new score();
//		intbasket1 = obj.basket1();
//		intbasket2 = obj.basket2();
//		intbasket3 = obj.basket3();
//		System.out.println(basket1);
//		System.out.println(basket2);
//		System.out.println(basket3);
//		
//	
//	}
//} 


 public class game {
      public int sum=0;
      public int sum1=0;
     public int basket1(){
    	  int outsideTheArc = 3;
    	   sum = sum+outsideTheArc;
    	  return sum;
      }
     public int basket4(){
   	  int outsideTheArc = 3;
   	   sum1 = sum1+outsideTheArc;
   	  return sum1;
     }
      
     public int basket2(){
    	  int insideTheArc = 2;
    	   sum = sum+insideTheArc;
    	  return sum;
      }
     public int basket5(){
   	  int insideTheArc = 2;
   	   sum1 = sum1+insideTheArc;
   	  return sum1;
     }
      
     public int basket3(){
    	  int freeThrows = 1;
    	   sum = sum+freeThrows;
    	  return sum;
      }
     public int basket6(){
   	  int freeThrows = 1;
   	   sum1 = sum1+freeThrows;
   	  return sum1;
     }
      
}



