package lab3;

public class Actions {
	String act1;
	String answer;
	Actions (String act){
		System.out.println("�������� "+act+" ����������");
		act1=act;
	}
	Actions (String act, Pokor p){
		System.out.printf("��� ���������: ", p);
		act1=act;
        switch(p){
            case RASTOPLENIE:
                System.out.println("����������� ������ �����");
                break;
            case BURENIE:
                System.out.println("������������ �������");
                break;
            case POISK:
                System.out.println("����� �������� ����������");
                break;
                
                
        }
        
        
		 
	}
	@Override
    public String toString() {
        if (act1 == null) {
        	answer="��� ������ �����";
        } else {
        	answer=act1;
        }
		return answer;
    }
}


