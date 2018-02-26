package pkgfinal.project.cit285;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.property.SimpleStringProperty;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;



public class First25Questions implements Runnable { 
      
final static int INDEX = 25;    
static String[] p = new String[INDEX]; 
static Text[] text = new Text[15];
static int i = 0;
 
static String[] questions = new String[INDEX];
static String[] mediumQuestions = new String[INDEX];
static String[] hardQuestions = new String[15];
static String[] hardestQuestions = new String[15];
static CertificationExam rules = new CertificationExam ();
//static final First25Questions th = new  First25Questions

public static int random(){
   int idxx = new Random().nextInt(14);
   
      // System.out.println(idxx);
        // System.out.println("_____________________________________________");        
    return idxx;
}

public static void text(){
    
       text[0] = new Text();    
       text[1] = new Text();  
       text[2] = new Text();  
       text[3] = new Text();
       text[4] = new Text();  
       text[5] = new Text();  
       text[6] = new Text();    
       text[7] = new Text();  
       text[8] = new Text();  
       text[9] = new Text();
       text[10] = new Text();  
       text[11] = new Text();  
       text[12] = new Text();  
       text[13] = new Text();
       text[14] = new Text(); 
} 


 public static String threadMessage(String read)  {
   
        return read;
    }
 
 public  String easyQuestions(){
     
         questions[0] = " What is a marker interface?\n" +
                        "\n" +
                        "A - marker interface is an interface with single method, mark().\n" +
                          "\n" +
                        "B - marker interface is an interface with no method.\n" +  
                        "\n" +
                        "C - marker interface is an interface with single method, marker().\n" +
                        "\n" +
                        "D - none of the above.\n" +
                        "\n";

                  
         questions[1] = "1-What is the name of the method used to start a thread execution?\n"
                 + "A- init();\n" 
                 + "B- resume();"
                 + "C- run();\n" 
                 + "D- Start();\n";
                
          questions[2] = "Which three are methods of the Object class?\n" 
                 + "1- notify();\n" 
                 + "2- notifyAll();\n" 
                 + "3- isInterrupted();\n" 
                 + "4- synchronized();\n" 
                 + "5- interrupt();\n" 
                 + "6- wait(long msecs);\n" 
                 + "7- sleep(long msecs);\n"
                 +"A. 1, 2, 4\n" +
                  "B. 1, 2, 6\n" +
                  "C. 2, 4, 5\n" +
                  "D. 2, 3, 4";
         
          questions[3] =" What is Abstraction?\n" +
                        "\n" +
                        "A - Abstraction is a technique to define different methods of same type.\n" +
                        "\n" +   
                        "B - Abstraction is the ability of an object to take on many forms.\n" +
                        "\n" +
                        "C - It refers to the ability to make a class abstract in OOP.\n" +
                        "\n" +
                        "D - None of the above.\n" +
                        "\n" ;
          
          questions[4] = "Which three are methods of the Object class?\n" 
                 + "1- notify();\n" 
                 + "2- notifyAll();\n" 
                 + "3- isInterrupted();\n" 
                 + "4- synchronized();\n" 
                 + "5- interrupt();\n" 
                 + "6- wait(long msecs);\n" 
                 + "7- sleep(long msecs);\n" 
                 + "8- yield();\n"
                 + "B.	1, 2, 6\n"
                 + "B.	1, 2, 4\n" 
                 + "C.	2, 4, 5\n" 
                 + "D.	2, 3, 4";
         
         questions[5] = "Which cannot directly cause a thread to stop executing?\n" +
                "A. Calling the SetPriority() method on a Thread object.\n" +
                "B. Calling notify() method on an object.\n" +
                "C. Calling the wait() method on an object.\n" +
                "D. Calling read() method on an InputStream object.";
         
        questions[6] ="Which two of the following methods are defined in class Thread?\n" +
                "start()\n" +
                "wait()\n" +
                "notify()\n" +
                "run()\n" +
                "terminate()\n" +
                "A. 2 and 3\n" +
                "B. 2 and 4 "+
                "C. 3 and 4\n" +
                "D. 1 and 4\n";
              
         
         questions[7] = "Which three guarantee that a thread will leave the running state?\n" +
                "1- yield()\n" +
                "2- wait()\n" +
                "3- notify()\n" +
                "4- notifyAll()\n" +
                "5- sleep(1000)\n" +
                "6- aLiveThread.join()\n" +
                "7- Thread.killThread()\n" +
                "A. 1, 2 and 4\n" +
                "B. 2, 5 and 6\n" +
                "C. 3, 4 and 7\n" +
                "D. 4, 5 and 7 ";
        
         questions[8] = "Which method must be defined by a class implementing the java.lang.Runnable interface?\n" +
                "A. public void run()\n" +
                "B. void run()\n" +
                "C. public void start()\n" +
                "D. void run(int priority)";
         
         questions[9] = "Which will contain the body of the thread?\n" +
                "A.	run();\n" +
                 "B.	stop();\n" +
                "C.	start();\n" +
                "D.	main();";
         
         questions[10] = "Which method registers a thread in a thread scheduler?\n" +
                 "A. construct();\n" +
                 "B. run();\n" +
                 "C. start();\n" +
                 "D. register();";
         
         questions[11] ="Assume the following method is properly synchronized and called from a thread A on an object B:\n" +
                "wait(2000);\n" +
                "After calling this method, when will the thread A become a candidate to get another turn at the CPU?\n" +
                 "A. After thread A is notified, or after two seconds.\n" +
                "B. After the lock on B is released, or after two seconds.\n" +
                "C. Two seconds after thread A is notified.\n" +
                "D. Two seconds after lock B is released.";
         
         questions[12] = "Which of the following will not directly cause a thread to stop?\n" +
                 "A. notify()\n" +
                 "B. wait()\n" +
                 "C. InputStream access\n" +
                 "D. sleep()";
         
         questions[13] = "Which class or interface defines the wait(), notify(),and notifyAll() methods?\n" +
                 "A. Thread\n" +
                 "B. Object\n" +
                 "C. Runnable\n" +
                 "D. Class";
         
         questions[14] = "public class MyRunnable implements Runnable \n" +
                "{\n" +
                "    public void run() \n" +
                "    {\n" +
                "        // some code here\n" +
                "    }\n" +
                "}\n" +
                "which of these will create and start this thread?\n" +
                "A. new Runnable(MyRunnable).start();\n" +
                "B. new MyRunnable().start();"+
                "C. new Thread(MyRunnable).run();\n" +
                 "D. new Thread(new MyRunnable()).start();\n";       
                
         
         questions[15] ="Q 1 - What is the size of long variable?\n" +
                        "\n" +        
                        "A - 64 bit\n" +
                        "\n" +
                         "B - 8 bit\n" +   
                        "\n" +
                        "C - 32 bit\n" +
                        "\n" +
                        "D - 16 bit";
         questions[16] ="Q 2 - What is the size of int variable?\n" +
                        "\n" +
                        "A - 16 bit\n" +
                        "\n" +
                        "B - 8 bit\n" +
                        "\n" +
                        "C - 32 bit\n" +
                        "\n" +
                        "D - 64 bit";
         questions[17] ="Q 3 - What is the default value of long variable?\n" +
                        "\n" +
                        "A - 0\n" +
                        "B - null\n" +
                        "\n" +
                        "C - 0L\n" +
                        "\n" +
                        "D - undefined\n" ;
         questions[18] ="Q 4 - What is the default value of Boolean variable?\n" +
                        "\n" +
                        "A - true\n" +
                        "\n" +
                        "B - not defined"+
                        "\n" +
                        "C - null\n" +
                        "\n" +
                        "D - false\n";
                        
         questions[19] ="What is currentThread()?\n" +
                        "\n" +
                        "B - It is a thread's instance method used to get thread count.\n" +
                        "B - It is a Thread public static method used to obtain a reference to the current thread.\n" +
                        "C - It is a object's public static method used obtain a reference to the current thread.\n" +
                        "\n" +
                        "D - It is a object's instance method used to get thread count.";

         questions[20] =" What invokes a thread's run() method?\n" +
                        "\n" + 
                        "A - JVM invokes the thread's run() method when the thread is initially executed.\n" +   
                        "\n" +  
                        "B - Main application running the thread.\n" +
                        "\n" +
                        "C - start() method of the thread class.\n" +
                        "\n" +
                        "D - None of the above.\n" +
                        "\n" +
                        " Show Answer" ;
                        
                      
         questions[21] ="What is an immutable object?\n" +
                        "\n" +
                        "A - An immutable object can be changed once it is created.\n" +
                        "\n" +
                        "B - An immutable object can't be changed once it is created.\n" +
                        "\n" +
                        "C - An immutable object is an instance of an abstract class.\n" +
                        "\n" +
                        "D - None of the above." ;               
                      
         questions[22] ="Q 1 - What is a class in java?\n" +
                        "\n" +
                        "A - class is a special data type.\n" +   
                        "B - A class is a blue print from which individual objects are created."
                      + " A class can contain fields and methods to describe the behavior of an object.\n" +
                        "\n" +
                        "C - class is used to allocate memory to a data type.\n" +
                        "\n" +
                        "D - none of the above.";
         questions[23] ="Q 2 - What is the size of char variable?\n" +
                        "\n" +
                        "A - 8 bit\n" +
                        "\n" +
                        "B - 16 bit\n" +
                        "\n" +
                        "C - 32 bit\n" +
                        "\n" +
                        "D - 64 bit";
         questions[24] ="Q 3 - What is the default value of byte variable?\n" +
                        "\n" +
                        "A - 0.0\n" +
                        "\n" +
                        "B - 0\n" +
                        "\n" +
                        "B - null\n" +
                        "\n" +
                        "B - undefined";


         return questions[random()];
   }
 
