public class WhileClass {
    public static void main(String[] args) {
        int [] arr = {1,2,3,2,2,3,4};
        int i =0;
        while (i< arr.length) //true
        {
            System.out.println(arr[i]);
            i++;
        }
        i=0;
        do {
            System.out.println(arr[i]);  //сначала запускается, потом проверяет условие
            i++;
        } while (i<arr.length);
    }
}
