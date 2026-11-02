package arrays;

public class celebrityProblem {
    public static void main(String[] args) {
        int [][] Tarr={ {0, 1, 1},
                    {0, 0, 1},
                    {0, 0, 0}
                  };

    for(int i=0;i<Tarr.length;i++){
               boolean KnowsNoBody =true;
        boolean KnownByEveryOne=true;
        for(int j=0; j<Tarr[i].length;j++){
       
           if(Tarr[i][j]==1){
           KnowsNoBody=false;
           }
           if(Tarr[j][i]==1){
            KnownByEveryOne=false;
           }
        }
        if(KnownByEveryOne&&KnowsNoBody){
            System.out.println("Celebrity found!! "+"i");
        }else{
            System.out.println("no Celb...!!!!");
        }
    }
}
}