 public static String mediumQuestions() {
     
     mediumQuestions[0] = "Which four options describe the correct default values for array elements of the types indicated?\n" +
                            "int -> 0\n" +
                            "String -> \"null\"\n" +
                            "Dog -> null\n" +
                            "char -> '\\u0000'\n" +
                            "float -> 0.0f\n" +
                            "boolean -> true\n" +
                            "A.	1, 2, 3, 4\n" +
                            "B.3, 4, 5, 6 \n"+
                            "C.	2, 4, 5, 6\n" +
                            "D.	1, 3, 4, 5\n" ;
     mediumQuestions[1] = "Which one of these lists contains only Java programming language keywords?\n" +
                        "A. class, if, void, long, Int, continue\n" +
                        "B. goto, instanceof, native, finally, default, throws\n"+
                        "C. strictfp, constant, super, implements, do\n" +
                        "D. try, virtual, throw, final, volatile, transient\n";
                        
      mediumQuestions[2] = "Which will legally declare, construct, and initialize an array?\n" +
                            "A.	int [] myList = {\"1\", \"2\", \"3\"};\n" +
                            "B.	int [] myList = (5, 8, 2);\n" +
                            "C.	int myList [] [] = {4,9,7,0};\n" +
                            "D.	int myList [] = {4, 3, 7}; ";
      mediumQuestions[3] = "Which is a reserved word in the Java programming language?\n" +
                        "A. method\n" +
                        "B. subclasses\n" +
                        "C. reference\n" +
                        "D. native\n" ; 
      mediumQuestions[4] = "Which is a valid keyword in java?\n" +
                            "A.	string\n" +
                             "B. unsigned "+
                            "C.	Float\n" +
                            "D. interface\n";
      mediumQuestions[5] = "Which three are legal array declarations?\n" +
                            "int [] myScores [];\n" +
                            "char [] myChars;\n" +
                            "int [6] myScores;\n" +
                            "Dog myDogs [];\n" +
                            "Dog myDogs [7];\n" +
                            "A. All are correct."+
                            "B.	2, 4, 5\n" +
                            "C.	1, 5, 4\n" +
                            "D.	1, 2, 4\n";
       mediumQuestions[6] = "public interface Foo \n" +
                            "{ \n" +
                            "    int k = 4; /* Line 3 */\n" +
                            "}\n" +
                            "Which three piece of codes are equivalent to line 3?\n" +
                            "final int k = 4;\n" +
                            "public int k = 4;\n" +
                            "static int k = 4;\n" +
                            "abstract int k = 4;\n" +
                            "volatile int k = 4;\n" +
                            "protected int k = 4;\n" +
                            "A.	4, 5 and 6"+
                             "B. 1, 2 and 3\n"+
                            "C.	3, 4 and 5\n" +
                            "D.	2, 3 and 4\n" ;
                         
                           
        mediumQuestions[7] = "Which one of the following will declare an array and initialize it with five numbers?\n" +
                                "A. Array a = new Array(5);\n" + 
                                "B. int a [] = new int[5];\n" +
                                "C. int [5] array;"+
                                "D. int [] a = {23,22,21,20,19};\n";    
        mediumQuestions[8] = "Which three are valid declarations of a char?\n" +
                            "char c1 = 064770;\n" +
                            "char c2 = 'face';\n" +
                            "char c3 = 0xbeef;\n" +
                            "char c4 = \\u0022;\n" +
                            "char c5 = '\\iface';\n" +
                            "char c6 = '\\uface';\n" +
                            "A.	5 only"+
                            "B.	1, 2, 4\n" +
                            "C.	3, 5\n" +
                             "D. 1, 3, 6\n";
        
       mediumQuestions[9] = "Which is the valid declarations within an interface definition?\n" +
                            "A.	protected void methoda(double d1)"+
                            "B. static void methoda(double d1);\n" +
                            "C.	public final double methoda();\n" +
                         
                            "D.	public double methoda();\n";

      mediumQuestions[10] = "Which one is a valid declaration of a boolean?\n" +
                            "A.	boolean b1 = 0;\n" +
                            "B.	boolean b2 = 'false';\n" +
                            "C.	boolean b4 = Boolean.false();\n" +
                            "D.	boolean b3 = false;\n"; 
       
     mediumQuestions[11] = "Which three are valid declarations of a float?\n" +
                            "float f1 = -343;\n" +
                            "float f2 = 3.14;\n" +
                            "float f3 = 0x12345;\n" +
                            "float f4 = 42e7;\n" +
                            "float f5 = 2001.0D;\n" +
                            "float f6 = 2.81F;\n" +
                            "A. 2, 3, 5\n" +
                            "B.	1, 2, 4\n" +
                            "C.	2, 4, 6"+
                            "D.	1, 3, 6\n";
                    
     mediumQuestions[12] =  "Which is a valid declarations of a String?\n" +
                            "A. String s2 = 'null';\n" +
                            "B. String s4 = (String) '\\ufeed';"+
                            "C.	String s3 = (String) 'abc';\n" +
                            "D.	String s1 = null;\n";
        
     mediumQuestions[13] = "What is the numerical range of a char?\n" +
                                "A. -128 to 127\n" +
                                "B. -(215) to (215) - 1\n" +
                                "C. 0 to 32767\n" +
                                "D. 0 to 65535";
    mediumQuestions[14] = "Which is true about an anonymous inner class?\n" +
                            "A.	It can extend exactly one class and implement exactly one interface.\n" +
                            "B.	It can implement multiple interfaces regardless of whether it also extends a class."+   
                            "D.	It can extend exactly one class and can implement multiple interfaces.\n" +
                            "C.	It can extend exactly one class or implement exactly one interface.\n" ;
                           
 
    mediumQuestions[15] =  "Which is true about a method-local inner class?\n" +
                             "A. It can be marked abstract.\n" +
                             "B. It must be marked final.\n" +
                             "C. It can be marked public.\n" +
                             "D. It can be marked static."; 
    
    mediumQuestions[16] = "What is JIT compiler?\n" +
                        "\n" +
                        "A - None of the above.\n" +
                        "\n" +
                        "B - JIT is an application development framework.\n" +
                        "\n" +
                        "C - JIT is an implementation of the Java Virtual Machine which executes Java programs.\n" +
                        "\n" +
                        "D - JIT improves the runtime performance of computer programs based on bytecode.\n"+
                        "\n";
     mediumQuestions[17] ="Method Overriding is an example of\n" +
                        "\n" +
                        "A - Static Binding.\n" +
                        "\n" +
                        "B - None of the above."+
                        "\n" +    
                         "C - Both of the above.\n" +  
                        "\n" +
                        "D - Dynamic Binding.\n";  
     mediumQuestions[18] =" Which is the way in which a thread can enter the waiting state?\n" +
                            "\n" +
                            "A - Invoke its sleep() method.\n" +
                            "\n" +
                            "D - invoke object's wait method.\n" +
                            "\n" +
                            "C - Invoke its suspend() method.\n" +
                            "\n" +
                            "D - All of the above.\n" +
                            "D - invoke object's wait method.\n" +
                            "\n";
       mediumQuestions[19] =" In which case, a program is expected to recover?\n" +
                            "\n" +
                            "A - If an error occurs.\n" +
                            "\n" +
                            "B - None of the above.\n" +
                            "\n" +
                            "C - Both of the above.\n" +
                            "\n" +
                            "D - If an exception occurs.\n" +
                            "\n";
       mediumQuestions[20] ="What of the following is the default value of an instance variable?\n" +
                            "\n" +
                            "A - 0\n" +
                            "B - null\n" +
                            "\n" +
                            "A - 0\n" +
                            "\n" +
                              "C- Not assigned"+
                            "\n" +
                            "D - Depends upon the type of variable\n" ; 
         mediumQuestions[21] =" What is the default value of short variable?\n" +
                            "\n" +
                            "A - undifined\n" +
                            "\n" +
                            "B - 0\n" +
                            "\n" +
                            "C - null\n" +
                            "\n" +
                            "D - 0.0\n" +
                            "\n" ;
          mediumQuestions[22] ="Which of the following is false about String?\n" +
                                "\n" +
                                "A - String is immutable.\n" +
                                "\n" +
                                "B - String can be created using new operator.\n" +
                                "\n" +
                                "C - None of the above."+
                                "\n" +
                                 "D - String is a primary data type.\n";
          mediumQuestions[23] ="What is instance variable?\n" +
                                "\n" +
                                "A - Instance variables are static variables within a class but outside any method.\n" +
                                "\n" +
                                "B - Instance variables are variables defined inside methods, constructors or blocks.\n" +
                                "\n" +
                                "C - None of the above."+
                                "\n" +
                                "D - Instance variables are variables within a class but outside any method.\n";
          mediumQuestions[24] =" What is JIT compiler?\n" +
                                "\n" +
                                "A - JIT improves the runtime performance of computer programs based on bytecode.\n" +
                                "\n" +
                                "B - JIT is an application development framework.\n" +
                                "\n" +
                                "C - None of the above."+
                                "\n" +
                                "D - JIT is an implementation of the Java Virtual Machine which executes Java programs.\n" ;



      return  mediumQuestions[random()];
 }
 
