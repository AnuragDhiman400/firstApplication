package firstApplication;

public class game {
	public static void main(String args[]) {
		score obj = new score();
		int basket1 = obj.basket1();
		int basket2 = obj.basket2();
		int basket3 = obj.basket3();
		System.out.println(basket1);
		System.out.println(basket2);
		System.out.println(basket3);
		
	
	}
} 

 class score {
      
     public int basket1(){
    	  int outsideTheArc = 3;
    	  return outsideTheArc;
      }
      
     public int basket2(){
    	  int insideTheArc = 2;
    	  return insideTheArc;
      }
      
     public int basket3(){
    	  int freeThrows = 1;
    	  return freeThrows;
      }
      
}



