package by.htp.classAndObj.task05;

public class Schetchik {
	/* 5. ������� �����, ����������� ���������� �������, ������� ����� ����������� ��� ��������� ���� �������� �� ������� � �������� ���������.
	 ������������� ������������� �������� ���������� �� ��������� � ������������� ����������. ������� ����� ������ ���������� � ����������
	 ���������, � ����� ����������� �������� ��� ������� ���������. �������� ���, ��������������� ��� ����������� ������. */
	
	private int minCount;
	private int maxCount;
	private int count;
	
	
	public Schetchik(int minCount,int maxCount,int count) {
		this.minCount=minCount;
		this.maxCount=maxCount;
		this.count = count;
	}

	public int getMinCount() {
		return minCount;
	}

	public void setMinCount(int minCount) {
		this.minCount = minCount;
	}

	public int getMaxCount() {
		return maxCount;
	}

	public void setMaxCount(int maxCount) {
		this.maxCount = maxCount;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "Schetchik [minCount=" + minCount + ", maxCount=" + maxCount + ", count=" + count + "]";
	}
	
	

}
