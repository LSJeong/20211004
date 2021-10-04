package co.micol.prj;

import co.micol.prj.product.LgTV;
import co.micol.prj.product.MyPrint;
import co.micol.prj.product.Pencil4B;
import co.micol.prj.product.Pencil6B;
import co.micol.prj.product.SamsungTV;
import co.micol.prj.service.Pencil;
import co.micol.prj.service.RemoteController;
import co.micol.prj.tryexam.TryCatchTest;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) 
    {
        RemoteController tv = new SamsungTV();
//        SamsungTV tv = new SamsungTV();  //이렇게 선언하면 밑에 new LgtTV(); 하지못함(객체교환못함)
        tv.powerOn();
        tv.powerOff();
        
        tv = new LgTV();
        tv.powerOn();
        tv.powerOff();
        
        Pencil pencil = null;
        pencil = new Pencil4B();
        pencil.selectPencil();
        pencil.pencilInterface(); //Pencil 인터페이스가 가지고있는 기본 메소드
        
        pencil = new Pencil6B();
        pencil.selectPencil();
        
        pencil = new Pencil4B();
        pencil.selectPencil();
        
//        MyPrint myprint = new MyPrint();
//        myprint.powerOn();
//        myprint.selectPencil();
//        myprint.powerOff();
        
        RemoteController rc = new SamsungTV();

        TestInterface ts = new TestInterface(rc);
        
        rc = ts.rcReturn();
        rc.powerOn();
        rc.powerOff();
        //ts.toString();
        
        //위의 코드보다 밑에 코드로 더 많이 씀
        RemoteController rc1;
        TestInterface ts1 = new TestInterface(new LgTV());
        rc1 = ts1.rcReturn();
        rc1.powerOn();
        rc1.powerOff();
        
        MyPrint myPrint = new MyPrint(new Pencil4B());
        myPrint.toPrint();
        
        TryCatchTest trycatchTest = new TryCatchTest();
        try {
			trycatchTest.method1();  // 메소드1에서 throws exception 적어줬으니 받는쪽에 설정해줘야함
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			System.out.println("항상 실행하는 구문");
		}
    }
}
