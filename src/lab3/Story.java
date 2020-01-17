package lab3;

public class Story {
	public void play() {
    }

	public static void main(String[] args) {
        Story startS = new Story() {
            @Override
            public void play() {
				System.out.println("�������� ��������� ������ ������...");
            }
        };

		System.out.println();
        startS.play();
		System.out.println();
	        InPeople pers = new People("�����", 154, 1);
			pers.param();
			pers = new People("������ ���", 0, 2);
			pers.param();
			pers = new People("������", 92, 3);
			pers.param();
			pers = new People("�������", 100, 4);
			pers.param();
			pers = new People("�������������", 99, 5);
			pers.param();
			pers = new People("����� �����", 148, 6);
			pers.param();
			pers = new People("�������", 150, 7);
			pers.param();
			
	        System.out.println();
	        
	        InProb prob = new Probability("����", 1.0);
	        prob.veroiatn();
	        prob = new Probability("��������", 0.4);
	        prob.veroiatn();
	        prob = new Probability("��������������", 0.01);
	        prob.veroiatn();
	        System.out.println();

	        Objects sovet = new Objects("�����");
	        Objects docs = new Objects("��������������");
	        Objects rasskaz = new Objects("�������");
	        Objects photos = new Objects("����������");
	        Objects paint = new Objects("���������");
	        Objects libertyThink = new Objects("������������� �����");
	        Objects myths = new Objects("����������� ����");
	        Objects weight = new Objects("����������� ��� (�������)");
	        Objects program = new Objects("���������� ��������");
	        System.out.println();
	        
	        Actions want = new Actions("�����");
	        Actions pokor = new Actions("���������");
	        Actions pokor1 = new Actions("���������", Pokor.RASTOPLENIE);
	        Actions pokor2 = new Actions("���������", Pokor.BURENIE);
	        Actions pokor3 = new Actions("���������", Pokor.POISK);
	        Actions somnen = new Actions("��������� ��������");
	        Actions podtv = new Actions("�������������");
	        Actions poddel = new Actions("�����������");
	        Actions think = new Actions("������");
	        Actions have = new Actions("��������");
	        Actions stop = new Actions("�������������");
	        System.out.println();
	        
	        Places antarktic = new Places("����������");
	        Places air = new Places("������");
	        Places hrebty = new Places("\"������ �������\"");
	        Places bytie = new Places("������� �����");
	        System.out.println();
	        
	        Status nenuz = new Status("�������");
	        Status pravd = new Status("�����������");
	        Status neizvest = new Status("����������");
	        System.out.println();


		long startTNL = System.currentTimeMillis();
		for (int i=0; i<100; i++){
			SimpleCode sc = new SimpleCode(i);

		}
		long finishTNL = System.currentTimeMillis();
		long notLyambdaTime = finishTNL - startTNL;


		long startTL = System.currentTimeMillis();
		for (int i=0; i<100; i++){
			Lyambda lm = new Lyambda(i);

		}
		long finishTL = System.currentTimeMillis();
		long lyambdaTime = finishTL - startTL;




		System.out.println(lyambdaTime + "�� - ����� ���������� ������-��������� ");
		System.out.println(notLyambdaTime + "�� - ����� ���������� �������� ���� ");



	    }

	
	@Override
	public int hashCode() {
		final int prime = 21;
		int result = 2;
		result = prime * result;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		return true;
	}
}