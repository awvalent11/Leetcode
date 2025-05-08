import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

class Solution {
    public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> nums) {
        ArrayList<ArrayList<Integer>> holderArray = new ArrayList<ArrayList<Integer>>();
        holderArray.add(nums);

        for(int i=0; i<holderArray.size(); i++){
            ArrayList<Integer> legacyArray = holderArray.get(i);
            ArrayList<Integer> copylegacyArray = holderArray.get(i);
            System.out.println("Checkpoint 1:");
            System.out.println(legacyArray);
            for(int j=0; j<legacyArray.size(); j++){

                ArrayList<Integer> permuatedArray = permuateList(copylegacyArray);                ArrayList<Integer> newArray = new ArrayList<>();
                System.out.println("Checkpoint 2:");
                System.out.println(newArray);
                System.out.println(legacyArray);
                System.out.println(copylegacyArray);
                for(int k=0; k<permuatedArray.size(); k++){
                    System.out.println("Checkpoint 3:");
                    System.out.println(permuatedArray.get(k));
                    System.out.println(holderArray);
                    if(!permuatedArray.get(k).equals(copylegacyArray.get(k))){
                        holderArray.add(newArray);
                    }
                }
            }
        }
        return holderArray;
    }

    public ArrayList<Integer> permuateList(ArrayList<Integer> nums){
        ArrayList<Integer> arrayToBuild = new ArrayList<>();
        Random random = new Random();
        while(!nums.isEmpty()){
            int randomIndex = random.nextInt(nums.size());
            arrayToBuild.add(nums.get(randomIndex));
            nums.remove(randomIndex);
        }
        return arrayToBuild;
    }
}
