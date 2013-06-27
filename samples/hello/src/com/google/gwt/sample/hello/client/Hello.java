/*
 * Copyright 2007 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.google.gwt.sample.hello.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.FormPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.FormPanel.ResetEvent;
import com.google.gwt.user.client.ui.FormPanel.ResetHandler;
import com.google.gwt.user.client.ui.FormPanel.SubmitHandler;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.FormPanel.SubmitEvent;

/**
 * HelloWorld application.
 */
public class Hello implements EntryPoint {

  public void onModuleLoad() {
    
    
    HTMLPanel hp = new HTMLPanel("asd");
    
    hp.add(new CheckBox());
    
    final FormPanel fp = new FormPanel();
    
    fp.add(hp);
    
    fp.addSubmitHandler(new SubmitHandler() {
      
      @Override
      public void onSubmit(SubmitEvent event) {
        
        Window.alert("onSubmit");
        
      }
    });
    
    fp.addResetHandler(new ResetHandler() {
      
      @Override
      public void onReset(ResetEvent event) {
        
        Window.alert("onReset");
        
      }
    });
    
    
    Button r = new Button("reset-gwt", new ClickHandler() {
      public void onClick(ClickEvent event) {
        fp.reset();
      }
    });
    
    Button s = new Button("submit-gwt", new ClickHandler() {
      public void onClick(ClickEvent event) {
        fp.submit();
      }
    });
    
    
    hp.add(r);
    hp.add(s);
    
    SafeHtmlBuilder sh = new SafeHtmlBuilder();
    sh.appendHtmlConstant("<input type=\"reset\" value=\"reset-html\">");
    sh.appendHtmlConstant("<input type=\"submit\" value=\"submit-html\">");
    HTML h = new HTML();
    h.setHTML(sh.toSafeHtml());
    hp.add(h);
    
    RootPanel.get().add(fp);
  }
}
