package src;//x��y�Ĺ�ϵ�������£�
//�����>=3,��ôy = 2x+1
//���1<x<3,��ôy=2x;
//���x<=-1,��ôy = 2x - 1;

public class  Demo04IfElseExt
{
	public static void main(String[] args) 
	{
		//int x = 10;
		//int x = 2;
		int x = -10;
		int y;
		if (x >= 3){
			y = 2 * x +1;}
			else if (x >3 && x>1){
				y = 2*x;}
				else {
					y = 2*x -1;}
			System.out.println("����� ��" + y);
	}
}


			
			
		
		