public class MultipleMain {
	
	public static void main(String[] args) {
	       main(122);
	       main(true);
	       main("hello java");
	   }

	   public static void main(int args){
	       System.out.println("Overloaded main() " + args);
	   }

	   public static void main(boolean args){
	       System.out.println("Overloaded main() " + args);
	   }

	   public static void main(String args){
	       System.out.println("Overloaded main() " + args);
	   }
}
