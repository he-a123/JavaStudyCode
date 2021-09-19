package day06;

public class NotebookComputer {
	public void Run(){
		System.out.println("笔记本运行");
	}
	public void useUSB(USB usb){
		if(usb != null){
			usb.Open();
			usb.Close();
		}
	}
	public void ShutDown(){
		System.out.println("笔记本关闭");
	}
}
 	 class Test1{
	 public static void main(String[] args) {
	 	//创建笔记本实体对象
	NotebookComputer Not = new NotebookComputer();
	//笔记本开机运行
	Not.Run();
	//创建鼠标实体对象
	Mouse mouse= new Mouse();
	//笔记本电脑使用鼠标
	Not.useUSB(mouse);
	//创建键盘实体对象
	keyBoard keyBoard = new keyBoard();
	//笔记本使用键盘
	Not.useUSB(keyBoard);
	//笔记本关机
	Not.ShutDown();
	}
}
//创建USB接口
interface USB{
	void Open();
	void Close();
}

class Mouse implements USB{
	public void Open(){
		System.out.println("鼠标开启");
	}

	@Override
	public void Close() {
		System.out.println("鼠标关闭");
	}
}
class keyBoard implements USB{
	@Override
	public void Open() {
		System.out.println("键盘开启");
	}

	@Override
	public void Close() {
		System.out.println("键盘关闭");
	}
}