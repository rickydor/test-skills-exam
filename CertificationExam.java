
/* Ricardo Dorancy
   Professor Richmond
   12/17/16
   final project cit285

This program is a test based on the java certication examinations.
It has multiple test, and all questions are multiple choice.
The user has 10 minutes to answers all the 20 questions, otherwise 
the test will stop automatically.

*/
package pkgfinal.project.cit285;

//import java.util.*;
import static com.sun.glass.ui.Cursor.setVisible;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javax.swing.ButtonGroup;

public class CertificationExam  {
    final static int INDEX = 40;
    final static int rowPane = 0;
    static GridPane gridPane = new GridPane();
    static Text text1 = new Text();
    static Text  textCounter = new Text();
    static GridPane[] g; 
    static ToggleGroup group = new ToggleGroup();
    static ToggleButton buttonGroup = new ToggleButton();      //radio buttons, Text, and gridpane
    static Group[] gr = new Group[4];
    Scanner scanner = new Scanner(System.in);
    static  RadioButton[] b = new RadioButton[5];
   static First25Questions run = new First25Questions();
   static Thread start = new Thread(run);
   static DigitalClock cl = new DigitalClock(); 
   static  Thread clock = new Thread(cl);
   static String[] p; 
   static String[] title = new String[4];
   static double results, check, miss, results2, results3, finalResults;
   static  Button submit = new Button("Submit");
   static Button btn = new Button(" Next "); 
  //  static Text[] text1 = new Text[2];
    static int i = 0;
    static Thread t1;
    static Thread t2;                                        // multiple threads for each test
    static Thread t3;
    static Thread t4;
    static Thread[] selection = new Thread[4]; 
    static  int idx;
 
    public static void enter(){
    
  
    Stage window = new Stage();   
    window.initModality(Modality.APPLICATION_MODAL);
    window.setTitle("Java Test");
   
       
       p = new String[INDEX];
       ScrollPane scrollPane = new ScrollPane();
       
    gridPane.setHgap(5);
    gridPane.setVgap(5); 
    
   
     radio();
     start.run(); 
     
     //btn.setOnAction(e -> action());         // starting the clock
     clock.start();
     btn.setOnAction(new EventHandler<ActionEvent>(){
         {
         }
         @Override
        public void handle(ActionEvent event) { 
                 startScheduledExecutorService();
                 group();
                 action(); 
             if (i >= p.length)
           { i = 0; }  
             
         gridPane(); 
        g[0].add(run.text[0], 0, 0);
        g[1].add(run.text[1], 0, 0);
        g[2].add(run.text[2], 0, 0);
        g[3].add(run.text[3], 0, 0);
        g[4].add(run.text[4], 0, 0);                          //show the tests using gridpane
        g[5].add(run.text[5], 0, 0);
        g[6].add(run.text[6], 0, 0);
        g[7].add(run.text[7], 0, 0);
        g[8].add(run.text[8], 0, 0);
        g[9].add(run.text[9], 0, 0);
        g[10].add(run.text[10], 0, 0);
        g[11].add(run.text[11], 0, 0);
        g[12].add(run.text[12], 0, 0);
        g[13].add(run.text[13], 0, 0);
        g[14].add(run.text[14], 0, 0);        
          
        gridPane.add(g[i], 1, 2);   
         }
    
    });
 
      submit.setOnAction((new EventHandler<ActionEvent>(){  
        public void handle(ActionEvent event) { 
          testOver();
          testScore();
          nullTest2();
          btn.setVisible(false);
        }}));
   // gridPane.add(tz, 1, 2); 
    //gridPane.add(buttons[0], 1, 3);
     gridPane.add(cl, 1, 14);
     gridPane.add(textCounter, 1, 13);
   
    gridPane.add(btn, 1, 12);
    gridPane.add(submit, 2, 14);
            
    Scene scene = new Scene(gridPane,650, 650);    
    window.setScene(scene);
    window.showAndWait();
    }
    
    public static void gridPane() {
            g = new GridPane[15];
            g[0] = new GridPane();
            g[1] = new GridPane();
            g[2] = new GridPane();
            g[3] = new GridPane();
            g[4] = new GridPane();
            g[5] = new GridPane();
            g[6] = new GridPane();
            g[7] = new GridPane();
            g[8] = new GridPane();
            g[9] = new GridPane();
            g[10] = new GridPane();
            g[11] = new GridPane();
            g[12] = new GridPane();
            g[13] = new GridPane();
            g[14] = new GridPane();
    } 
 
   public static void start1() {
         t1 = new Thread(() -> {
            try {
                run.first();
            }catch(InterruptedException e) {
                
            }
        });    
       t1.start();
   }
   
