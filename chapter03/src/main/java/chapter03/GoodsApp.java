package chapter03;

public class GoodsApp {

	public static void main(String[] args) {
		// static 실험
		Goods camera = new Goods();
		Goods camera1 = new Goods();
		Goods camera2 = new Goods();
		System.out.println(Goods.countOfGoods);
		
//		camera.name = "nikon";
		camera.setName("nikon");
//		camera.price = 400000;
		camera.setPrice(400000);
//		camera.countStock = 30;
		camera.setCountStock(30);
//		camera.countSold = 50;
		camera.setCountSold(50);
		
		// 정보은닉(데이터보호)
//		camera.setPrice(-1);
		

		System.out.println("상품이름 : " + camera.getName() + ", 가격 : " + camera.getPrice() + ", 재고개수 : " + camera.getCountStock()
				+ ", 팔린 개수 : " + camera.getCountSold());
	}

}
