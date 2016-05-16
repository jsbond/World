/*
новая бабочка
 */
public class Butterfly {

    //четное количество столбцов в матрице или нет
    private static boolean isEvenMatrix;

    public static void main(String[] args) {

        int matrix[][] = new int[7][7];
        int length = matrix.length;  //узнаем размер матрицы
        isEvenMatrix = length % 2 == 0;

        int leftBorder = 0;
        int rightBorder = length - 1;

        for (int row = 0; row < length; row++) {
            for (int column = 0; column < length; column++) {
                if (isWingElement(column, leftBorder, rightBorder)) {
                    matrix[row][column] = 1;
                }
            }

            //после прохода по строке, смещаем границы крайних элементов.
            //крайние элементы нужны для метода isWingElement()
            leftBorder = getLeftBorder(leftBorder, row, length / 2);
            rightBorder = (length - 1) - leftBorder;
        }

        print(matrix);
    }

    //определяем, нужно ли записывать 1 в элемент
    private static boolean isWingElement(int element, int leftBorder, int rightBorder) {
        return (element <= leftBorder) || (element >= rightBorder);
    }

    private static int getLeftBorder(int leftBorder, int row, int centralRow) {
        if (row < centralRow) {
            leftBorder++;
        }

        // это так называемый тернарный оператор.
        // до ? - условие, после ? до : - выполнится, если условие true, после : - выполнится, если условие false
        int borderForDecrement = isEvenMatrix ? centralRow - 2 : centralRow - 1;

        if (row > borderForDecrement)  {
            leftBorder--;
        }
        return leftBorder;
    }

    private static void print(int[][] matrix) {
        // выводит матрицу на экран
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}