 public String hardQuestions() {
     hardQuestions[0] = "You want subclasses in any package to have access to members of a superclass."
                         + " Which is the most restrictive access that accomplishes this objective?\n" +
                        "A.	public\n" +
                        "B.	private\n" +
                        "C.	protected\n" +
                        "D.	transient";
     hardQuestions[1] ="public class Outer \n" +
                        "{ \n" +
                        "    public void someOuterMethod() \n" +
                        "    {\n" +
                        "        //Line 5 \n" +
                        "    } \n" +
                        "    public class Inner { } \n" +
                        "    \n" +
                        "    public static void main(String[] argv) \n" +
                        "    {\n" +
                        "        Outer ot = new Outer(); \n" +
                        "        //Line 10\n" +
                        "    } \n" +
                        "} \n" +
                        "Which of the following code fragments inserted, will allow to compile?\n" +
                        "A.	new Inner(); //At line 5\n" +
                        "B.	new Inner(); //At line 10\n" +
                        "C.	new ot.Inner(); //At line 10\n" +
                        "D.	new Outer.Inner(); //At line 10";
        hardQuestions[2] = "interface Base \n" +
                        "{\n" +
                        "    boolean m1 ();\n" +
                        "    byte m2(short s);\n" +
                        "}\n" +
                        "which two code fragments will compile?\n" +
                        "interface Base2 implements Base {}\n" +
                        "abstract class Class2 extends Base \n" +
                        "{ public boolean m1(){ return true; }}\n" +
                        "abstract class Class2 implements Base {}\n" +
                        "abstract class Class2 implements Base \n" +
                        "{ public boolean m1(){ return (7 > 4); }}\n" +
                        "abstract class Class2 implements Base \n" +
                        "{ protected boolean m1(){ return (5 > 7) }}\n" +
                        "A.	1 and 2\n" +
                        "B.	2 and 3\n" +
                        "C.	3 and 4\n" +
                        "D.	1 and 5";
         hardQuestions[3] = "Which three form part of correct array declarations?\n" +
                            "public int a [ ]\n" +
                            "static int [ ] a\n" +
                            "public [ ] int a\n" +
                            "private int a [3]\n" +
                            "private int [3] a [ ]\n" +
                            "public final int [ ] a\n" +
                            "A.	1, 3, 4\n" +
                            "B.	2, 4, 5\n" +
                            "C.	1, 2, 6\n" +
                            "D.	2, 5, 6";
         hardQuestions[4] = "public class Test { }\n" +
                            "What is the prototype of the default constructor?\n" +
                            "A.	Test( )\n" +
                            "B.	Test(void)\n" +
                            "C.	public Test( )\n" +
                            "D.	public Test(void)";
          hardQuestions[5] = "What is the most restrictive access modifier that will"
                           + " allow members of one class to have access to members of another "
                           + "class in the same package?\n" +
                            "A.	public\n" +
                            "B.	abstract\n" +
                            "C.	protected\n" +
                            "D.	synchronized\n" +
                            "E.	default access";
           hardQuestions[6] = "Which of the following is/are legal method declarations?\n" +
                                "1 protected abstract void m1();\n" +
                                "2 static final void m1(){}\n" +
                                "3 synchronized public final void m1() {}\n" +
                                "4 private native void m1();\n" +
                                "A.	1 and 3\n" +
                                "B.	2 and 4\n" +
                                "C.	1 only\n" +
                                "D.	All of them are legal declarations.";
           hardQuestions[7] = "Which cause a compiler error?\n" +
                                "A.	int[ ] scores = {3, 5, 7};\n" +
                                "B.	int [ ][ ] scores = {2,7,6}, {9,3,45};\n" +
                                "C.	String cats[ ] = {\"Fluffy\", \"Spot\", \"Zeus\"};\n" +
                                "D.	boolean results[ ] = new boolean [] {true, false, true};\n" +
                                "E.	Integer results[ ] = {new Integer(3), new Integer(5), new Integer(8)};";
            hardQuestions[8] = "Which three are valid method signatures in an interface?\n" +
                                "private int getArea();\n" +
                                "public float getVol(float x);\n" +
                                "public void main(String [] args);\n" +
                                "public static void main(String [] args);\n" +
                                "boolean setFlag(Boolean [] test);\n" +
                                "A.	1 and 2\n" +
                                "B.	2, 3 and 5\n" +
                                "C.	3, 4, and 5\n" +
                                "D.	2 and 4";
            hardQuestions[9] = "	\n" +
                                "You want a class to have access to members of another class in the same package. "
                                + "Which is the most restrictive access that accomplishes this objective?\n" +
                                "A.	public\n" +
                                "B.	private\n" +
                                "C.	protected\n" +
                                "D.	default access";
            hardQuestions[10] = "What is the widest valid returnType for methodA in line 3?\n" +
                                "public class ReturnIt \n" +
                                "{ \n" +
                                "    returnType methodA(byte x, double y) /* Line 3 */\n" +
                                "    { \n" +
                                "        return (long)x / y * 2; \n" +
                                "    } \n" +
                                "}\n" +
                                "A.	int\n" +
                                "B.	byte\n" +
                                "C.	long\n" +
                                "D.	double";
            hardQuestions[11] = "class A \n" +
                                "{  \n" +
                                "    protected int method1(int a, int b) \n" +
                                "    {\n" +
                                "        return 0; \n" +
                                "    } \n" +
                                "}\n" +
                                "Which is valid in a class that extends class A?\n" +
                                "A.	public int method1(int a, int b) {return 0; }\n" +
                                "B.	private int method1(int a, int b) { return 0; }\n" +
                                "C.	public short method1(int a, int b) { return 0; }\n" +
                                "D.	static protected int method1(int a, int b) { return 0; }"; 
            hardQuestions[12] = " 	\n" +
                                "Which one creates an instance of an array?\n" +
                                "A.	int[ ] ia = new int[15];\n" +
                                "B.	float fa = new float[20];\n" +
                                "C.	char[ ] ca = \"Some String\";\n" +
                                "D.	int ia[ ] [ ] = { 4, 5, 6 }, { 1,2,3 };";
            hardQuestions[13] = "	\n" +
                                "Which two of the following are legal declarations for nonnested classes and interfaces?\n" +
                                "final abstract class Test {}\n" +
                                "public static interface Test {}\n" +
                                "final public class Test {}\n" +
                                "protected abstract class Test {}\n" +
                                "protected interface Test {}\n" +
                                "abstract public class Test {}\n" +
                                "A.	1 and 4\n" +
                                "B.	2 and 5\n" +
                                "C.	3 and 6\n" +
                                "D.	4 and 6";
            hardQuestions[14] = "Which of the following class level (nonlocal) variable declarations will not compile?\n" +
                                "A.	protected int a;\n" +
                                "B.	transient int b = 3;\n" +
                                "C.	private synchronized int e;\n" +
                                "D.	volatile int d;";
            return hardQuestions[random()];
 }

