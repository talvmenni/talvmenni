package org.forritan.talvmenni.ui;

import org.forritan.talvmenni.ChessEngine;


public abstract class UiProtocolBase implements UiProtocol {

   protected ChessEngine.Protocol protocol;

   public UiProtocolBase(
         ChessEngine.Protocol protocol) {
      this.protocol= protocol;
   }
}