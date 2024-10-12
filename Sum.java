import java.io.*;


class Sum{
    public static void main(String[] args) throws Exception  {
        int val1,val2,result;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num1 = br.readLine();
// Readlinine reads entire line so  we have to split the input by space
        String [] numbers =num1.split(" ");
// Converting into interger
        val1=Integer.parseInt(numbers[0]);
        val2 = Integer.parseInt(numbers[1]);
        result = val1+val2;
        System.out.println(result);

        
    }
}