 public static String hardestQuestions() {
        hardestQuestions[0] ="What will be the output of the program?\n" +
                            "public class Test \n" +
                            "{\n" +
                            "    public static int y;\n" +
                            "    public static void foo(int x) \n" +
                            "    {\n" +
                            "        System.out.print(\"foo \");\n" +
                            "        y = x;\n" +
                            "    }\n" +
                            "    public static int bar(int z) \n" +
                            "    {\n" +
                            "        System.out.print(\"bar \");\n" +
                            "        return y = z;\n" +
                            "    }\n" +
                            "    public static void main(String [] args ) \n" +
                            "    {\n" +
                            "        int t = 0;\n" +
                            "        assert t > 0 : bar(7);\n" +
                            "        assert t > 1 : foo(8); /* Line 18 */\n" +
                            "        System.out.println(\"done \");\n" +
                            "    }\n" +
                            "}\n" +
                            "A.	bar\n" +
                            "B.	bar done\n" +
                            "C.	foo done\n" +
                            "D.	Compilation fails";
        hardestQuestions[1] ="What will be the output of the program?\n" +
                            "public class Test \n" +
                            "{  \n" +
                            "    public static void main(String[] args) \n" +
                            "    { \n" +
                            "        int x = 0;  \n" +
                            "        assert (x > 0) ? \"assertion failed\" : \"assertion passed\" ; \n" +
                            "        System.out.println(\"finished\");  \n" +
                            "    } \n" +
                            "}\n" +
                            "A.	finished\n" +
                            "B.	Compiliation fails.\n" +
                            "C.	An AssertionError is thrown and finished is output.\n" +
                            "D.	An AssertionError is thrown with the message \"assertion failed.\"";
        hardestQuestions[2] ="public class Test \n" +
                                "{ \n" +
                                "    public void foo() \n" +
                                "    {\n" +
                                "        assert false; /* Line 5 */\n" +
                                "        assert false; /* Line 6 */\n" +
                                "    } \n" +
                                "    public void bar()\n" +
                                "    {\n" +
                                "        while(true)\n" +
                                "        {\n" +
                                "            assert false; /* Line 12 */\n" +
                                "        } \n" +
                                "        assert false;  /* Line 14 */\n" +
                                "    } \n" +
                                "}\n" +
                                "What causes compilation to fail?\n" +
                                "A.	Line 5\n" +
                                "B.	Line 6\n" +
                                "C.	Line 12\n" +
                                "D.	Line 14";
        hardestQuestions[3] ="What will be the output of the program?\n" +
                            "public class Test \n" +
                            "{\n" +
                            "    public static int y;\n" +
                            "    public static void foo(int x) \n" +
                            "    {\n" +
                            "        System.out.print(\"foo \");\n" +
                            "        y = x;\n" +
                            "    }\n" +
                            "    public static int bar(int z) \n" +
                            "    {\n" +
                            "        System.out.print(\"bar \");\n" +
                            "        return y = z;\n" +
                            "    }\n" +
                            "    public static void main(String [] args ) \n" +
                            "    {\n" +
                            "        int t = 0;\n" +
                            "        assert t > 0 : bar(7);\n" +
                            "        assert t > 1 : foo(8); /* Line 18 */\n" +
                            "        System.out.println(\"done \");\n" +
                            "    }\n" +
                            "}\n" +
                            "A.	bar\n" +
                            "B.	bar done\n" +
                            "C.	foo done\n" +
                            "D.	Compilation fails";
        hardestQuestions[4] ="What will be the output of the program (when you run with the -ea option) ?\n" +
                            "public class Test \n" +
                            "{  \n" +
                            "    public static void main(String[] args) \n" +
                            "    {\n" +
                            "        int x = 0;  \n" +
                            "        assert (x > 0) : \"assertion failed\"; /* Line 6 */\n" +
                            "        System.out.println(\"finished\"); \n" +
                            "    } \n" +
                            "}\n" +
                            "A.	finished\n" +
                            "B.	Compilation fails.\n" +
                            "C.	An AssertionError is thrown.\n" +
                            "D.	An AssertionError is thrown and finished is output.";
         hardestQuestions[5] ="public class Test2 \n" +
                                "{\n" +
                                "    public static int x;\n" +
                                "    public static int foo(int y) \n" +
                                "    {\n" +
                                "        return y * 2;\n" +
                                "    }\n" +
                                "    public static void main(String [] args) \n" +
                                "    {\n" +
                                "        int z = 5;\n" +
                                "        assert z > 0; /* Line 11 */\n" +
                                "        assert z > 2: foo(z); /* Line 12 */\n" +
                                "        if ( z < 7 )\n" +
                                "            assert z > 4; /* Line 14 */\n" +
                                "\n" +
                                "        switch (z) \n" +
                                "        {\n" +
                                "            case 4: System.out.println(\"4 \");\n" +
                                "            case 5: System.out.println(\"5 \");\n" +
                                "            default: assert z < 10;\n" +
                                "        }\n" +
                                "\n" +
                                "        if ( z < 10 )\n" +
                                "            assert z > 4: z++; /* Line 22 */\n" +
                                "        System.out.println(z);\n" +
                                "    }\n" +
                                "}\n" +
                                "which line is an example of an inappropriate use of assertions?\n" +
                                "A.	Line 11\n" +
                                "B.	Line 12\n" +
                                "C.	Line 14\n" +
                                "D.	Line 22";
          hardestQuestions[6] ="void start() {  \n" +
                                "    A a = new A(); \n" +
                                "    B b = new B(); \n" +
                                "    a.s(b);  \n" +
                                "    b = null; /* Line 5 */\n" +
                                "    a = null;  /* Line 6 */\n" +
                                "    System.out.println(\"start completed\"); /* Line 7 */\n" +
                                "} \n" +
                                "When is the B object, created in line 3, eligible for garbage collection?\n" +
                                "A.	after line 5\n" +
                                "B.	after line 6\n" +
                                "C.	after line 7\n" +
                                "D.	There is no way to be absolutely certain.";
          hardestQuestions[7] ="class HappyGarbage01 \n" +
                                "{ \n" +
                                "    public static void main(String args[]) \n" +
                                "    {\n" +
                                "        HappyGarbage01 h = new HappyGarbage01(); \n" +
                                "        h.methodA(); /* Line 6 */\n" +
                                "    } \n" +
                                "    Object methodA() \n" +
                                "    {\n" +
                                "        Object obj1 = new Object(); \n" +
                                "        Object [] obj2 = new Object[1]; \n" +
                                "        obj2[0] = obj1; \n" +
                                "        obj1 = null; \n" +
                                "        return obj2[0]; \n" +
                                "    } \n" +
                                "}\n" +
                                "Where will be the most chance of the garbage collector being invoked?\n" +
                                "A.	After line 9\n" +
                                "B.	After line 10\n" +
                                "C.	After line 11\n" +
                                "D.	Garbage collector never invoked in methodA()"; 
             hardestQuestions[8] ="class Bar { } \n" +
                                "class Test \n" +
                                "{  \n" +
                                "    Bar doBar() \n" +
                                "    {\n" +
                                "        Bar b = new Bar(); /* Line 6 */\n" +
                                "        return b; /* Line 7 */\n" +
                                "    } \n" +
                                "    public static void main (String args[]) \n" +
                                "    { \n" +
                                "        Test t = new Test();  /* Line 11 */\n" +
                                "        Bar newBar = t.doBar();  /* Line 12 */\n" +
                                "        System.out.println(\"newBar\"); \n" +
                                "        newBar = new Bar(); /* Line 14 */\n" +
                                "        System.out.println(\"finishing\"); /* Line 15 */\n" +
                                "    } \n" +
                                "}\n" +
                                "At what point is the Bar object, created on line 6, eligible for garbage collection?\n" +
                                "A.	after line 12\n" +
                                "B.	after line 14\n" +
                                "C.	after line 7, when doBar() completes\n" +
                                "D.	after line 15, when main() completes";
              hardestQuestions[9] ="class Test \n" +
                                    "{  \n" +
                                    "    private Demo d; \n" +
                                    "    void start() \n" +
                                    "    {  \n" +
                                    "        d = new Demo(); \n" +
                                    "        this.takeDemo(d); /* Line 7 */\n" +
                                    "    } /* Line 8 */\n" +
                                    "    void takeDemo(Demo demo) \n" +
                                    "    { \n" +
                                    "        demo = null;  \n" +
                                    "        demo = new Demo(); \n" +
                                    "    } \n" +
                                    "}\n" +
                                    "When is the Demo object eligible for garbage collection?\n" +
                                    "A.	After line 7\n" +
                                    "B.	After line 8\n" +
                                    "C.	After the start() method completes\n" +
                                    "D.	When the instance running this code is made eligible for garbage collection.";
               hardestQuestions[10] ="public class X \n" +
                                    "{\n" +
                                    "    public static void main(String [] args) \n" +
                                    "    {\n" +
                                    "        X x = new X();\n" +
                                    "        X x2 = m1(x); /* Line 6 */\n" +
                                    "        X x4 = new X();\n" +
                                    "        x2 = x4; /* Line 8 */\n" +
                                    "        doComplexStuff();\n" +
                                    "    }\n" +
                                    "    static X m1(X mx) \n" +
                                    "    {\n" +
                                    "        mx = new X();\n" +
                                    "        return mx;\n" +
                                    "    }\n" +
                                    "}\n" +
                                    "After line 8 runs. how many objects are eligible for garbage collection?\n" +
                                    "A.	0  \n" +
                                    "B.	1\n" +
                                    "C.	2\n" +
                                    "D.	3";
                  hardestQuestions[11] ="public Object m() \n" +
                                        "{  \n" +
                                        "    Object o = new Float(3.14F); \n" +
                                        "    Object [] oa = new Object[l];\n" +
                                        "    oa[0] = o; /* Line 5 */\n" +
                                        "    o = null;  /* Line 6 */\n" +
                                        "    oa[0] = null; /* Line 7 */\n" +
                                        "    return o; /* Line 8 */\n" +
                                        "}\n" +
                                        "When is the Float object, created in line 3, eligible for garbage collection?\n" +
                                        "A.	just after line 5\n" +
                                        "B.	just after line 6\n" +
                                        "C.	just after line 7\n" +
                                        "D.	just after line 8";
                  hardestQuestions[12] ="class X2 \n" +
                                            "{\n" +
                                            "    public X2 x;\n" +
                                            "    public static void main(String [] args) \n" +
                                            "    {\n" +
                                            "        X2 x2 = new X2();  /* Line 6 */\n" +
                                            "        X2 x3 = new X2();  /* Line 7 */\n" +
                                            "        x2.x = x3;\n" +
                                            "        x3.x = x2;\n" +
                                            "        x2 = new X2();\n" +
                                            "        x3 = x2; /* Line 11 */\n" +
                                            "        doComplexStuff();\n" +
                                            "    }\n" +
                                            "}\n" +
                                            "after line 11 runs, how many objects are eligible for garbage collection?\n" +
                                            "A.	0\n" +
                                            "B.	1\n" +
                                            "C.	2\n" +
                                            "D.	3";
                   hardestQuestions[13] ="What allows the programmer to destroy an object x?\n" +
                                        "A.	x.delete()\n" +
                                        "B.	x.finalize()\n" +
                                        "C.	Runtime.getRuntime().gc()\n" +
                                        "D.	Only the garbage collection system can destroy an object.";
                   hardestQuestions[14] ="You want subclasses in any package to have access to members "
                                        + "of a superclass. Which is the most restrictive access that"
                                         + " accomplishes this objective?\n" +
                                        "A.	public\n" +
                                        "B.	private\n" +
                                        "C.	protected\n" +
                                        "D.	transient";
                   return hardestQuestions[random()];

  }

