package pkgfinal.project.cit285;
import java.io.IOException;
import java.net.URL;
import javafx.animation.*;
import javafx.event.*;
import javafx.scene.control.Label;
import javafx.util.Duration;

import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
 
class DigitalClock extends Label implements Runnable {
    
  // the digital clock updates once a second.
  private void bindToTime() {
    Timeline timeline = new Timeline(
      new KeyFrame(Duration.seconds(0),
        new EventHandler<ActionEvent>() {
          @Override public void handle(ActionEvent actionEvent) {
            Calendar time = Calendar.getInstance();
            String hourString = StringUtilities.pad(2, ' ', time.get(Calendar.HOUR) == 0 ? "12" : time.get(Calendar.HOUR) + "");
            String minuteString = StringUtilities.pad(2, '0', time.get(Calendar.MINUTE) + "");
            String secondString = StringUtilities.pad(2, '0', time.get(Calendar.SECOND) + "");
            String ampmString = time.get(Calendar.AM_PM) == Calendar.AM ? "AM" : "PM";
            setText(hourString + ":" + minuteString + ":" + secondString + " " + ampmString);
          }
        }
      ),
      new KeyFrame(Duration.seconds(1))
    );
    timeline.setCycleCount(Animation.INDEFINITE);
    timeline.play();
  }

    @Override
    public void run() {
      try {
          Thread.sleep(1000);
          bindToTime();
      } catch (InterruptedException ex) {
          Logger.getLogger(DigitalClock.class.getName()).log(Level.SEVERE, null, ex);
      }
       ;
        
    }
}

  class StringUtilities {
  
  public static String pad(int fieldWidth, char padChar, String s) {
    StringBuilder sb = new StringBuilder();
    for (int i = s.length(); i < fieldWidth; i++) {
      sb.append(padChar);
    }
    sb.append(s);

    return sb.toString();
  }
}

