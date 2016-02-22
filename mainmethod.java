
public class mainmethod {

	public static void main(String[] args) {
			
		int [] inp = {45,23,11,89,77,98,4,28,65,43};
		
		sort s = new sort();
		for(int i:inp){
            System.out.print(i);
            System.out.print(" ");
        }
		s.insertion(inp);
		System.out.println("After Sorting");
        for(int i:inp){
            System.out.print(i);
            System.out.print(" ");
        }
	}
}
