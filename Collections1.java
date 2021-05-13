package Collections;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Collections1 {

	public static void main(String[] args) {
		
		System.out.println("Estoque da loja Online");
		
		String prod1 = "Nike Air Force One";
		String prod2 = "Nike KD";
		String prod3 = "Nike Jordan";
		String prod4 = "Nike Kobe";
		
		ArrayList<String> prods = new ArrayList<>();
		prods.add(prod1);
		prods.add(prod2);
		prods.add(prod3);
		prods.add(prod4);
			
		System.out.println(prods);
		prods.remove(1);
		System.out.println(prods);
		
	}

}
