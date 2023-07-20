/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.io.*;
import  java.util.*;
class UserMainCode
{
public int totalHillWeight(int input1, int input2, int input3){
        int sum=0;
        for(int i=0;i<input1;i++)
        {
            for(int j=0;j<=i;j++)
            {
                sum+=input2;
            }
            input2+=input3;
        }
        return sum;
    }
}