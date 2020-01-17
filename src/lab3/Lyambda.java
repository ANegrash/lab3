package lab3;

public class Lyambda {
    int[] m = new int[99999999];
    Operationable operation;
    Lyambda (int i){

        operation = (x,y)->x*y;

        m[i] = operation.calculate(i, 20);
    }

}

