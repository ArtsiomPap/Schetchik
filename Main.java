package by.htp.classAndObj.task05;

public class Main {
	public static void main (String [] args) {
		
		
Schetchik schetchik= new Schetchik(5,10,6);

System.out.println(schetchik);

SchetcikLogic schetchikLogic= new SchetcikLogic();

schetchikLogic.uvelichenie(schetchik);
schetchikLogic.uvelichenie(schetchik);
schetchikLogic.uvelichenie(schetchik);



schetchikLogic.umenshenie(schetchik);

schetchikLogic.tekuscheeZnachenie(schetchik);


}

	

}
