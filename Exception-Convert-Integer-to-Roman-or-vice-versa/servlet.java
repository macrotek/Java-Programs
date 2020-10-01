import java.awt.*;
import java.applet.*;


public class exp1 extends Applet
{
		TextField txtF;
		TextArea txtA;
		Button b;
		Label lbl;
		Label about;
		public void init()
		{
			txtF=new TextField();
			txtA=new TextArea();
			b=new Button("submit");
			lbl=new Label("Name please");
			about=new Label("about your self");
			add(lbl);
			add(txtF);
			add(about);
			add(txtA);
			add(b);
		
		
			
		}
		/*<applet code="exp1.class" height=100 width=200></applet>*/
		

}