  public void test1(){
        
       text[0].setText(threadMessage(easyQuestions()));
       text[1].setText(threadMessage(easyQuestions()));
       text[2].setText(threadMessage(easyQuestions()));
       text[3].setText(threadMessage(easyQuestions()));
       text[4].setText(threadMessage(easyQuestions()));
       text[5].setText(threadMessage(easyQuestions()));
       text[6].setText(threadMessage(easyQuestions()));
       text[7].setText(threadMessage(easyQuestions()));
       text[8].setText(threadMessage(easyQuestions()));
       text[9].setText(threadMessage(easyQuestions()));
       text[10].setText(threadMessage(easyQuestions()));
       text[11].setText(threadMessage(easyQuestions()));
       text[12].setText(threadMessage(easyQuestions()));
       text[13].setText(threadMessage(easyQuestions()));
       text[14].setText(threadMessage(easyQuestions()));
    
  }
    public void  test2(){
    
       text[0].setText(threadMessage(mediumQuestions()));
       text[1].setText(threadMessage(mediumQuestions()));
       text[2].setText(threadMessage(mediumQuestions()));
       text[3].setText(threadMessage(mediumQuestions()));
       text[4].setText(threadMessage(mediumQuestions()));
       text[5].setText(threadMessage(mediumQuestions()));
       text[6].setText(threadMessage(mediumQuestions()));
       text[7].setText(threadMessage(mediumQuestions()));
       text[8].setText(threadMessage(mediumQuestions()));
       text[9].setText(threadMessage(mediumQuestions()));
       text[10].setText(threadMessage(mediumQuestions()));
       text[11].setText(threadMessage(mediumQuestions()));
       text[12].setText(threadMessage(mediumQuestions()));
       text[13].setText(threadMessage(mediumQuestions()));
       text[14].setText(threadMessage(mediumQuestions()));
    }

