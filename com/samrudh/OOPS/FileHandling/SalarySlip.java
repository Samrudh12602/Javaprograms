package com.samrudh.OOPS.FileHandling;
import java.io.*;

public class SalarySlip {
    public static void main(String[] args) throws IOException {
        int i;
        String name = null; long mob = 0; int id = 0; float bas = 0;
        File f= new File("employee.txt");
        f.createNewFile();
        File op=new File("salaryslip.txt");
        op.createNewFile();
        BufferedReader bf;
        FileWriter fileWriter;
        try {
            bf = new BufferedReader(new FileReader(f));
            String lineRead;
            int linecount=0;
            while ((lineRead= bf.readLine())!=null){
                linecount++;
                switch (linecount){
                    case 1:name= lineRead;break;
                    case 2:id=Integer.parseInt(lineRead);break;
                    case 3:mob=Long.parseLong(lineRead);break;
                    case 4:bas=Float.parseFloat(lineRead);break;
                }
            }
            double hra,da,ta,gross,gpf,tax; da=0.34*bas;
            hra=0.18*(da+bas); ta=3600+(0.34*3600);
            gross=bas+da+ta+hra; gpf=0.1*gross; tax=0.2*gross;
            fileWriter= new FileWriter(op);
            fileWriter.write("***************************************************");
            fileWriter.write("\n	PAY SLIP");
            fileWriter.write("\n***************************************************\n");
            fileWriter.write("\nEmployee Name : "+name);
            fileWriter.write("\nEmployee phone no. : "+mob);
            fileWriter.write("\nEmployee ID : "+id);
            fileWriter.write("\nEmployee Basic Salary : "+bas);
            fileWriter.write("\nDA : Rs "+da);
            fileWriter.write("\nHRA : Rs "+hra);
            fileWriter.write("\nTA : Rs "+ta);
            fileWriter.write("\nGross : Rs "+gross);
            fileWriter.write("\nGPF : Rs "+gpf);
            fileWriter.write("\nTax : Rs "+tax);
            fileWriter.write("\nDeduction : Rs "+(gpf+tax));
            fileWriter.write("\nNet : Rs "+(gross-gpf-tax));
            bf.close();
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
