public class LengthOfString {
    public static void main(String[] args) {
        char arr[] = {'h', 'e', 'l', 'l', 'o'};
        System.out.println("length of String :" + getLength(arr));
    }
    static int getLength(char name[]) {
        int count = 0;
        for (int i = 0; name[i] != '\0'; ++i) {
            count++;
        }

        return count;
    }

}