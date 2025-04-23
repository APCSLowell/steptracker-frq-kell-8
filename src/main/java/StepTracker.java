import java.util.ArrayList;
public class StepTracker
{
 private ArrayList <Integer> steps;
 private int goal;
 public StepTracker(int g){
  steps = new ArrayList<Integer>();
  goal = g;
 }
 public void addDailySteps(int s){
  steps.add(s);
 }
 public int activeDays(){
  int count = 0;
  for (int d: steps){
   if (d >= goal){
    count++;
   }
  }
  return count;
 }
 public double averageSteps(){
  if (steps.size() == 0){
   return 0;
  }
  double total = 0.0;
  for (int i = 0; i < steps.size(); i++){
    total+=steps.get(i);
  }
  return total/steps.size();
 }
} 
