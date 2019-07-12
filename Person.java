import javafx.application.Application;
import javafx.scene.canvas.Canvas;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.stage.Stage;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.shape.ArcType;
import javafx.scene.paint.*;
import javafx.scene.image.Image;

public class Person extends Application
{	
	private static final String LOC_SNAPBACK = "https://i.ibb.co/WHBPzCW/snapback.png";
	//private static final String LOC_SNAPBACK = "person/snapback.png";
	final Image img_snapback = new Image(LOC_SNAPBACK);
	
	private static final String LOC_GIGS = "https://i.ibb.co/SR1FFMJ/gigs.png";
	//private static final String LOC_GIGS = "person/gigs.png";  
	final Image img_gigs = new Image(LOC_GIGS);  
	
	private static final String LOC_BLING = "https://i.ibb.co/pdtc3sc/bling.png";
	//private static final String LOC_BLING = "person/bling.png";
	final Image img_bling = new Image(LOC_BLING);  
	
	private static final String LOC_BELT = "https://i.ibb.co/zFs9sQs/belt.png";
	//private static final String LOC_BELT = "person/belt.png";
	final Image img_belt = new Image(LOC_BELT);   
	
	private static final String LOC_L_SHOE = "https://i.ibb.co/2ttVzDt/left-shoe.png";
	//private static final String LOC_L_SHOE = "person/left_shoe.png";
	final Image img_left_shoe = new Image(LOC_L_SHOE);  

	private static final String LOC_R_SHOE = "https://i.ibb.co/SmwKwbC/right-shoe.png";
	//private static final String LOC_R_SHOE = "person/right_shoe.png";
	final Image img_right_shoe = new Image(LOC_R_SHOE); 


	public static void main (String[] args)
	{
		launch(args);
	}	

	public void start(Stage primaryStage) throws Exception
	{
		Group root =new Group();
		Scene scene=new Scene(root);
		Canvas canvas=new Canvas(400,600);//l,w
		GraphicsContext Gc=canvas.getGraphicsContext2D();

		Gc.beginPath();
		Gc.moveTo(253,301);
		Gc.bezierCurveTo(249,280,244,267,239,249);
		Gc.bezierCurveTo(240,242,240,235,241,225);
		Gc.lineTo(249,241);
		Gc.bezierCurveTo(250,253,252,274,253,301);
		Gc.lineTo(245,319);
		Gc.lineTo(245,338);
		Gc.lineTo(248,330);
		Gc.lineTo(253,320);
		Gc.lineTo(253,338);
		Gc.lineTo(242,352);
		Gc.lineTo(245,352);
		Gc.lineTo(261,335);
		Gc.bezierCurveTo(265,315,268,283,271,260);
		Gc.lineTo(270,225);
		Gc.bezierCurveTo(267,213,264,187,261,169);
		Gc.arcTo(259,162,257,158,10);
		Gc.bezierCurveTo(245,150,231,142,215,130);
		Gc.lineTo(211,118);
		Gc.lineTo(218,111);
		Gc.bezierCurveTo(219,104,220,95,220,80);
		
		Gc.arc(198.5,80,21.5,21.5,0,180);//
		
		Gc.bezierCurveTo(177,95,178,104,179,111);
		Gc.lineTo(186,118);
		Gc.lineTo(182,130);
		Gc.bezierCurveTo(164,142,153,150,140,158);
		Gc.arcTo(137,162,135,169,10);
		Gc.bezierCurveTo(132,187,129,213,126,225);
		Gc.lineTo(125,260);
		Gc.bezierCurveTo(130,283,134,315,135,335);

		Gc.lineTo(153,352);
		Gc.lineTo(156,352);
		Gc.lineTo(145,338);
		Gc.lineTo(145,320);
		Gc.lineTo(150,330);
		Gc.lineTo(153,338);
		Gc.lineTo(153,319);

		Gc.lineTo(145,301);
		Gc.bezierCurveTo(146,274,148,253,149,241);
		Gc.lineTo(157,225);
		Gc.bezierCurveTo(158,235,158,242,159,249);
		Gc.bezierCurveTo(155,267,150,280,145,301);

		Gc.lineTo(153,319);
		Gc.lineTo(153,338);
		Gc.lineTo(150,330);
		Gc.lineTo(145,320);
		Gc.lineTo(145,338);
		Gc.lineTo(156,352);
		Gc.lineTo(153,352);	
		
		//left leg
		
		Gc.bezierCurveTo(154,337,157,398,158,440);
		Gc.bezierCurveTo(159,465,160,483,164,498);
		Gc.lineTo(163,512);
		Gc.lineTo(164,520);//arc
		
		//Baseline
		Gc.bezierCurveTo(162,523,159,534,155,540);//152,542
		Gc.lineTo(184,540);//187,542
							
		Gc.bezierCurveTo(180,534,179,527,178,517);
		Gc.lineTo(178,506);//arc
		Gc.lineTo(178,488);
		Gc.bezierCurveTo(180,465,182,447,185,416);
		Gc.bezierCurveTo(187,396,192,363,198,330);
		
		//next leg
		Gc.bezierCurveTo(204,365,209,396,211,416);
		Gc.bezierCurveTo(214,447,216,465,218,488);
		Gc.lineTo(218,506);
		Gc.lineTo(218,527);//arc

		//Baseline
		Gc.bezierCurveTo(217,527,216,534,212,540);
		Gc.lineTo(241,540);

		Gc.bezierCurveTo(239,534,238,528,237,522);
		Gc.lineTo(233,512);//arc
		Gc.lineTo(233,498);
		Gc.bezierCurveTo(235,483,238,465,240,440);
		Gc.bezierCurveTo(242,398,244,377,246,352);

		Gc.stroke();

		Gc.drawImage(img_snapback,169,47,59,38);
		
		Gc.drawImage(img_gigs,180,85,38,18);
		
		Gc.drawImage(img_bling,172,133.5,56,82);
		
		Gc.drawImage(img_belt,147.5,288.5,105,28);

		Gc.drawImage(img_right_shoe,149,490,42,65);
	
		Gc.drawImage(img_left_shoe,206,490,42,65);

		root.getChildren().add(canvas);
		primaryStage.setTitle("Person JavafX");
		primaryStage.getIcons().add(new Image("https://i.ibb.co/vHcqZ0c/icon.png"));
		primaryStage.setScene(scene);
		primaryStage.show();

	}
}