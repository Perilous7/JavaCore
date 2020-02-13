package dataStructure;

public class paige {
   // int[] agencyLevel = input.getAgencyLevel();

    public static void main(String[] args) {
        int[] agencyLevel = {5};
        if (agencyLevel.length==1){
            int range = agencyLevel[0];
            agencyLevel = new int[range];
            for (int i =1;i<=range;i++){
                agencyLevel[i-1]=i;
            }
        }
        System.out.println(agencyLevel);
    }
}
