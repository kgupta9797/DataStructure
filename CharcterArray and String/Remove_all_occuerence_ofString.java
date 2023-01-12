import com.sun.java.swing.plaf.windows.WindowsDesktopIconUI;

public class Remove_all_occuerence_ofString {

    public static void main(String args[])
    {
        String str="daabcbaabcbc";
        String part="abc";
        int l=part.length();
        //indexOf()method return starting index if not present return -1
        while(true) {
            int index = str.indexOf(part);//first part(abc) find here at index 2
            //if not found return return -1 and if loop is break
            if (index > -1) {
              str=  str.substring(0, index) + str.substring(index + l);//l is part2+3=5 starting from 5->baabcbc
                //(0,2)+(2+3)==>da+baabcbc
            } else {
                break;
            }
        }
     System.out.println(str);

    }
}
