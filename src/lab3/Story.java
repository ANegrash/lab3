package lab3;

public class Story {
	public void play() {
    }

	public static void main(String[] args) {
        Story startS = new Story() {
            @Override
            public void play() {
				System.out.println("Создание объектной модели начато...");
            }
        };

		System.out.println();
        startS.play();
		System.out.println();
	        InPeople pers = new People("автор", 154, 1);
			pers.param();
			pers = new People("учёный мир", 0, 2);
			pers.param();
			pers = new People("многие", 92, 3);
			pers.param();
			pers = new People("ловкачи", 100, 4);
			pers.param();
			pers = new People("искусствоведы", 99, 5);
			pers.param();
			pers = new People("гении науки", 148, 6);
			pers.param();
			pers = new People("коллеги", 150, 7);
			pers.param();
			
	        System.out.println();
	        
	        InProb prob = new Probability("явно", 1.0);
	        prob.veroiatn();
	        prob = new Probability("возможно", 0.4);
	        prob.veroiatn();
	        prob = new Probability("фантастический", 0.01);
	        prob.veroiatn();
	        System.out.println();

	        Objects sovet = new Objects("совет");
	        Objects docs = new Objects("доказательства");
	        Objects rasskaz = new Objects("рассказ");
	        Objects photos = new Objects("фотографии");
	        Objects paint = new Objects("зарисовка");
	        Objects libertyThink = new Objects("независимость мысли");
	        Objects myths = new Objects("первобытные мифы");
	        Objects weight = new Objects("достаточный вес (образно)");
	        Objects program = new Objects("разработка программ");
	        System.out.println();
	        
	        Actions want = new Actions("хочет");
	        Actions pokor = new Actions("покорение");
	        Actions pokor1 = new Actions("покорение", Pokor.RASTOPLENIE);
	        Actions pokor2 = new Actions("покорение", Pokor.BURENIE);
	        Actions pokor3 = new Actions("покорение", Pokor.POISK);
	        Actions somnen = new Actions("поселение сомнения");
	        Actions podtv = new Actions("подтверждение");
	        Actions poddel = new Actions("подделывать");
	        Actions think = new Actions("думать");
	        Actions have = new Actions("обладать");
	        Actions stop = new Actions("приостановить");
	        System.out.println();
	        
	        Places antarktic = new Places("антарктика");
	        Places air = new Places("воздух");
	        Places hrebty = new Places("\"Хребты безумия\"");
	        Places bytie = new Places("область бытия");
	        System.out.println();
	        
	        Status nenuz = new Status("ненужен");
	        Status pravd = new Status("правдивость");
	        Status neizvest = new Status("неизвестен");
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




		System.out.println(lyambdaTime + "мс - время выполнения лямбда-выражения ");
		System.out.println(notLyambdaTime + "мс - время выполнения обычного кода ");



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