  public static void start2(){
         t2 = new Thread(() -> {
            try {
                run.second();
            }catch(InterruptedException e) {
                
            }
        });    
        t2.start();
   }
  
    public static void start3() {
      
          t3 = new Thread(new Runnable() {
           @Override
           public void run() {
               try {
                  run.third();
                  
               }catch(InterruptedException e) {
               
           }                                               //starting multiple thread for each test
       }});  
    }
    
     public static void start3Wait() {
      
          t3 = new Thread(new Runnable() {
           @Override
           public void run() {
               try {
                  run.third();
                  
               }catch(InterruptedException e) {
               
           }
       }}); 
    }
    
     public static void start4() {
         
       t4 = new Thread(new Runnable() {
           @Override
           public void run() {
               try {
                  run.fourth();
                  
               }catch(InterruptedException e) {
               
           }
       }});
    
 }  
     
  public static void start4Wait() {
         
       t4 = new Thread(new Runnable() {
           @Override
           public void run() {
               try {
                  run.fourth();
                  
               }catch(InterruptedException e) {
               
           }
       }});
 }      
        
     
   public static void radio(){
       b[0] = new RadioButton();
       b[1] = new RadioButton(); 
       b[2] = new RadioButton();
       b[3] = new RadioButton();
       b[4] = new RadioButton("E");
       
       b[0].setText("A");
       b[1].setText("B");
       //b[1].setUserData("B");
       b[2].setText("C");
       //b[2].setUserData("C");
       b[3].setText("D");
      // b[3].setUserData("D");  
      
       b[0].setToggleGroup(group);
       b[1].setToggleGroup(group);
       b[2].setToggleGroup(group);
       b[3].setToggleGroup(group);  
       
             
}  
   
 public static void allThread(){
      start1();
                                                     
}    

