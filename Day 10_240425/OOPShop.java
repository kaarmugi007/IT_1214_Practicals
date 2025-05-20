class Item{
	String description;
	int unitPrice;
	
	Item(String desc, int uPrice){
		description = desc;
		unitPrice = uPrice
	}
}

class Basket{
	Item itm[5];
	
	void addItem(item i){
		
	}
	
	void calculatePrice(){
		
	}
}

class ShopDEMO{
	public static void main(String[] args){
		Item[] itemList = new Item[10];
		
		Basket basket1 = new Basket();
		char input = 'y';
		int i = 0;
		do{
			String desc = sc.nextLine();
			int up = sc.nextInt();
			itemList[i] = new Item(desc,up);
			i++;
		}
		while();
	}
}