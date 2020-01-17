package lab3;

class Probability implements InProb {
	String name;
	 double zn;
	 Probability(String name, double zn){
		 this.name = name;
		 this.zn = zn;
	 }
	 public void veroiatn() {
		 System.out.println("Вероятность "+ name + " определена");
	        System.out.println("Математическое значение: "+ zn);
	    }

}
