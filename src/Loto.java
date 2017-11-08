import java.util.Random;

public class Loto {

    public static void main(String[] args) {
        int[] agencyTicket = new int[6];
        int[] myTicket = new int[6];
        int foundNumbers = 0;
        int counterTickets = 0;
        int wantedNumbers = 4;

        //generez sirul agentiei, 6 nr diferite

        for (int i = 0; i < 6; i++) {
            agencyTicket[i] = new Random().nextInt(49) + 1;
        }

        for (int i = 0; i < 6; i++) {
            agencyTicket[i] = new Random().nextInt(49) + 1;
            for (int j = i - 1; j >= 0; j--) {
                while (agencyTicket[i] == agencyTicket[j]) {
                    agencyTicket[i] = new Random().nextInt(49) + 1;
                    j = i - 1;
                }
            }
        }

        //printeaza biletul agentiei

        System.out.println("Agency's ticket contains: ");
        for (int i = 0; i < 6; i++) {
            System.out.println(agencyTicket[i]);
        }


        //bucla while: atat timp cat nu am un bilet cu minim 4 nr ghicite fac ce-i mai jos

        while (foundNumbers < wantedNumbers) {
            foundNumbers = 0;

            //generez sirul meu, 6 nr diferite
            for (int k = 0; k < 6; k++) {
                myTicket[k] = new Random().nextInt(49) + 1;
                for (int m = 0; m < k; m++) {
                    while (myTicket[k] == myTicket[m]) {
                        myTicket[k] = new Random().nextInt(49) + 1;
                        m = 0;
                    }

                }
            }

            //gasesc cate am ghicite
            for (int k = 0; k < 6; k++) {
                for (int m = 0; m < 6; m++) {
                    if (myTicket[k] == agencyTicket[m]) {
                        foundNumbers++;
                    }
                }
            }

            //incrementez cu 1 nr de bilete simple jucate
            counterTickets++;

        }   //gata bucla while


        //printeaza biletul meu castigator

        System.out.println("My ticket contains: ");
        for (int k = 0; k < 6; k++) {
            System.out.println(myTicket[k]);
        }

        //afisez cate bilete am jucat

        System.out.println("Am jucat " + counterTickets + " bilete. Am " + foundNumbers + " numere gasite.");

    }
}

