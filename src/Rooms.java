import java.util.Random;

public class Rooms {

   
    public static void noOfRooms() {
        System.out.println("INPUT\t\t\t\t\t\t\tOUTPUT");
        System.out.println();
        System.out.println("M\tN\tK\tCORRECTLY WIRED\t\tROOMS" );


        for(int T =1;T<=20;T++){

            Random r =new Random();

               //1<=K<=M<=10*6//
               //1<N<10*6//

            //RANDOM NO OF FLOORS//
               int M =r.nextInt(10*6 - 1) +1;

               //RANDOM NO OF ROOMS//
               int N =r.nextInt(10*6 -1) +1;

               //RANDOM NO OF MAIN SWITCHES TO BE TURNED OFF//

               int K =r.nextInt(M -1 ) +1;


               int incorrect =0;
               int sumOfIncorrect=0;
               int correct =0;
               int sumOfCorrect=0;

              for(int i=1; i<=M; i++){
                  //NUMBER OF ROOMS CORRECTLY WIRED IN EACH FLOOR//
                  int C =r.nextInt(N -0)+ 0;

                  //INCORRECTLY WIRED ROOMS IN EACH FLOOR//
                  int x=N-C;

                  correct=C;

                  incorrect=x;
              }

              //MAX NO OF ROOMS TO RECEIVE POWER//
               System.out.println(M+"\t"+N+"\t"+K+"\t"+correct+"\t\t\t\t\t"+((K*incorrect)+((M-K)*correct)));
        }
    }

    public static void main(String[] args) {
        noOfRooms();
    }
}
