package org.forritan.talvmenni.ui;

public class XboardProtocol implements UiProtocol {

   public String processInput(String theInput) {
      String theOutput= null;

      if (theInput.equalsIgnoreCase("protover 2")) {
         theOutput= "feature usermove=1 "
               + "time=0 "
               + "sigint=0 "
               + "sigterm=0 "
               + "analyze=0 "
               + "myname=\"TALVMENNI v 0.1\""
               + "done=1";
      }

      if (theInput.startsWith("usermove")) {
         theOutput= "isAmove";
      }

      return theOutput;

   }

}