     public void  test3(){
    
       text[0].setText(threadMessage(hardQuestions()));
       text[1].setText(threadMessage(hardQuestions()));
       text[2].setText(threadMessage(hardQuestions()));
       text[3].setText(threadMessage(hardQuestions()));
       text[4].setText(threadMessage(hardQuestions()));
       text[5].setText(threadMessage(hardQuestions()));
       text[6].setText(threadMessage(hardQuestions()));
       text[7].setText(threadMessage(hardQuestions()));
       text[8].setText(threadMessage(hardQuestions()));
       text[9].setText(threadMessage(hardQuestions()));
       text[10].setText(threadMessage(hardQuestions()));
       text[11].setText(threadMessage(hardQuestions()));
       text[12].setText(threadMessage(hardQuestions()));
       text[13].setText(threadMessage(hardQuestions()));
       text[14].setText(threadMessage(hardQuestions()));
    }
     
    public static void  test4(){
    
       text[0].setText(threadMessage(hardestQuestions()));
       text[1].setText(threadMessage(hardestQuestions()));
       text[2].setText(threadMessage(hardestQuestions()));
       text[3].setText(threadMessage(hardestQuestions()));
       text[4].setText(threadMessage(hardestQuestions()));
       text[5].setText(threadMessage(hardestQuestions()));
       text[6].setText(threadMessage(hardestQuestions()));
       text[7].setText(threadMessage(hardestQuestions()));
       text[8].setText(threadMessage(hardestQuestions()));
       text[9].setText(threadMessage(hardestQuestions()));
       text[10].setText(threadMessage(hardestQuestions()));
       text[11].setText(threadMessage(hardestQuestions()));
       text[12].setText(threadMessage(hardestQuestions()));
       text[13].setText(threadMessage(hardestQuestions()));
       text[14].setText(threadMessage(hardestQuestions()));
    }  
    
 
  public void first() throws InterruptedException {
          synchronized(this) {
         if (i <= questions.length ) { 
          text();
          test1();    
     }
   }
 }
      
  public  void second() throws InterruptedException {
          synchronized(this) {
         if (i <= mediumQuestions.length ) {  
                text();
                test2();
             
     }
   }
 }     
  
  public void third() throws InterruptedException {
          synchronized(this) {
         if (i <= hardQuestions.length ) {   
           text();
          test3();
     }
   }
 }     
  
   public void fourth() throws InterruptedException {

          synchronized(this) {
         if (i <= hardestQuestions.length ) {    
           text();
          test4();  
          
     }
   }
 }     
    @Override
    public void run() {   
     
    rules.allThread();
   
    }
}

            

