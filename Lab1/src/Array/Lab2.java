package Array;

import java.util.*;

class TestArray {
    Scanner sc = new Scanner(System.in);
    int[] arr;
    int size;

    public TestArray(int size) {
        this.size = size;
        this.arr = new int[size];
    }

    // 1. Insert
    public void insert() {
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
    }

    // 2. Display
    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i] + ", ");
        }
    }

    // 3. Delete
    void Delete(int index) {
        for (int i = 0; i < size - 1; i++) {
            if (i >= index - 1) {
                arr[i] = arr[i + 1];

            }
            size--;
        }
    }

    // 3. Search
    int linearSearch(int find) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == find) {
                return i;
            }
        }
        return -1;
    }

    // 4. Delete By Value
    void deleteByValue(int value) {

        int index = linearSearch(value);
        // If not found
        if (index == -1) {
            System.out.println("Not found");
        }
        // if does foud delete it
        else {
            Delete(index + 1);
        }

    }
}

public class Lab2 {
    public static void main(String[] args) {
        TestArray array = new TestArray(4);
        array.insert();
        array.display();
        array.Delete(1);
        array.display();
        System.out.println("the element we want to delete is :" + array.linearSearch(3));
    }

}
