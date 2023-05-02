package day44_FinalAndHiding;

public class FinalExample {

  public final int X;//final old. için buyuk yazılır X
 // public final int X=5;//final old. için buyuk yazılır X
  public int y;
    {
        X=5;
    }
    FinalExample(){
        //X=5;
    }
    FinalExample(int y){
       //X=5;
        this.y=y;
    }


    int method(){
        final int Z=5;
       // this.x=this.x+2;//final dediğimiz için x sikıntı oldu x değişmez artık
      //  X=X+2;
        return this.X*5*Z;//metod bittiğinde z de biter metod içinde önemli
    }

}
