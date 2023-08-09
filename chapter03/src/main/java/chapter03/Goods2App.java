package chapter03;

public class Goods2App {

	public static void main(String[] args) {
		Goods2 good = new Goods2();
		good.name = "camera";
		System.out.println(good.name);       // public
		good.price = 10;
		System.out.println(good.price);      // protected
		good.countStock = 10;
		System.out.println(good.countStock); // default
	}

}
