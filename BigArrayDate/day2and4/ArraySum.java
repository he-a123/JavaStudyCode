package src;

public class ArraySum{

	public static void main(String[] args) {

		int[][] arr = {{11,12},{21,22,23},{31,32,33,34}};
		int sum = 0;
		int groupsum = 0;
		for(int i = 0; i < arr.length; i ++ ){
			for(int j = 0; j <arr[i].length; j++){
				groupsum += arr[i][j];
			}
			System.out.println("ÿ��С����ܽ���ǣ�" + groupsum);
			sum +=groupsum;
			groupsum = 0;
		}
			
			System.out.println("��˾�ܽ���ǣ�" + sum);
		
	}
}
