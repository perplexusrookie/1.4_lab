public class StepTracker{
    public static void main(String[] args){
        StepTracker st = new StepTracker();
        st.showDays(7);
        st.totalSteps(10);
        System.out.println(st.dayLabels(10));
        st.experiment();
    } 


    public void showDays(int days){
        for (int day = 1; day <= days; day ++){ //initial condition, boolean condition, iterator
            System.out.println("day: "+day);
        }

        System.out.println("Loop finished");
    }

    //accumulator: to accumulatr a valiur and return

    public int totalSteps(int days){
        int total = 0;
        for(int day = 1; day <= days; day++){
            total += day * 1000;
            System.out.println("day: "+day+"\nstep totals: "+total);
        }
        return total;
    }

    //string accumulator
    public String dayLabels(int days){
        String labels = "";
        for(int day = 1; day <= days; day++){
            if(day>1){
                labels += ", ";
            }
            labels += "Day "+ day;
        }
        return labels;
    }

    public void experiment(){

        for (int i = 1000; 1 > 0; i--){
            System.out.println("All work and no play makes Jack a dull boy");
        }
    }
}