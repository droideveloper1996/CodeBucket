package Interview;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class Runner  {




    static public  void  main(String[] args) {

//         InterviewClass interviewClass=new InterviewClass();
//        System.out.println("InterView Runner "+interviewClass);
//        System.out.println(interviewClass.add(2,5));
//        System.out.println(interviewClass.add(2,5.0));
        Singleton obj=Singleton.singleton.getInstance();
        System.out.print(obj);
        ArrayList<Integer> arrayList=new ArrayList<>();
//        List<Integer> list=new List<Integer>() {

        while(5==5);
//        printName(6);
//        display();

    }
   static void display(){
        int data=90;
        class Local{
            void msg(){System.out.println(data);}
        }
        Local l=new Local();
        l.msg();
    }

    public static void printName(int a){
        int k=0;
        class Pa {
            void print() {
                int q = 99;
                System.out.println(k);
                System.out.println(q);
            }
        }
           Pa p=new Pa();
            p.print();
        }




    }






