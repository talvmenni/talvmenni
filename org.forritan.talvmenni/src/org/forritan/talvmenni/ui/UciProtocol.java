/**
 * talvmenni - A distributed chess-engine implemented in Java(TM)
 * and against Sun Microsystems Jini/JavaSpaces(TM).
 *  
 * Copyright (C) 2004-2006 Eyðun Lamhauge and Eyðun Nielsen
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied. See the License for the specific language governing
 * permissions and limitations under the License. 
 */

package org.forritan.talvmenni.ui;

import org.forritan.talvmenni.ChessEngine.Protocol;


public class UciProtocol extends UiProtocolBase {

   private static UciProtocol instance;

   private UciProtocol(
         Protocol protocol) {
      super(
            protocol);
   }

   public static UciProtocol create(
         Protocol protocol) {
      if (UciProtocol.instance == null) {
         UciProtocol.instance= new UciProtocol(
               protocol);
      }
      return UciProtocol.instance;
   }

   public String processInput(
         String theInput) {
      String theOutput= "";
      if (theInput.equalsIgnoreCase("isready")) {
         theOutput+= "readyok";
   } else if (theInput.equalsIgnoreCase("ucinewgame")) {
      this.protocol.newGame();
   }
      
      
      return theOutput;

   }
}


