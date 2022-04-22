package com.company;

public class Main {

    public static void main(String[] args) {
	linearSearch(new int[]{1, 2, 3, 4, 5}, 5);
    }
    public static int linearSearch(int arr[], int elementToSearch) {

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == elementToSearch)
                return index;
        }
        return -1;
    }
}
