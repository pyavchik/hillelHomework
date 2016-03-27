package homework3;

/**
 * Created by Dim on 20.02.2016.
 */
/*5. Есть 2 массива упорядоченных по возрастанию. Получите 3й массив, который объединит все эти элементы, но также в возрастающем порядке.

        Пример ввода:
        a = {1, 3, 5}
        b = {2, 4, 8, 9, 12}
        Результат:
        c = {1, 2, 3, 4, 5, 8, 9, 12}*/
public class Task14 {
    public static void main(String[] args) {

        int[] firstArray = {1, 3, 5};
        int[] secondArray = {2, 4, 8, 9, 12};
        int[] thirdArray = new int[firstArray.length + secondArray.length];

        int firstArrayIndex = 0;
        int secondArrayIndex = 0;
        int thirdArrayIndex = 0;
        int firstArrayElementsLeft = firstArray.length;
        int secondArrayElementsLeft = secondArray.length;

        


        while (thirdArrayIndex < firstArray.length + secondArray.length) {
            if ((firstArray[firstArrayIndex] < secondArray[secondArrayIndex]) && (firstArrayElementsLeft != 0)) {
                thirdArray[thirdArrayIndex] = firstArray[firstArrayIndex];
                if (firstArrayIndex < firstArray.length - 1) {
                    firstArrayIndex++;
                }
                firstArrayElementsLeft--;
            } else {
                if (secondArrayElementsLeft != 0) {
                    thirdArray[thirdArrayIndex] = secondArray[secondArrayIndex];
                    if (secondArrayIndex < secondArray.length - 1) {
                        secondArrayIndex++;
                    }
                    secondArrayElementsLeft--;
                }
            }
            thirdArrayIndex++;
        }

        Utils.printArray(thirdArray);
    }
}
