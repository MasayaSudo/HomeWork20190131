
public class While_Graph1 {
	public static void main(String[] args) {
//		int i = 0;
//		while (i < 10) {
//			int j = 0;
//			while (j < i * i) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println("");
//			i++;
//		}

				for (int i = 0; i < 10; i++) {
					for (int j = 0; j < i*i; j++) {// (j = i)にすることで、ループする（iの数値が増える）たびに"jの開始数値"が大きくなる
						System.out.print(j);//ヨコ
					}
					System.out.println("i");
				}
	}
}