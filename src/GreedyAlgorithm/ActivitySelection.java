package GreedyAlgorithm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class ActivitySelection {

    public static class Activity{
        int start;
        int finish;
        public Activity(int start,int finish){
            this.start=start;
            this.finish=finish;
        }
    }
    public static void main(String[] args) {
        ArrayList<Activity> activities=new ArrayList<>();
        activities.add(new Activity(8,9));
        activities.add(new Activity(5,9));
        activities.add(new Activity(1,2));
        activities.add(new Activity(3,4));
        activities.add(new Activity(0,6));
        activities.add(new Activity(5,7));

        selectActivity(activities);
    }

    public static void selectActivity(ArrayList<Activity> activityArrayList){
        Collections.sort(activityArrayList,new CustomComparator());
        for(int i=0;i<activityArrayList.size();i++){
            System.out.println("("+activityArrayList.get(i).start+","+activityArrayList.get(i).finish+")");
        }

    }

    private static class CustomComparator implements Comparator<Activity>{
        @Override
        public int compare(Activity o1, Activity o2) {
            return o1.finish-o2.finish;
        }
    }

}
