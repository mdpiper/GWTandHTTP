package edu.colorado.mpiper.client;

import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * A template for all tests.
 * 
 * @author Mark Piper (mark.piper@colorado.edu)
 */
public class TestTemplate extends VerticalPanel {

  protected HTML header;
  protected Grid grid;
  
  public TestTemplate() {
    
    header = new HTML("Test: ");
    header.getElement().getStyle().setFontSize(150, Unit.PCT);
    header.getElement().getStyle().setMarginBottom(5, Unit.PX);
    
    grid = new Grid(2, 2);
    grid.setWidget(0, 0, new HTML("<b>Call:</b>"));
    grid.setWidget(1, 0, new HTML("<b>Response:</b>"));
    
    this.add(header);
    this.add(grid);
    this.add(new HTML("<br>"));
  }

  /**
   * Sets the text received from an asynchronous HTTP request in the main test
   * page.
   * 
   * @param response the text received from the server
   */
  public void setResponse(String response) {
    HTML r = (HTML) grid.getWidget(1, 1);
    r.setHTML(response);
  }  
}