package arrays;

public class celebrityProblem {
    public static void main(String[] args) {
        int [][] Tarr={ {0, 1, 0},
                    {0, 0, 0},            //2d arr
                    {0, 0, 0}
                  };

    for(int i=0;i<Tarr.length;i++){      //loop for rows
               boolean KnowsNoBody =true;
        boolean KnownByEveryOne=true;
        for(int j=0; j<Tarr[i].length;j++){// loop for column
       
           if(Tarr[i][j]==1){   //check row
           KnowsNoBody=false;  
           }
           if(Tarr[j][i]==1){
            KnownByEveryOne=false; //check column
           }
        }
        if(KnownByEveryOne&&KnowsNoBody){  //if both are true 
            System.out.println("Celebrity found!! "+i);
        }else{
            System.out.println("no Celb...!!!!");
        }
    }
}
}
//tc o(n2)
//sc o(1)