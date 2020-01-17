package lab3;

public class Actions {
	String act1;
	String answer;
	Actions (String act){
		System.out.println("Действие "+act+" определено");
		act1=act;
	}
	Actions (String act, Pokor p){
		System.out.printf("Вид покорения: ", p);
		act1=act;
        switch(p){
            case RASTOPLENIE:
                System.out.println("растопление вечных льдов");
                break;
            case BURENIE:
                System.out.println("повсеместное бурение");
                break;
            case POISK:
                System.out.println("поиск полезных ископаемых");
                break;
                
                
        }
        
        
		 
	}
	@Override
    public String toString() {
        if (act1 == null) {
        	answer="Нет такого места";
        } else {
        	answer=act1;
        }
		return answer;
    }
}


