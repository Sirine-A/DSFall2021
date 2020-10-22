/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assg1;

/**
 *
 * @author hp
 */
public class CIRcle {
     private double radius;
 private String color;
 public CIRcle()
 {radius=1.0;color="red";}
 public CIRcle(double radius,String color)
 {this.radius=radius;
 this.color=color;}
 public void setradius(double radius)
 {this .radius=radius;}
 public double getradius()
 {return radius;}
 public void setcolor(String color)
 {this.color=color;}
 public String getcolor()
 {return color;}
 public double getArea()
 {return radius*radius*Math.PI;}
 public void print()
 {System.out.println("the Circle has radius of"+radius);
 }
 class TestCircle{
 public void main(String[]args){
  CIRcle C1=new CIRcle(1.0,"red");
  System.out.println("the Circle has radius of"+C1.getradius()+"and color"+C1.getcolor());
  CIRcle C2=new CIRcle(2.0,"blue");
  System.out.println("the Circle has radius of"+C2.getradius()+"and color"+C2.getcolor());
  CIRcle C3=new CIRcle(3.0,"green");
  System.out.println("the Circle has radius of"+C3.getradius()+"and color"+C3.getcolor());
 }
 }}
    
    

