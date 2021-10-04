package co.micol.prj.product;

import co.micol.prj.service.Pencil;
import co.micol.prj.service.RemoteController;

public class MyPrint implements RemoteController{

	//다중상속했을때
//	@Override
//	public void selectPencil() {
//		System.out.println("4B");
//
//	}

	//다중상속 빼버렸을때
	private Pencil pencil;
	
	public MyPrint(Pencil pencil) {
		this.pencil = pencil;
	}
	
	public void toPrint() {
		System.out.print("나는 ");
		pencil.selectPencil();
	}
	
	@Override
	public void powerOn() {
		System.out.println("프린트 전원을 켠다.");

	}

	@Override
	public void powerOff() {
		System.out.println("프린트 전원을 끈다.");

	}

}
