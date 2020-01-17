package lab3;

class People implements InPeople {
	 String name;
	 int iq;
	    int id;
	 People(String name, int iq, int id){
		 
			this.name = name;
		 
		 try {
			 setIQ(iq);
		 } catch (FalseIQException ex) {
			 System.out.println("��������� ��������� ��������!" + ex);
		 }
	     ID id2 = new ID(id);
	     this.id = id;
	 }

	

	 public void setIQ(int iq2) throws FalseIQException {
		 if (iq2<70) {
			 throw new FalseIQException("������� ������������ ���������� ������ �� " + iq2, iq2);
		 }else {
			 this.iq = iq2;
		 }
	 }
	 
	 private class ID {
		 int id;
		 
		 private ID (int id) {
			 this.id = id;
		 }
	 }
	 
	 public void param() {
		 System.out.println("�������� "+ name + " ��������");
	        System.out.println("���������: "+ iq +", ID:"+id);
	    }
}
