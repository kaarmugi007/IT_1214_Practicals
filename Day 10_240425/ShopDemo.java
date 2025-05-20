import java.util.*;
class ShopDemo{
	static String description[] = {"Wheat Bread","Milk Powder","Tooth paste"};
	static int unitPrice[] = {160, 1060, 360};
	
	
	static byte[] itemBasketIndex = new byte[3];
	static int[] itemBasketQuantity = new int[3];
	static int[] itemBasketPrice = new int[3];
	static int basketIndex = 0;
	
	static void getItems(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome To the Demo Shop");
		System.out.println("Please Enter your item by entering the number");
		char userOption = 'y';
		
		
		do{
			for(int i=0; i<description.length; i++){
				System.out.println("Enter " + i + " for " + description[i]);
			}
			
			int itemIndex = sc.nextInt();
			
			System.out.println("You have choosen " + description[itemIndex]);
			System.out.println("Unit price of " + description[itemIndex] + " is " + unitPrice[itemIndex]);
			
			System.out.println("Number of " + description[itemIndex] + " you need: ");
			int numberOfUnits = sc.nextInt();
			itemBasketIndex[basketIndex] = (byte)basketIndex;
			itemBasketQuantity[basketIndex] = numberOfUnits;
			itemBasketPrice[basketIndex] = numberOfUnits*unitPrice[itemIndex];
			
			basketIndex++;
			
			
			
			System.out.println("Enter y to continue, press anything to Exit");
			Scanner sc1 = new Scanner(System.in);
			userOption = sc1.nextLine().charAt(0);//(char)sc.nextLine();
		}
		while((userOption == 'y' || userOption == 'y') && basketIndex < 3);
	}
	
	static void showBasket(){
		System.out.println("No \t Item \t\t unit Price \t\t Quantity \t Price");
		for(int i=0; i<basketIndex; i++){
			System.out.println((i+1)+"\t"+description[itemBasketIndex[i]]+"\t\t"+unitPrice[itemBasketIndex[i]]+"\t\t"+itemBasketQuantity[i]+"\t\t"+itemBasketPrice[i]);
		}
	}
	
	
	public static void main(String[] args){
		getItems();
		showBasket();
	}
}