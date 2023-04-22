/* wajp to find the maximum array elements. */

import java.io.*;
import java.util.*;
class ArrayMax
{
public static void main(String args[])
{
int num[]={25,55,35,65,45,85,95};

for(int i=0; i<num.length; i++){
System.out.print(num[i]+" ");
}

Arrays.sort(num);

for(int i=0; i<num.length; i++){
if(i==num.length-1){
System.out.println("\n Highest Array Element is "+num[i]);
}
}

}
}