   public static  void group(){
                                                            //condition each each test to take over , resetting by null function
         switch (First25Questions.random() ) {
            
            case  0 :
             if (group.getSelectedToggle() != null && group.getSelectedToggle() != b[0] && group.getSelectedToggle() != b[2]
                 && group.getSelectedToggle() != b[3]) {
                 nullTest();
                 start2();
                 check +=1;
             }
             else {
                  
                 nullTest();
                 start1();
                 miss +=1;
             }
               break; 
            
            case 1 :
             if (group.getSelectedToggle() != null && group.getSelectedToggle() != b[0] && group.getSelectedToggle() != b[1]
                 && group.getSelectedToggle() != b[2]) {
                 nullTest();
                 start2();  
                 check += 1;
             }
             else {
                  
                 nullTest();
                 start1();
                 miss += 1;
             }
               break; 
            
             case 2 :
             if (group.getSelectedToggle() != null && group.getSelectedToggle() != b[0] && group.getSelectedToggle() != b[2]
                 && group.getSelectedToggle() != b[3]) {
                 nullTest();     
                 start2();
                 check += 1;
                 
             }
             else {
                  
                 nullTest();
                 start1(); 
                 miss += 1;
                 
             }
               break; 
      
              case 3 :
             if (group.getSelectedToggle() != null && group.getSelectedToggle() != b[0] && group.getSelectedToggle() != b[1]
                 && group.getSelectedToggle() != b[3]) {
                 nullTest();
                 start2();
                 check += 1;
             }
             else {
                  
                 nullTest();
                 start1(); 
                 miss += 1;
             }
              break; 
             case 4 :
             if (group.getSelectedToggle() != null && group.getSelectedToggle() != b[1] && group.getSelectedToggle() != b[2]
                 && group.getSelectedToggle() != b[3]) {
                 nullTest();
                 start2();
                 check +=1;
             }
             else {
                  
                 nullTest();
                 start1(); 
                 miss += 1;
             }
              break; 
              
              
            case 5 :
                 if (group.getSelectedToggle() != null && group.getSelectedToggle() != b[0] && group.getSelectedToggle() != b[2]
                 && group.getSelectedToggle() != b[3]) {
                 nullTest();
                 start2();
                 check +=1;
             }
             else {
                  
                 nullTest();
                 start1();
                 miss +=1;
                 }
             break; 
             case 6 :
             if (group.getSelectedToggle() != null && group.getSelectedToggle() != b[0] && group.getSelectedToggle() != b[1]
                 && group.getSelectedToggle() != b[2]) {
                 start2();
                 check +=1;
             }
             else {
                 start1();
                 miss +=1;
             }
             break; 
             case 7 :
               if (group.getSelectedToggle() != null && group.getSelectedToggle() != b[0] && group.getSelectedToggle() != b[2]
                 && group.getSelectedToggle() != b[3]) {
                 nullTest();
                 start2();
                 check +=1;
             }
             else {
                  
                 nullTest();
                 start1();
                 miss+=1;
             }
            
            break; 
            case 8 :
            if (group.getSelectedToggle() != null && group.getSelectedToggle() != b[1] && group.getSelectedToggle() != b[2]
                 && group.getSelectedToggle() != b[3]) {
                 start2();
                 check+=1;        
             }
            else {
                  
                 nullTest();
                 start1();
                 miss +=1;
             }
            break;
            case 9 :
               if (group.getSelectedToggle() != null && group.getSelectedToggle() != b[0] && group.getSelectedToggle() != b[1]
                 && group.getSelectedToggle() != b[3]) {
                 nullTest();
                 start2();
                 check +=1;
             }
            else {
                  
                 nullTest();
                 start1();
                 miss +=1;
             }
            break; 
            case 10 :
              if (group.getSelectedToggle() != null && group.getSelectedToggle() != b[0] && group.getSelectedToggle() != b[2]
                 && group.getSelectedToggle() != b[3]) {
                 nullTest();
                 start2();
                 check +=1;
             }
             else {
                  
                 nullTest();
                 start1();
                 miss += 1;
             }
            break; 
            case 11 :
              if (group.getSelectedToggle() != null && group.getSelectedToggle() != b[1] && group.getSelectedToggle() != b[2]
                 && group.getSelectedToggle() != b[3]) {
                 nullTest();
                 start2();
                 check +=1;
             }
             else {
                  
                 nullTest();
                 start1();
                 miss +=1;
             }
            break; 
            
            case 12 :
             if (group.getSelectedToggle() != null && group.getSelectedToggle() != b[1] && group.getSelectedToggle() != b[2]
                 && group.getSelectedToggle() != b[3]) {
                 nullTest();
                 start2();
                 check +=1;
             }
             else {
                  
                 nullTest();
                 start1();
                 miss +=1;
             }
            break; 
              case 13 :
                 if (group.getSelectedToggle() != null && group.getSelectedToggle() != b[0] && group.getSelectedToggle() != b[2]
                 && group.getSelectedToggle() != b[3]) {
                 nullTest();
                 start2();
                 check +=1;
             }
             else {
                  
                 nullTest();
                 start1();
                 miss += 1;
             }
            break; 
           case 14 :
              if (group.getSelectedToggle() != null && group.getSelectedToggle() != b[0] && group.getSelectedToggle() != b[1]
                 && group.getSelectedToggle() != b[2]) {
                 nullTest();
                 start2();
                 check +=1;
             }
             else {  
                 nullTest();
                 start1();
                 miss +=1;
             }
            break; 
            case 15 :
              if (group.getSelectedToggle() != null && group.getSelectedToggle() != b[1] && group.getSelectedToggle() != b[2]
                 && group.getSelectedToggle() != b[3]) {
                 nullTest();
                 start2();
                 check +=1;
             }
             else {  
                 nullTest();
                 start1();
                 miss +=1;
             }
            break; 
            case 16 :
              if (group.getSelectedToggle() != null && group.getSelectedToggle() != b[0] && group.getSelectedToggle() != b[2]
                 && group.getSelectedToggle() != b[3]) {
                 nullTest();
                 start2();
                 check +=1;
             }
             else {  
                 nullTest();
                 start1();
                 miss +=1;
             }
            break; 
            case 17 :
              if (group.getSelectedToggle() != null && group.getSelectedToggle() != b[0] && group.getSelectedToggle() != b[1]
                 && group.getSelectedToggle() != b[3]) {
                 nullTest();
                 start2();
                 check +=1;
             }
             else {  
                 nullTest();
                 start1();
                 miss +=1;
             }
            break; 
            case 18 :
              if (group.getSelectedToggle() != null && group.getSelectedToggle() != b[0] && group.getSelectedToggle() != b[1]
                 && group.getSelectedToggle() != b[2]) {
                 nullTest();
                 start2();
                 check +=1;
             }
             else {  
                 nullTest();
                 start1();
                 miss =+ 1;
             }
            break; 
            case 19 :
              if (group.getSelectedToggle() != null && group.getSelectedToggle() != b[0] && group.getSelectedToggle() != b[2]
                 && group.getSelectedToggle() != b[3]) {
                 nullTest();
                 start2();
                 check +=1;
             }
             else {  
                 nullTest();
                 start1();
                 miss += 1;
             }
            break; 
            case 20 :
              if (group.getSelectedToggle() != null && group.getSelectedToggle() != b[1] && group.getSelectedToggle() != b[2]
                 && group.getSelectedToggle() != b[3]) {
                 nullTest();
                 start2();
                 check +=1;
             }
             else {  
                 nullTest();
                 start1();
                 miss +=1;
             }
            break; 
            
           default :  nullTest(); start1();
              
        } 
     results = (check -miss)/(check +miss);
     results2 = 1-results;
     results3 = miss*results2 + miss; 
     finalResults = check * miss - results3;
     
   }
   
