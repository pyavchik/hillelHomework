package homework6;

/**
 * Created by Dim on 02.03.2016.
 */
public class FirstImprovedArray {
    private String[] elements = new String[10];
    private int elementCounter;

    public void add(String value) {
        if (elementCounter == elements.length) {
            resize();
        }
        elements[elementCounter] = value;
        elementCounter++;
    }

    private void resize() {
        String[] temp = new String[elementCounter * 2];
        System.arraycopy(elements, 0, temp, 0, elements.length);
        elements = temp;
    }

    public String get(int index) {
        return elements[index];
    }

    public int size() {
        return elementCounter;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof FirstImprovedArray)){
            return false;
        }
        FirstImprovedArray other = (FirstImprovedArray) o;

        if (this.size() != other.size()) {
            return false;
        }

        for (int i = 0; i < this.size(); i++) {
            if (!this.get(i).equals(other.get(i))){
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        if (elementCounter == 0) {
            return "Array is empty";
        }

        String result = "";
        for (int i = 0; i < elementCounter; i++) {
            result = result + "\'" + elements[i];
            if (i < elementCounter - 1) {
                result = result + "\', ";
            } else {
                result = result + "\'.";
            }
        }
        return result;
    }
}


