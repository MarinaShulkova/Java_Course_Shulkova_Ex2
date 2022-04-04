//ЗАДАНИЕ 1
public class Main {
    public static void main(String[] args) {
        int[] array = {3, 22, 1, 13, 4, 6, 16, 5};
// четные числа
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0)
                System.out.print(array[i] + " ");

        }
        System.out.println(" ");
// двузначные числа

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 9) {
                if (array[i] < 100) {
                    System.out.print(array[i] + " ");
                }
            }
        }
        System.out.println(" ");

// наибольшее число массива:
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }
        System.out.print(max);
        System.out.println(" ");
// сумма значений массива:
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println(sum);
//переворачивание массива:
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}

//ЗАДАНИЕ 2
public class Main {
    public static void main(String[] args) {

        // ввод массива
        Scanner scr = new Scanner(System.in);
        int[][] array = new int[4][3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = scr.nextInt();
            }
        }

        // вывод массива
        System.out.println("Массив");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
// сумма строк
        System.out.println("Сумма строк");
        for (int i = 0; i < array.length; i++) {
            int sum_line = 0;
            int nun_Line = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum_line = sum_line + array[i][j];
            }
            nun_Line = i + 1;
            System.out.println("Line" + " " + nun_Line + ":" + sum_line);
            sum_line = 0;

        }
        System.out.println();
        // сумма столбцов
        System.out.println("Сумма столбцов");
        for (int j = 0; j < array[j].length; j++) {
            int sum_Column = 0;
            int num_Column = 0;
            for (int i = 0; i < array.length; i++) {
                sum_Column = sum_Column + array[i][j];
            }
            num_Column = j + 1;
            System.out.println("Column" + " " + num_Column + ":" + sum_Column);
            sum_Column = 0;
        }

        System.out.println();

// замена четных значений на 0, нечетных значений на 1
        System.out.println("Замена четных и нечетных значений");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] % 2 == 0) {
                    System.out.print(0 + " ");
                } else {
                    System.out.print(1 + " ");
                }
            }
            System.out.println();
        }
        System.out.println();

// целое среднее арифмитическое строки
        System.out.println("Среднее арифметическое строки");
        for (int i = 0; i < array.length; i++) {
            int sum_middle = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum_middle = sum_middle + array[i][j];
            }
            System.out.println("Middle " + i + ":" + sum_middle / 3);
            sum_middle = 0;
        }
        System.out.println();

//
        System.out.println("Преобразование двумерного массива в обратнй одномерный");
        int k = array.length * array[0].length - 1; // индекс нового массива (11 - с 0 до 11)
        int[] array1 = new int[k + 1]; // новый массив 12 элементов
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                array1[k] = array[i][j];
                if (k != 0) {
                    k--;
                }

            }
        }
        for (k=0; k < array1.length; k++) {
            System.out.print(array1[k] + " ");
        }
    }
}
