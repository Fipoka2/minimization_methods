package com.fipoka2.method;

// My function 3 * u1 * u2 + u1 *u1 - u2 * u2
 public class Method {

  private double u1;

  private double u2;

  private double eps;

  private double getDfdu1(double u1,double u2){
   return (3 * u2 +2 * u1);
  }

  private double getDfdu2(double u1,double u2){
   return (3 * u1 - 2 * u2);
  }

  public void calculateByNewtonMethod(){

   int k = 0;
   double gradient;
   do {

    k++;
    double du1 = getDfdu1(u1, u2);
    double du2 = getDfdu2(u1, u2);
    u1 -= 0.5 * du1;
    u2 -= 0.5 * du2;
    gradient = Math.sqrt(Math.pow(getDfdu2(u1, u2), 2) + Math.pow(getDfdu2(u1, u2), 2));

   } while (gradient > eps);
   System.out.println(k);

  }

 public Method(double u1, double u2, double eps) {
  this.u1 = u1;
  this.u2 = u2;
  this.eps = eps;
 }

 public double getU1() {
  return u1;
 }

 public void setU1(double u1) {
  this.u1 = u1;
 }

 public double getU2() {
  return u2;
 }

 public void setU2(double u2) {
  this.u2 = u2;
 }

 public double getEps() {
  return eps;
 }

 public void setEps(double eps) {
  this.eps = eps;
 }

 private void display(int k,double u1, double u2){

      

 }
}
