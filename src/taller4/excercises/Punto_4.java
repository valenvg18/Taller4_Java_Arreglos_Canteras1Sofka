package taller4.excercises;

public class Punto_4 {
    private final int[][] myArray = new int[4][5];

    public int[][] myArrayInput(){
        this.myArray[0][0] = 1;
        this.myArray[0][1] = 2;
        this.myArray[0][2] = 3;
        this.myArray[0][3] = 4;
        this.myArray[0][4] = 5;
        this.myArray[1][0] = 6;
        this.myArray[1][1] = 7;
        this.myArray[1][2] = 8;
        this.myArray[1][3] = 9;
        this.myArray[1][4] = 10;
        this.myArray[2][0] = 11;
        this.myArray[2][1] = 12;
        this.myArray[2][2] = 13;
        this.myArray[2][3] = 14;
        this.myArray[2][4] = 15;
        this.myArray[3][0] = 16;
        this.myArray[3][1] = 17;
        this.myArray[3][2] = 18;
        this.myArray[3][3] = 19;
        this.myArray[3][4] = 20;
        return this.myArray;
    }

    public void a(){
        for (int i = 0; i < this.myArray.length; i++){
            for (int j = 0; j < this.myArray[i].length; j++){
                System.out.println((i) + "" + (j));
            }
        }
    }
}
