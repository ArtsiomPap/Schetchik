package by.htp.classAndObj.task05;

public class SchetcikLogic {

	public Schetchik uvelichenie(Schetchik schetchik) {
		if (schetchik.getCount() < schetchik.getMaxCount() & schetchik.getCount() > schetchik.getMinCount()) {
			schetchik.setCount(schetchik.getCount() + 1);
		} else {
			System.out.println("выход за пределы");
		}

		return schetchik;

	}

	public Schetchik umenshenie(Schetchik schetchik) {
		if (schetchik.getCount() < schetchik.getMaxCount() & schetchik.getCount() > schetchik.getMinCount()) {
			schetchik.setCount(schetchik.getCount() - 1);
		} else {
			System.out.println("выход за пределы");
		}

		return schetchik;

	}

	public void tekuscheeZnachenie(Schetchik schetchik) {
		System.out.print("Текущее значение счетчика" + schetchik.getCount());
		System.out.println();

	}
}