   public static double testScore(){
      String s = Double.toString(finalResults);
      Label label = new Label();
      label.setText(s);
      label.setFont(new Font("Cambria", 15));
      gridPane.add(label, 2, 1);
       
       return finalResults;
   } 
   
   public static void testOver(){
       Label label = new Label();
       
      i = (int) finalResults;
      if (i >= 65 && i <= 74.9){
      title[0] = "Java Certified Programmer";    
      label.setText(title[0]); 
      label.setFont(new Font("Cambria", 20));
      gridPane.add(label, 2, 0);    
      } 
      else if (i >= 75 && i <= 84.9){
      title[1] = "Java Certified Developer";    
      label.setText(title[1]);
      label.setFont(new Font("Cambria", 20));
      gridPane.add(label, 2, 0);
      }
      else if ( i >= 85){
      title[2] = "Java Certified Architect";    
      label.setText(title[2]); 
      label.setFont(new Font("Cambria", 20));
      gridPane.add(label, 2, 0);
      }
      else if (i < 64.9){
      title[3] = "Sorry, you did not past-try again!";   
      label.setText(title[3]); 
      label.setFont(new Font("Cambria", 20));
      gridPane.add(label, 2, 0);  
      }
        
   }
       
   
   public static void nullTest(){
    
      First25Questions.text[0].setText(null);
      First25Questions.text[2].setText(null);
      First25Questions.text[3].setText(null);
      First25Questions.text[4].setText(null);
      First25Questions.text[5].setText(null);
      First25Questions.text[6].setText(null);
      First25Questions.text[7].setText(null);
      First25Questions.text[8].setText(null);
      First25Questions.text[9].setText(null);
      First25Questions.text[10].setText(null);
      First25Questions.text[11].setText(null);
      First25Questions.text[12].setText(null);
      First25Questions.text[13].setText(null);  
     
 } 
   
 public static void nullTest2(){
    
      First25Questions.text[0].setText(null);
      First25Questions.text[2].setText(null);
      First25Questions.text[3].setText(null);
      First25Questions.text[4].setText(null);
      First25Questions.text[5].setText(null);
      First25Questions.text[6].setText(null);
      First25Questions.text[7].setText(null);
      First25Questions.text[8].setText(null);
      First25Questions.text[9].setText(null);
      First25Questions.text[10].setText(null);
      First25Questions.text[11].setText(null);
      First25Questions.text[12].setText(null);
      First25Questions.text[13].setText(null);  
      
       b[0].setVisible(false);
       b[1].setVisible(false); 
       b[2].setVisible(false);
       b[3].setVisible(false);
       b[4] = new RadioButton("E");
       btn.setVisible(false);
 } 
  

public static void action(){     
        gr[0] = new Group();
        gr[1] = new Group();
        gr[2] = new Group();
        gr[3] = new Group();


        gr[0].getChildren().add(b[0]);
        gr[1].getChildren().add(b[1]);
        gr[2].getChildren().add(b[2]);
        gr[3].getChildren().add(b[3]);
          
        gridPane.add(gr[0], 1, 3);
        gridPane.add(gr[1], 1, 4);
        gridPane.add(gr[2], 1, 5);
        gridPane.add(gr[3], 1, 6);   
       
} 

    private static void startScheduledExecutorService(){

   final ScheduledExecutorService scheduler   = Executors.newScheduledThreadPool(1);
         scheduler.scheduleAtFixedRate(
                new Runnable(){
                                      
                    int counter = 0;  
                    long milli = 600000;
                    @Override
                    public void run() {
                        try {
                            
                            Thread.sleep(milli);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(CertificationExam.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        counter++;
                        if(milli <=0){
                            
                            Platform.runLater(new Runnable(){
                                @Override
                                public void run() {
                                   Platform.isFxApplicationThread();
                                   
                                }
                            });
                            
                            
                        }else{
                            scheduler.shutdown();
                            Platform.runLater(new Runnable(){
                                @Override
                                public void run() {
                                    testOver();
                                    testScore();
                                    nullTest2();
                                    Platform.isAccessibilityActive();
                                    
                                    
                                    
                                }
                            });
                        }
                         
                    }
                }, 
                1, 
                1, 
                TimeUnit.SECONDS);      
    }
}
        
    