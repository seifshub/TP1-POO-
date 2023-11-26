
public class TestCustomArrayList {
    public static void main(String[] arg) {
        CustomArrayList arr1 = new CustomArrayList();
        CustomArrayList arr2 = new CustomArrayList(5);

        for (int i = 1; i < 10; i++) {
            arr1.add(i);
        }
        arr1.add(9, 10);

        System.out.println("arraylist 1:");
        arr1.display();
        System.out.println();

        arr2.add(0, 4);
        arr2.add(1, 3);
        arr2.add(2, 2);

        System.out.println("arraylist 2:");
        arr2.display();
        System.out.println();

        System.out.println("Element at index 5 in arraylist 1: " + arr1.get(5));

        System.out.println("Size of arraylist 2: " + arr2.size());

        System.out.println("is arraylist1 empty:" + arr1.isEmpty());
        CustomArrayList arr3= new CustomArrayList();
        System.out.println("is arraylist3 empty:" + arr3.isEmpty());

        System.out.println("10 in arraylist 1?:" + arr1.isIn(10));
        System.out.println("10 in arraylist 2?:" + arr2.isIn(10));

        System.out.println("Index of 8 in arraylist 1: " + arr1.find(8));

        arr1.remove(5);
        arr2.remove(2);

        System.out.println("arraylist 1 after removing 5:");
        arr1.display();
        System.out.println();

        System.out.println("arraylist 2 after removing 2:");
        arr2.display();
    }
}
