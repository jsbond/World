/*
вторая бабочка с единицами и гемором в четных матрицах
 */
public class AntonButterfly2 {
    public static void main(String[] args) {

        //программа с динамическими переенными, т.е. нужно только задать размер матрицы
        int matrica[][] = new int [7][7];
        int i, j, h = 0; //переменные для цикла
        int k = 1; //для заполнения второй диагонали
        double m = matrica.length /2; //чтобы найти середину матрицы и закончить цикл
        int d = matrica.length;

//принцип программы: матрица заполняется частями (всего их 4ре)


        //цикл заполняет первую часть матрицы (левый верхний угол от середины)
        for (i = 0; i < d; i++) {

            if (i <= m) {
                    for (j = 0; j < k; j++) {
                    matrica[i][j] = 1;
                    }
                k = k + 1;
            }
        }


        k = 1; //для того, чтобы строки заполнялись корректно после предыдущего цикла


//цикл заполняет вторую часть матрицы (левый нижний угол от середины)
        for (i = d-1; i > 1 ; i--) {
            if (i>=m) {
                for (j = 0; j < k; j++) {
                    matrica[i][j] = 1;
                    }
                k = k+1;
            }
        }

        k = d-2; //для того, чтобы строки заполнялись корректно после предыдущего цикла

//цикл заполняет третью часть матрицы (правый нижний угол от середины)
        for (i = d-1; i >1 ; i--) {

            if (i>=m) {
                for (j = d-1; j > k; j--) {
                    matrica[i][j] = 1;
                }
                k = k - 1;
            }
        }

        k = d-2; //для того, чтобы строки заполнялись корректно после предыдущего цикла

        //цикл заполняет четвертую часть матрицы (правый верхний угол от середины)
        for (i = 0; i < d; i++) {

            if (i <= m) {
                for (j = d-1; j > k; j--) {
                    matrica[i][j] = 1;
                }
                k = k - 1;
            }
        }

        //выводим матрицу на экран
        for (i = 0; i < d ; i++) {
            for (j = 0; j < d ; j++) {
                System.out.print(matrica[i][j] + " ");
            }
            System.out.println();

        }
    }
}
