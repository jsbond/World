/*
новая бабочка
 */
public class AntonButterflyNEW {
    public static void main(String[] args) {

        int matrica[][] = new int[6][6];

        int length = matrica.length;  //узнаем размер матрицы
        int v = length-2; //переменная используется для заполнения j с обратной стороны

        for (int i = 0; i <= length; i++) {

            //заполняет верхную часть матрицы
            if (i <= length / 2) {
                for (int j = 0; j < i+1; j++) {
                    matrica[i][j] = 1;
                }
                for (int j = length-1; j > v; j--) {
                    matrica[i][j] = 1;
                }
            }

            //заполняет нижнюю часть матрицы
            else {
                for (int j = i; j < length; j++) {
                    matrica[i][j] = 1;
                }
                for (int j = v+1; j >= 0; j--) {
                    matrica[i][j] = 1;

                }
            }

            v -= 1;
        }

            // выводит матрицу на экран
            for (int i = 0; i < length; i++) {
                for (int j = 0; j < length; j++) {
                    System.out.print(matrica[i][j]);
                }
                System.out.println();
            }
    }
}