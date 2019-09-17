/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teststudent;

/**
 *
 * @author sivagamasrinivasan
 */
public class StudentTester 
{
   public static void main (String args[])
   {
    TestStudent[] name= new TestStudent[2];
   TestStudent s1= new TestStudent();
   TestStudent s2 = new TestStudent();
   s1.setName("dfg");
   s1.setAge(12);
   s2.setName("ghj");
   s2.setAge(67);
           
   name[0]=s1;
   name[1]=s2;
   for(TestStudent i: name)
   {
       System.out.println(i.getName()+ " " +i.getAge());
       
   System.out.println("test");
   }
   }
}